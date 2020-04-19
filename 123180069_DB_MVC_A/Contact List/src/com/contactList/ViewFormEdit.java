package com.contactList;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewFormEdit extends JFrame{

    JLabel lid = new JLabel("");
    JTextField tfid = new JTextField();
    JLabel lnama = new JLabel("Nama         :");
    JTextField tfnama = new JTextField();
    JLabel lnohp = new JLabel("No. HP       :");
    JTextField tfnohp = new JTextField();
    JLabel lumur = new JLabel("Umur         :");
    JTextField tfumur = new JTextField();
    JLabel lemail = new JLabel("Email         :");
    JTextField tfemail = new JTextField();

    JButton btnTambahPanel = new JButton("Edit");
    JButton btnBatalPanel = new JButton("Batal");

    public ViewFormEdit() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(725, 500);
        getContentPane().setBackground(Color.ORANGE);

        JLabel label = new JLabel("Edit Data Contact");
        label.setFont(new Font("Arial Narrow", Font.BOLD, 19));
        add(label);
        label.setBounds(305, 20, 160, 20);

        add(lnama);
        lnama.setBounds(250, 100, 90, 20);
        add(tfnama);
        tfnama.setBounds(350, 100, 120, 20);
        add(lnohp);
        lnohp.setBounds(250, 125, 90, 20);
        add(tfnohp);
        tfnohp.setBounds(350, 125, 120, 20);
        add(lumur);
        lumur.setBounds(250, 150, 90, 20);
        add(tfumur);
        tfumur.setBounds(350, 150, 120, 20);
        add(lemail);
        lemail.setBounds(250, 175, 90, 20);
        add(tfemail);
        tfemail.setBounds(350, 175, 120, 20);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(250, 205, 90, 20);
        btnTambahPanel.setBackground(Color.BLACK);
        btnTambahPanel.setForeground(Color.ORANGE);

        add(btnBatalPanel);
        btnBatalPanel.setBounds(380, 205, 90, 20);
        btnBatalPanel.setBackground(Color.BLACK);
        btnBatalPanel.setForeground(Color.ORANGE);


    }

    public String getTfid() {
        return tfid.getText();
    }

    public String getTfnama() {
        return tfnama.getText();
    }

    public String getTfnohp() {
        return tfnohp.getText();
    }

    public String getTfumur() {
        return tfumur.getText();
    }

    public String getTfemail() {
        return tfemail.getText();
    }
}
