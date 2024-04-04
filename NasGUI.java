import javax.swing.*;
import java.awt.*;

public class NasGUI extends JFrame {
    private JMenuBar menuBar;
    private JMenu pagesMenu, editMenu, helpMenu;
    private JMenuItem menuItem1, menuItem2;

    public NasGUI() {
        setTitle("AWT Practice");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menu bar
        menuBar = new JMenuBar();

        // Pages Menu
        pagesMenu = new JMenu("Pages");
        menuItem1 = new JMenuItem("Login");
        menuItem2 = new JMenuItem("Student");
        pagesMenu.add(menuItem1);
        pagesMenu.add(menuItem2);

        // Edit Menu
        editMenu = new JMenu("Edit");
        

        // Help Menu
        helpMenu = new JMenu("Help");

        // Add menus to menu bar
        menuBar.add(pagesMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // North Panel
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.GRAY);
        JLabel northLabel = new JLabel("SIMPLE JAVA AWT LAYOUT");
        northPanel.add(northLabel);
        add(northPanel, BorderLayout.NORTH);

        // South Panel
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.blue);
        JLabel southLabel = new JLabel();
        southPanel.add(southLabel);
        add(southPanel, BorderLayout.SOUTH);

        // Center Panel (Login Form)
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);

        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel userLabel = new JLabel("Username:");
        JTextField userTextField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
    
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        loginPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        loginPanel.add(userTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(passLabel, gbc);

        gbc.gridx = 1;
        loginPanel.add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginButton, gbc);

        centerPanel.add(loginPanel, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.blue);
        JLabel leftLabel = new JLabel("                                     ");
        leftPanel.add(leftLabel);
        add(leftPanel, BorderLayout.WEST);

        // Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.blue);
        JLabel rightLabel = new JLabel("                                    ");
        rightPanel.add(rightLabel);
        add(rightPanel, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NasGUI().setVisible(true);
            }
        });
    }
}
