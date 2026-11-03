import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q03 extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;

    Q03() {
        setTitle("Student Login");
        setSize(350, 200);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        JButton login = new JButton("Login");
        JButton reset = new JButton("Reset");
        login.addActionListener(this);
        reset.addActionListener(e -> {
            username.setText("");
            password.setText("");
        });
        add(login);
        add(reset);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = username.getText();
        String pass = new String(password.getPassword());

        if (user.equals("student") && pass.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login successful.");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new Q03();
    }
}
