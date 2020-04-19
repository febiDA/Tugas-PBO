package com.contactList;

import java.awt.*;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewPraktikum extends JFrame {

    JLabel lJudul = new JLabel("Contact List");
    JLabel lId = new JLabel("");
    JTextField tfId = new JTextField();
    JLabel lNama = new JLabel ("Nama     : ");
    JTextField tfNama = new JTextField();
    JLabel lNohp = new JLabel("No. HP   : ");
    JTextField tfNohp = new JTextField();
    JLabel lUmur = new JLabel ("Umur     : ");
    JTextField tfUmur = new JTextField();
    JLabel lEmail = new JLabel ("Email    : ");
    JTextField tfEmail = new JTextField();

    JButton btnTambahPanel = new JButton("Tambah");
    //JButton btnBatalPanel = new JButton("Batal");
    JButton btnHapus = new JButton("Hapus");
    JButton btnEdit = new JButton("Edit");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"ID","Nama","NoHP","Umur","Email"}; //membuat kolom dalam array

    public ViewPraktikum(){

        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        tabel.setBackground(Color.PINK);
        tabel.setForeground(Color.yellow);
        scrollPane = new JScrollPane(tabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(720, 550);
        getContentPane().setBackground(Color.yellow);

        //TABEL
        add(scrollPane);
        scrollPane.setBounds(110, 50, 500, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lJudul);
        lJudul.setFont(new Font("Courier New", Font.BOLD, 20));
        lJudul.setBounds(260, 5, 210, 30);
        add(lNama);
        lNama.setFont(new Font("Courier New", Font.BOLD, 12));
        lNama.setBounds(110, 260, 90, 20);
        add(tfNama);
        tfNama.setBounds(110, 285, 120, 20);
        add(lNohp);
        lNohp.setFont(new Font("Courier New", Font.BOLD, 12));
        lNohp.setBounds(110, 310, 90, 20);
        add(tfNohp);
        tfNohp.setBounds(110, 335, 120, 20);
        add(lUmur);
        lUmur.setFont(new Font("Courier New", Font.BOLD, 12));
        lUmur.setBounds(110, 360, 90, 20);
        add(tfUmur);
        tfUmur.setBounds(110, 385, 120, 20);
        add(lEmail);
        lEmail.setFont(new Font("Courier New", Font.BOLD, 12));
        lEmail.setBounds(110, 410, 90, 20);
        add(tfEmail);
        tfEmail.setBounds(110, 435, 120, 20);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(240, 475, 90, 20);
        btnTambahPanel.setBackground(Color.PINK);
        btnTambahPanel.setForeground(Color.yellow);

        /*add(btnBatalPanel);
        btnBatalPanel.setBounds(240, 475, 90, 20);
        btnBatalPanel.setBackground(Color.BLACK);
        btnBatalPanel.setForeground(Color.CYAN);*/

        add(btnHapus);
        btnHapus.setBounds(370, 475, 90, 20);
        btnHapus.setEnabled(false);
        btnHapus.setBackground(Color.PINK);
        btnHapus.setForeground(Color.yellow);

        add(btnEdit);
        btnEdit.setBounds(500, 475, 90, 20);
        btnEdit.setEnabled(false);
        btnEdit.setBackground(Color.PINK);
        btnEdit.setForeground(Color.yellow);
    }

    public String getId(){
        return tfId.getText();
    }

    public String getNama(){
        return tfNama.getText();
    }

    public String getNohp(){
        return tfNohp.getText();
    }

    public String getUmur(){
        return tfUmur.getText();
    }

    public String getEmail(){
        return tfEmail.getText();
    }
}