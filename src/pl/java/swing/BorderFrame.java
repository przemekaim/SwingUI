package pl.java.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderFrame extends JFrame {
    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;

    public BorderFrame() {
        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("LoweredBevel", BorderFactory.createLoweredBevelBorder());
        addRadioButton("RaisedLevel", BorderFactory.createRaisedBevelBorder());
        addRadioButton("EtchedLevel", BorderFactory.createEtchedBorder());
        addRadioButton("Line", BorderFactory.createLineBorder(Color.RED));
        addRadioButton("Matte", BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
        addRadioButton("Empty", BorderFactory.createEmptyBorder());

        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched, "Rodzaje obramowan");

        buttonPanel.setBorder(titled);

        setLayout(new GridLayout(2, 1));
        add(buttonPanel);
        add(demoPanel);
        pack();
    }

    public void addRadioButton(String buttonName, Border b) {
        JRadioButton radioButton = new JRadioButton(buttonName);
        radioButton.addActionListener(event -> demoPanel.setBorder(b));
        group.add(radioButton);
        buttonPanel.add(radioButton);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
    }
}
