package cz.mendelu.avt.xkhachat;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Form extends JFrame {
    public JPanel panelMain;
    private JButton chooseButton;
    private JTextField addressField;
    private JTextArea readHTML;

    private JTextArea descroptionField;
    private JButton saveDescriptionButton;

    private JTextArea keywordsField;
    private JButton saveKeywordsButton;


    public Form() {
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                int returnValue = jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    System.out.println(selectedFile.getAbsolutePath());

                    //nacteni souboru
                    try(BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            readHTML.append(line + "\n");
                        }
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    //konec nacteni souboru
                }
                String filename = jfc.getSelectedFile().getName();
                addressField.setText(filename);
            }
        });



        //save Description Button
        saveDescriptionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("save description button Pushed.");
            }
        });

        // save keyword button
        //save Description Button
        saveKeywordsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("save keyword button Pushed.");
            }
        });
    }
}


