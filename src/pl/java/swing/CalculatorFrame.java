package pl.java.swing;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        add(new CalculatorPanel());
        pack();
    }

}
