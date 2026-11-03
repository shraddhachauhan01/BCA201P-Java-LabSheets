import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q09 extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton[] ratings;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;

    Q09() {
        setTitle("Student Feedback Form");
        setSize(500, 450);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        add(new JLabel("Rating:"));
        JPanel ratingPanel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        String[] choices = {"Excellent", "Very Good", "Good", "Average", "Poor"};
        ratings = new JRadioButton[choices.length];
        for (int i = 0; i < choices.length; i++) {
            ratings[i] = new JRadioButton(choices[i]);
            group.add(ratings[i]);
            ratingPanel.add(ratings[i]);
        }
        add(ratingPanel);

        add(new JLabel("Feedback Areas:"));
        JPanel checkPanel = new JPanel();
        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");
        checkPanel.add(teaching);
        checkPanel.add(laboratory);
        checkPanel.add(material);
        checkPanel.add(assignments);
        add(checkPanel);

        add(new JLabel("Comments:"));
        comments = new JTextArea(3, 20);
        add(new JScrollPane(comments));

        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");
        submit.addActionListener(this);
        reset.addActionListener(e -> clearForm());
        add(submit);
        add(reset);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void clearForm() {
        name.setText("");
        roll.setText("");
        course.setText("");
        for (JRadioButton rating : ratings) rating.setSelected(false);
        teaching.setSelected(false);
        laboratory.setSelected(false);
        material.setSelected(false);
        assignments.setSelected(false);
        comments.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        String rating = "Not selected";
        for (JRadioButton option : ratings) {
            if (option.isSelected()) rating = option.getText();
        }

        String areas = "";
        if (teaching.isSelected()) areas += "Teaching ";
        if (laboratory.isSelected()) areas += "Laboratory ";
        if (material.isSelected()) areas += "Course Material ";
        if (assignments.isSelected()) areas += "Assignments ";

        JOptionPane.showMessageDialog(this, "Name: " + name.getText() +
                "\nRoll Number: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + rating +
                "\nFeedback Areas: " + areas +
                "\nComments: " + comments.getText());
    }

    public static void main(String[] args) {
        new Q09();
    }
}
