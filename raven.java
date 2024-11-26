import java.util.Scanner;

class Reverse {
    int n, rev = 0, rem = 0;


    Reverse(int x) {
        n = x;
    }

    public void reverseNumber() {
        while (n != 0) {
            rem = n % 10;        
            rev = rev * 10 + rem; 
            n = n / 10;           
        }
        System.out.println("Reversed Number: " + rev);
    }
}

public class raven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int a = in.nextInt();     
        Reverse sm = new Reverse(a);
        sm.reverseNumber();       

        in.close();              
    }
}