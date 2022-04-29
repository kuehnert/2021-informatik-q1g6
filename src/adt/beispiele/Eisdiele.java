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
    private JTextArea taSchlange;
    private JButton bAuto;
    private EisThread thread;

    private QueueEis schlange;

    public Eisdiele() {
        super("Mr K.'s Eisdiele");
        setSize(800, 600);
        add(pMain);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        schlange = new QueueEis();
        bBedienen.setEnabled(!schlange.isEmpty());
        tfName.setText(Kunde.getZufallsname());
        cbSorte.setSelectedItem(Eis.getZufallseis());

        bNeuerKunde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String sorte = cbSorte.getSelectedItem().toString();

                if (name == null || sorte == null) {
                    JOptionPane.showMessageDialog(null, "Fehler", "Gib sowohl Name wie auch Eissorte an",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                anstellen(name, sorte);
            }
        });

        bBedienen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bedieneKunde();
            }
        });

        setVisible(true);
        bAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleAuto();
            }
        });
    }

    private void toggleAuto() {
        if (bAuto.getText().equals("Auto-Schlange Start")) {
            bAuto.setText("Auto-Schlange Stop");
            thread = new EisThread(this);
            thread.start();
        } else {
            bAuto.setText("Auto-Schlange Start");
            thread.anhalten();
            thread = null;
        }
    }

    public void anstellen(String name, String sorte) {
        var kunde = new Kunde(name, sorte);
        taLog.append("+ " + kunde + " hat sich angestellt...\n");
        schlange.enqueue(kunde);
        bBedienen.setEnabled(true);
        taSchlange.setText(schlange.toString());
        tfName.setText(Kunde.getZufallsname());
        cbSorte.setSelectedItem(Eis.getZufallseis());
    }

    public void bedieneKunde() {
        if (schlange.isEmpty()) {return;}

        Kunde kunde = schlange.dequeue();
        taLog.append("- <strong>%s</strong> verlangt nach %s wird bedient nach %d Sekunden...\n".formatted(kunde.getName(), kunde.getSorte(), kunde.getQueuedForInSeconds()));
        taLog.setCaretPosition(taLog.getLineCount());
        taSchlange.setText(schlange.toString());
        bBedienen.setEnabled(!schlange.isEmpty());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        cbSorte = new JComboBox(Eis.SORTEN);
    }

    public static void main(String[] args) {
        new Eisdiele();
    }
}
