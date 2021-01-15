package pl.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private JLabel label;
    private ButtonGroup group;
    private static final int DEFAULT_SIZE = 36;

    public RadioButtonFrame () {
        label = new JLabel("Kon i zolw grali w kosci...");
        label.setFont(new Font(Font.SERIF, Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        // Dodanie przelacznikow
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Mały", 12);
        addRadioButton("Srednia", 18);
        addRadioButton("Duza", 24);
        addRadioButton("Bardzo duza", 36);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addRadioButton(String name, final int size) {
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton radioButton = new JRadioButton(name, selected);
        group.add(radioButton);
        buttonPanel.add(radioButton);

        ActionListener listener = event -> {
            label.setFont(new Font("Serif", Font.PLAIN, size));;
        };

        radioButton.addActionListener(listener);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
    }
}
