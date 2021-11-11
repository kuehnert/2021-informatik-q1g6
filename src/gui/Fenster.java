package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {
    private JButton bBombe;
    private JPanel pMain;

    public Fenster() {
        super(); // ruft den Konstruktor von JFrame auf, muss 1. Zeile sein

        bBombe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bumm!");
            }
        });

        add(pMain);
                setSize(800, 600);
        setTitle("MrKs 11G6 Sortierer");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        setVisible(true); // sollte am Ende stehen
    }

    public static void main(String[] args) {
        new Fenster();
    }
}
