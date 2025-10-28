package JWT;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoApp extends JFrame implements ActionListener {

    private DefaultListModel<String> taskListModel; // Holds the list of tasks
    private JList<String> taskList;                 // Displays the tasks
    private JTextField taskField;                   // Input field for new task
    private JButton addButton, deleteButton;        // Buttons

    public ToDoApp() {
        // Frame setup
        setTitle("To-Do List App");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Top Panel (input + add button)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        addButton.addActionListener(this);

        topPanel.add(taskField);
        topPanel.add(addButton);

        // Center Panel (task list with scroll)
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Bottom Panel (delete button)
        JPanel bottomPanel = new JPanel();
        deleteButton = new JButton("Delete Task");
        deleteButton.addActionListener(this);
        bottomPanel.add(deleteButton);

        // Add panels to frame
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a task!");
            }
        } else if (e.getSource() == deleteButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Select a task to delete!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoApp::new);
    }
}
