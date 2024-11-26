// wap in java to display the additon of two number by clicking on add button clears the screen on clear impliment frame show the number of times the user click on the button using frame but all the button shown in the right side
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionCalculatorWithRightButtons extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, clearButton;
    private JLabel addCountLabel, clearCountLabel;
    private int addClickCount = 0;
    private int clearClickCount = 0;

    public AdditionCalculatorWithRightButtons() {
        setTitle("Addition Calculator with Right-side Buttons");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        
        JPanel leftPanel = new JPanel(new GridBagLayout());
        JPanel rightPanel = new JPanel(new GridLayout(4, 1, 5, 5));

        
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


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        leftPanel.add(num1Label, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        leftPanel.add(num1Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        leftPanel.add(num2Label, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        leftPanel.add(num2Field, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        leftPanel.add(resultLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        leftPanel.add(resultField, gbc);

        // Add components to the right panel
        rightPanel.add(addButton);
        rightPanel.add(clearButton);
        rightPanel.add(addCountLabel);
        rightPanel.add(clearCountLabel);


        add(leftPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);


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
                new AdditionCalculatorWithRightButtons().setVisible(true);
            }
        });
    }
}
