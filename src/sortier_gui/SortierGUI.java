package sortier_gui;

import sortieren.BubbleSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUI extends JFrame {
    private JTextArea taBubbleSort;
    private JTextArea taSelectionSort;
    private JTextArea textArea3;
    private JButton bBubbleSort;
    private JButton startButton1;
    private JButton startButton2;
    private JPanel pMain;

    public SortierGUI() {
        super();
        setTitle("MrK.'s Soretier-GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pMain);
        setSize(800, 600);
        setVisible(true);

        bBubbleSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taBubbleSort.setText("BubbleSort gestartet\n\n");
                BubbleSort bs = new BubbleSort(new int[]{7, 3, 12, 1, 45, 2}, taBubbleSort);
                bs.sortieren();
            }
        });
    }

    public static void main(String[] args) {
        new SortierGUI();
    }
}
