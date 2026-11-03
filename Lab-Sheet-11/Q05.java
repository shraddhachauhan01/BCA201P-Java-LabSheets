import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q05 extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, dbms, networks;

    Q05() {
        setTitle("Course Selection Form");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<String>(new String[]{"BCA", "BBA", "BCom", "BSc"});
        add(course);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        group.add(male);
        group.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("Subjects:"));
        JPanel subjectPanel = new JPanel();
        java = new JCheckBox("Java");
        dbms = new JCheckBox("DBMS");
        networks = new JCheckBox("Networks");
        subjectPanel.add(java);
        subjectPanel.add(dbms);
        subjectPanel.add(networks);
        add(subjectPanel);

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
        course.setSelectedIndex(0);
        male.setSelected(false);
        female.setSelected(false);
        java.setSelected(false);
        dbms.setSelected(false);
        networks.setSelected(false);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected";
        String subjects = "";
        if (java.isSelected()) subjects += "Java ";
        if (dbms.isSelected()) subjects += "DBMS ";
        if (networks.isSelected()) subjects += "Networks ";
        JOptionPane.showMessageDialog(this, "Name: " + name.getText() +
                "\nCourse: " + course.getSelectedItem() +
                "\nGender: " + gender + "\nSubjects: " + subjects);
    }

    public static void main(String[] args) {
        new Q05();
    }
}
