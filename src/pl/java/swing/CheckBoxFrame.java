package pl.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckBoxFrame extends JFrame {
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 24;

    public CheckBoxFrame() {
        label = new JLabel("Kon i zolw grali w kosci z pekna cma u zrodla");
        label.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
        add(label, BorderLayout.CENTER);

        // nasluchiwacz ustawiajacy atrybuty czcionki
        // etykkiety zgodnie z ustawieniami pol wyboru

        ActionListener listener = event -> {
            int mode = 0;
            if (bold.isSelected()) mode += Font.BOLD;
            if (italic.isSelected()) mode += Font.ITALIC;
            label.setFont(new Font("Serif", mode, FONTSIZE));
        };

        JPanel buttonPanel = new JPanel();
        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
        bold.setSelected(false);
        buttonPanel.add(bold);

        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        italic.setSelected(false);
        buttonPanel.add(italic);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
    }
}
