import java.awt.*;
import java.awt.event.*;

public class Q02 extends Frame implements ActionListener {
    TextField first, second;
    Label result;

    Q02() {
        setTitle("AWT Calculator");
        setSize(350, 250);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new Label("First Number:"));
        first = new TextField();
        add(first);

        add(new Label("Second Number:"));
        second = new TextField();
        add(second);

        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};
        for (String operation : operations) {
            Button button = new Button(operation);
            button.addActionListener(this);
            add(button);
        }

        result = new Label("Result: ");
        add(result);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(first.getText());
            double b = Double.parseDouble(second.getText());
            String operation = e.getActionCommand();
            double answer = 0;

            if (operation.equals("Add")) {
                answer = a + b;
            } else if (operation.equals("Subtract")) {
                answer = a - b;
            } else if (operation.equals("Multiply")) {
                answer = a * b;
            } else if (operation.equals("Divide")) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                answer = a / b;
            }
            result.setText("Result: " + answer);
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Q02();
    }
}
