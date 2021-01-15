package pl.java.swing;

import javax.swing.*;
import java.awt.*;

public class TextComponentFrame extends JFrame {
    public static final int TEXTAREA_ROWS = 8;
    public static final int TEXTAREA_COLUMNS = 20;

    public TextComponentFrame() {
        final JTextField textField = new JTextField();
        final JPasswordField passwordField = new JPasswordField();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(new JLabel("Nazwa uzytkownika", SwingConstants.RIGHT));
        northPanel.add(textField);
        northPanel.add(new JLabel("Haslo: ", SwingConstants.RIGHT));
        northPanel.add(passwordField);

        add(northPanel, BorderLayout.NORTH);

        final JTextArea textArea = new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        // Dodanie przycisku wstawiajacego tekst do obszaru tekstowego

        JPanel southPanel = new JPanel();

        JButton insterButton = new JButton("Wstaw");
        southPanel.add(insterButton);

        insterButton.addActionListener(e ->
            textArea.append("Nazwa uzytkownika: " + textField.getText() + " Haslo: " + new String(passwordField.getPassword()) + "\n" ));

        add(southPanel, BorderLayout.SOUTH);
        pack();

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.BLUE);
        add(westPanel, BorderLayout.WEST);
    }

    public Dimension getPreferredSize() {
        return new Dimension(300,300);
    }
}
