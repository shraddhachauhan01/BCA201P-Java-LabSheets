import java.awt.*;
import java.awt.event.*;

public class Q06 extends Frame implements ActionListener {
    TextField id, name, designation, salary;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice department;
    TextArea output;

    Q06() {
        setTitle("Employee Registration");
        setSize(450, 400);
        setLayout(new GridLayout(8, 2, 5, 5));

        add(new Label("Employee ID:"));
        id = new TextField();
        add(id);

        add(new Label("Name:"));
        name = new TextField();
        add(name);

        add(new Label("Designation:"));
        designation = new TextField();
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField();
        add(salary);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        Panel genderPanel = new Panel();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new Label("Department:"));
        department = new Choice();
        department.add("IT");
        department.add("HR");
        department.add("Finance");
        department.add("Sales");
        add(department);

        Button submit = new Button("Submit");
        Button clear = new Button("Clear");
        submit.addActionListener(this);
        clear.addActionListener(this);
        add(submit);
        add(clear);

        output = new TextArea();
        add(new Label("Submitted Information:"));
        add(output);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            String selectedGender = gender.getSelectedCheckbox() == null ? "Not selected" :
                                     gender.getSelectedCheckbox().getLabel();
            output.setText("Employee ID: " + id.getText() +
                    "\nName: " + name.getText() +
                    "\nDesignation: " + designation.getText() +
                    "\nSalary: " + salary.getText() +
                    "\nGender: " + selectedGender +
                    "\nDepartment: " + department.getSelectedItem());
        } else {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            gender.setSelectedCheckbox(null);
            department.select(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Q06();
    }
}
