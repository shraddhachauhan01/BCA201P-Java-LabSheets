import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q07 extends JFrame implements ActionListener {
    JTextField temperature;
    JRadioButton cToF, fToC;
    JLabel result;

    Q07() {
        setTitle("Temperature Converter");
        setSize(400, 220);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Temperature:"));
        temperature = new JTextField();
        add(temperature);

        ButtonGroup group = new ButtonGroup();
        cToF = new JRadioButton("Celsius to Fahrenheit", true);
        fToC = new JRadioButton("Fahrenheit to Celsius");
        group.add(cToF);
        group.add(fToC);
        add(cToF);
        add(fToC);

        JButton convert = new JButton("Convert");
        JButton clear = new JButton("Clear");
        convert.addActionListener(this);
        clear.addActionListener(e -> {
            temperature.setText("");
            result.setText("Result: ");
        });
        add(convert);
        add(clear);

        result = new JLabel("Result: ");
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double value = Double.parseDouble(temperature.getText());
            double answer;
            if (cToF.isSelected()) {
                answer = (value * 9 / 5) + 32;
                result.setText("Result: " + answer + " Fahrenheit");
            } else {
                answer = (value - 32) * 5 / 9;
                result.setText("Result: " + answer + " Celsius");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid temperature.");
        }
    }

    public static void main(String[] args) {
        new Q07();
    }
}
