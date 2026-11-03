import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Q08 extends JFrame implements ActionListener {
    JTextArea textArea;

    Q08() {
        setTitle("Simple Notepad");
        setSize(600, 450);
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        String[] items = {"New", "Open", "Save", "Exit"};
        for (String item : items) {
            JMenuItem menuItem = new JMenuItem(item);
            menuItem.addActionListener(this);
            fileMenu.add(menuItem);
        }
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("New")) {
            textArea.setText("");
        } else if (command.equals("Open")) {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(chooser.getSelectedFile()));
                    textArea.setText("");
                    String line;
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                    reader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Unable to open file.");
                }
            }
        } else if (command.equals("Save")) {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    FileWriter writer = new FileWriter(chooser.getSelectedFile());
                    writer.write(textArea.getText());
                    writer.close();
                    JOptionPane.showMessageDialog(this, "File saved successfully.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Unable to save file.");
                }
            }
        } else if (command.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Q08();
    }
}
