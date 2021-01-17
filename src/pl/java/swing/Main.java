package pl.java.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> EventQueue.invokeLater(() -> {
                JFrame frame = new CalculatorFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            });
            case 2 -> EventQueue.invokeLater(() -> {
                JFrame frame = new TextComponentFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            });
            case 3 -> EventQueue.invokeLater(() -> {
                JFrame frame = new CheckBoxFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            });
            case 4 -> EventQueue.invokeLater(() -> {
                JFrame frame = new RadioButtonFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            });
            case 5 -> EventQueue.invokeLater(() -> {
                JFrame frame = new BorderFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            });
            case 6 -> EventQueue.invokeLater(() -> {
                JFrame frame = new ComboBoxFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            });
        }

    }
}
