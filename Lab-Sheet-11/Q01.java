import java.awt.*;
import java.awt.event.*;

public class Q01 extends Frame implements ActionListener {
    TextField name, roll, course;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice semester;
    Button submit, reset;

    Q01() {
        setTitle("Student Registration Form");
        setSize(400, 350);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new Label("Student Name:"));
        name = new TextField();
        add(name);

        add(new Label("Roll Number:"));
        roll = new TextField();
        add(roll);

        add(new Label("Course:"));
        course = new TextField();
        add(course);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        Panel genderPanel = new Panel();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new Label("Semester:"));
        semester = new Choice();
        for (int i = 1; i <= 8; i++) {
            semester.add("Semester " + i);
        }
        add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");
        submit.addActionListener(this);
        reset.addActionListener(this);
        add(submit);
        add(reset);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String selectedGender = gender.getSelectedCheckbox() == null ? "Not selected" :
                                     gender.getSelectedCheckbox().getLabel();
            new DialogMessage(this, "Name: " + name.getText() + "\nRoll: " + roll.getText() +
                    "\nCourse: " + course.getText() + "\nGender: " + selectedGender +
                    "\nSemester: " + semester.getSelectedItem());
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            gender.setSelectedCheckbox(null);
            semester.select(0);
        }
    }

    public static void main(String[] args) {
        new Q01();
    }
}

class DialogMessage {
    DialogMessage(Frame frame, String message) {
        Dialog dialog = new Dialog(frame, "Submitted Information", true);
        dialog.setLayout(new FlowLayout());
        TextArea area = new TextArea(message, 6, 30, TextArea.SCROLLBARS_NONE);
        area.setEditable(false);
        dialog.add(area);
        Button ok = new Button("OK");
        ok.addActionListener(e -> dialog.dispose());
        dialog.add(ok);
        dialog.setSize(300, 180);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}
