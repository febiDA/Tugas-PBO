package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

import static java.awt.Color.*;

public class ViewTampil extends JFrame{

    JPanel ppanel= new JPanel();
    JPanel ppanel2= new JPanel();
    public JLabel ljudul,ljudul2,lGlogo,lGline,lGWa,lGBrowser,lTextLine,lTextWa,lTextBrowser;
    public JButton bEdit, bhapus, bPinjam, bHome, bTampil, bAbout;
    public JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID Anggota","Nama","ID buku", "Judul"};

    public ViewTampil () {

        ljudul = new JLabel("-PERPUSTAKAAN-");
        ljudul2 = new JLabel("List buku yang dipinjam");

        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

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

        bEdit = new JButton("Edit");
        bhapus = new JButton("hapus");
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

        ppanel.add(bHome);
        ppanel.add(bPinjam);
        ppanel.add(bTampil);
        ppanel.add(bAbout);

        ppanel.add(lGlogo);
        ppanel.add(lGline);
        ppanel.add(lGWa);
        ppanel.add(lGBrowser);

        ppanel.add(lTextLine);
        ppanel.add(lTextWa);
        ppanel.add(lTextBrowser);

        ppanel2.add(ljudul);
        ppanel2.add(ljudul2);
        ppanel2.add(bhapus);
        ppanel2.add(bEdit);

        ppanel.setBounds(570,20,270,500);
        ppanel.setBackground(ORANGE);
        ppanel2.setBounds(50,20,510,500);
        ppanel2.setBackground(ORANGE);

        lGlogo.setBounds(105,55,100,100);
        lGline.setBounds(50,340,100,30);
        lGWa.setBounds(50,380,100,30);
        lGBrowser.setBounds(50,420,120,30);

        lTextLine.setBounds(100,340,100,30);
        lTextWa.setBounds(100,380,100,30);
        lTextBrowser.setBounds(100,420,100,30);

        bHome.setBounds(90,170,100,30);
        bPinjam.setBounds(90,210,100,30);
        bTampil.setBounds(90,250,100,30);
        bAbout.setBounds(90,290,100,30);
        bhapus.setBounds(140,90,100,30);
        bEdit.setBounds(250,90,100,30);

        bEdit.setEnabled(false);
        bhapus.setEnabled(false);


        ljudul.setBounds(190,40,250,20);
        ljudul2.setBounds(180,135,250,20);

        ppanel2.add(scrollPane);
        scrollPane.setBounds(20, 170, 480, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
