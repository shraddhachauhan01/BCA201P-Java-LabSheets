import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q04 extends JFrame implements ActionListener {
    JTextField[] marks = new JTextField[5];

    Q04() {
        setTitle("Student Marksheet");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 5, 5));

        String[] subjects = {"English", "Mathematics", "Java", "DBMS", "Computer Networks"};
        for (int i = 0; i < subjects.length; i++) {
            add(new JLabel(subjects[i] + ":"));
            marks[i] = new JTextField();
            add(marks[i]);
        }

        JButton calculate = new JButton("Calculate Result");
        calculate.addActionListener(this);
        add(calculate);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int total = 0;
            boolean pass = true;

            for (JTextField field : marks) {
                int mark = Integer.parseInt(field.getText());
                if (mark < 0 || mark > 100) {
                    JOptionPane.showMessageDialog(this, "Marks must be between 0 and 100.");
                    return;
                }
                total += mark;
                if (mark < 33) {
                    pass = false;
                }
            }

            double percentage = total / 5.0;
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            JOptionPane.showMessageDialog(this, "Total: " + total +
                    "\nPercentage: " + percentage + "%" +
                    "\nGrade: " + grade + "\nStatus: " + (pass ? "Pass" : "Fail"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid marks in all subjects.");
        }
    }

    public static void main(String[] args) {
        new Q04();
    }
}
