import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionCalculatorWithCounter extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, clearButton;
    private JLabel addCountLabel, clearCountLabel;
    private int addClickCount = 0;
    private int clearClickCount = 0;

    public AdditionCalculatorWithCounter() {
        setTitle("Addition Calculator with Click Counter");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Create components
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
        addCountLabel = new JLabel("Add clicks: 0");
        clearCountLabel = new JLabel("Clear clicks: 0");

        // Add components to the frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(clearButton);
        add(addCountLabel);
        add(clearCountLabel);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumbers();
                updateAddClickCount();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
                updateClearClickCount();
            }
        });
    }

    private void addNumbers() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = num1 + num2;
            resultField.setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        num1Field.setText("");
        num2Field.setText("");
        resultField.setText("");
    }

    private void updateAddClickCount() {
        addClickCount++;
        addCountLabel.setText("Add clicks: " + addClickCount);
    }

    private void updateClearClickCount() {
        clearClickCount++;
        clearCountLabel.setText("Clear clicks: " + clearClickCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdditionCalculatorWithCounter().setVisible(true);
            }
        });
    }
}
