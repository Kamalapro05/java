interface Solid {

     double calculateVolume();

    default void displayVolume() {
        System.out.println("Volume: " +calculateVolume());
    }
}

class Cylinder implements Solid {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
   public double calculateVolume() {
        return Math.PI*radius*radius*height;
    }
}

class Sphere implements Solid {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
   public double calculateVolume() {
        return (4.0 / 3.0)*Math.PI*radius*radius*radius;
    }
}
public class democlass{
    public static void main(String[] args){
        Solid cylinder=new Cylinder(2.0,6.0);
        System.out.println("cylinder");
        cylinder.displayVolume();
        Solid sphere=new Sphere(9.0);
        System.out.println("sphere");
        sphere.displayVolume();
}
}

