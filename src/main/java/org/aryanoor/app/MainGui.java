package org.aryanoor.app;

import java.io.IOException;

import javax.swing.SwingUtilities;

public class MainGui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            try {
                new GUI();
            } catch (IOException ex) {
            }
        });
    }
}
