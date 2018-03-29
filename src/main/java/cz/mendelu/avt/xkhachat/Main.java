package cz.mendelu.avt.xkhachat;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setContentPane(new Form().panelMain);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
