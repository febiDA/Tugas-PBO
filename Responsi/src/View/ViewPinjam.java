package View;

import javax.swing.*;

import static java.awt.Color.*;

import java.awt.*;

public class ViewPinjam extends JFrame{

    JPanel ppanel= new JPanel();
    JPanel ppanel2= new JPanel();
    Font fJudul;
    public JLabel ljudul, lId_anggota,lNama,lId_buku,lJudul_buku,lGlogo,lGline,lGWa,lGBrowser,lTextLine,lTextWa,lTextBrowser;
    public JTextField tfId_anggota, tfnama, tfId_buku, tfJudul_buku;
    public JButton bTambah , bBatal, bPinjam, bHome, bTampil, bAbout;

    public ViewPinjam () {

        lGlogo = new JLabel();
        lGWa = new JLabel();
        lGline = new JLabel();
        lGBrowser = new JLabel();

        lGlogo.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\logoo.png").getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT)));
        lGline.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\line.png").getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
        lGWa.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\wa.png").getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
        lGBrowser.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\browser.png").getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));

        lTextLine = new JLabel(": @perpusFebi");
        lTextWa = new JLabel(": 0895377963665");
        lTextBrowser = new JLabel(": www.perpus.com");

        fJudul = new Font("Tahoma", Font.BOLD , 21);
        ljudul = new JLabel("-PERPUSTAKAAN-");
        ljudul.setFont(fJudul);
        lId_anggota = new JLabel("Id Anggota    :");
        tfId_anggota = new JTextField();
        lNama = new JLabel("Nama    :");
        tfnama = new JTextField();
        lId_buku= new JLabel("ID Buku    :");
        tfId_buku = new JTextField();
        lJudul_buku = new JLabel("Judul Buku  :");
        tfJudul_buku = new JTextField();

        bTambah = new JButton("Tambah");
        bBatal = new JButton("Batal");
        bHome = new JButton("Home");
        bPinjam = new JButton("Pinjam");
        bTampil = new JButton("Tampil");
        bAbout = new JButton("About Us");

        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ppanel2.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ppanel.setLayout(null);
        ppanel2.setLayout(null);

        setTitle("Perpustakaan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(900,600);
        setLocationRelativeTo(null);

        add(ppanel);
        add(ppanel2);

        ppanel.add(lGlogo);
        ppanel.add(lGline);
        ppanel.add(lGWa);
        ppanel.add(lGBrowser);

        ppanel.add(lTextLine);
        ppanel.add(lTextWa);
        ppanel.add(lTextBrowser);

        ppanel.add(bHome);
        ppanel.add(bPinjam);
        ppanel.add(bTampil);
        ppanel.add(bAbout);

        ppanel2.add(ljudul);
        ppanel2.add(lId_anggota);
        ppanel2.add(tfId_anggota);
        ppanel2.add(lNama);
        ppanel2.add(tfnama);
        ppanel2.add(lId_buku);
        ppanel2.add(tfId_buku);
        ppanel2.add(lJudul_buku);
        ppanel2.add(tfJudul_buku);
        ppanel2.add(bTambah);
        ppanel2.add(bBatal);

        ppanel.setBounds(540,20,300,500);
        ppanel.setBackground(ORANGE);
        ppanel2.setBounds(50,20,480,500);
        ppanel2.setBackground(ORANGE);

        lGlogo.setBounds(115,55,100,100);
        lGline.setBounds(50,340,100,30);
        lGWa.setBounds(50,380,100,30);
        lGBrowser.setBounds(50,420,120,30);

        lTextLine.setBounds(100,340,100,30);
        lTextWa.setBounds(100,380,100,30);
        lTextBrowser.setBounds(100,420,100,30);

        bHome.setBounds(110,170,100,30);
        bPinjam.setBounds(110,210,100,30);
        bTampil.setBounds(110,250,100,30);
        bAbout.setBounds(110,290,100,30);

        ljudul.setBounds(170,100,250,20);
        lId_anggota.setBounds(50, 160, 90, 20);
        tfId_anggota.setBounds(150, 160, 120, 20);
        lNama.setBounds(50, 200, 90, 20);
        tfnama.setBounds(150, 200, 120, 20);
        lId_buku.setBounds(50, 240, 90, 20);
        tfId_buku.setBounds(150, 240, 120, 20);
        lJudul_buku.setBounds(50, 280, 90, 20);
        tfJudul_buku.setBounds(150, 280, 120, 20);

        bTambah.setBounds(140,400,100,30);
        bBatal.setBounds(250,400,100,30);
    }

    public String getId_anggota(){
        return tfId_anggota.getText();
    }

    public String getNama(){
        return tfnama.getText();
    }

    public String getId_buku(){
        return tfId_buku.getText();
    }

    public String getJudul_buku(){
        return tfJudul_buku.getText();
    }
}
