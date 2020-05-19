package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewEdit extends JFrame{

    JLabel lId_anggota = new JLabel("ID Anggota     :");
    public JTextField tfId_anggota = new JTextField();
    JLabel lNama = new JLabel("Nama      :");
    public JTextField tfNama = new JTextField();
    JLabel lId_buku = new JLabel("ID Buku     :");
    public JTextField tfId_buku  = new JTextField();
    JLabel lJudul_buku = new JLabel("Judul Buku     :");
    public JTextField tfJudul_buku  = new JTextField();

    public JButton bEdit = new JButton("Edit");
    public JButton bBatal = new JButton("Batal");

    public ViewEdit() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(800, 600);
        setBackground(Color.white);

        JLabel label = new JLabel("-PERPUSTAKAAN-");
        add(label);
        label.setBounds(350, 20, 300, 20);

        add(lId_anggota);
        lId_anggota.setBounds(250, 100, 90, 20);
        add(tfId_anggota);
        tfId_anggota.setBounds(350, 100, 120, 20);
        add(lNama);
        lNama.setBounds(250, 125, 90, 20);
        add(tfNama);
        tfNama.setBounds(350, 125, 120, 20);
        add(lId_buku);
        lId_buku.setBounds(250, 150, 90, 20);
        add(tfId_buku);
        tfId_buku.setBounds(350, 150, 120, 20);
        add(lJudul_buku);
        lJudul_buku.setBounds(250, 175, 90, 20);
        add(tfJudul_buku);
        tfJudul_buku.setBounds(350, 175, 120, 20);

        add(bEdit);
        bEdit.setBounds(250, 210, 90, 20);

        add(bBatal);
        bBatal.setBounds(370, 210, 90, 20);

        setLocationRelativeTo(null);
    }

    public String getId_anggota() {
        return tfId_anggota.getText();
    }

    public String getNama() {
        return tfNama.getText();
    }

    public String getId_buku() {
        return tfId_buku.getText();
    }

    public String getJudul_buku() {
        return tfJudul_buku.getText();
    }
}
