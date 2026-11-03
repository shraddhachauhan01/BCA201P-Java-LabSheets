import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q10 extends JFrame implements ActionListener {
    JTextField account, name, balance, amount;

    Q10() {
        setTitle("Mini Banking Application");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Account Number:"));
        account = new JTextField();
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Current Balance:"));
        balance = new JTextField();
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        String[] buttons = {"Deposit", "Withdraw", "Check Balance", "Clear"};
        for (String label : buttons) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            add(button);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Clear")) {
            account.setText("");
            name.setText("");
            balance.setText("");
            amount.setText("");
            return;
        }

        try {
            double currentBalance = Double.parseDouble(balance.getText());
            if (command.equals("Check Balance")) {
                JOptionPane.showMessageDialog(this, "Current Balance: " + currentBalance);
            } else {
                double value = Double.parseDouble(amount.getText());
                if (value <= 0) {
                    JOptionPane.showMessageDialog(this, "Enter an amount greater than zero.");
                } else if (command.equals("Deposit")) {
                    currentBalance += value;
                    balance.setText(String.valueOf(currentBalance));
                    JOptionPane.showMessageDialog(this, "Amount deposited successfully.");
                } else if (command.equals("Withdraw")) {
                    if (value <= currentBalance) {
                        currentBalance -= value;
                        balance.setText(String.valueOf(currentBalance));
                        JOptionPane.showMessageDialog(this, "Amount withdrawn successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Insufficient balance.");
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid balance and amount.");
        }
    }

    public static void main(String[] args) {
        new Q10();
    }
}
