package adt.beispiele;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eisdiele extends JFrame {
    private JTextField tfName;
    private JComboBox cbSorte;
    private JButton bNeuerKunde;
    private JButton bBedienen;
    private JTextArea taLog;
    private JPanel pMain;

    private QueueEis schlange;

    public Eisdiele() {
        super("Mr K.'s Eisdiele");
        setSize(800, 600);
        add(pMain);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        schlange = new QueueEis();
        bBedienen.setEnabled(!schlange.isEmpty());

        bNeuerKunde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                System.out.println(name);
                String sorte = cbSorte.getSelectedItem().toString();
                System.out.println(sorte);

                if (name == null || sorte == null) {
                    JOptionPane.showMessageDialog(null, "Fehler", "Gib sowohl Name wie auch Eissorte an",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                var kunde = new Kunde(name, sorte);
                taLog.append("Kunde " + kunde + " hat sich angestellt...\n");
                schlange.enqueue(kunde);
                bBedienen.setEnabled(true);
                taLog.append(schlange.toString() + "\n");
            }
        });

        bBedienen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Kunde kunde = schlange.dequeue();
                taLog.append("Kunde " + kunde + " wird bedient...\n");
                bBedienen.setEnabled(!schlange.isEmpty());
            }
        });

        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        cbSorte = new JComboBox(Eis.SORTEN);
    }

    public static void main(String[] args) {
        new Eisdiele();
    }
}
