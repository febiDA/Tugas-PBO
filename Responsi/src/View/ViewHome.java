package View;

import javax.swing.*;
import java.awt.*;

public class ViewHome extends JFrame{
    Font fjudul, fText, fText2;
    JLabel  ljudul, lText, lText2, lGline, lGWa, lGBrowser, lGlogo, lTextLine, lTextWa, lTextBrowser;
    public JButton bHome,bPinjam,bTampil,bAbout;

    public ViewHome() {
        setLayout(null);
        setVisible(true);
        setSize(550,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(new java.awt.Color(204,204,204));
        getContentPane().setBackground(Color.PINK);
        setTitle("PERPUSTAKAAN");

        fjudul = new Font("Tahoma", Font.BOLD , 21);
        fText = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        fText2 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        ljudul = new JLabel("-PERPUSTAKAAN-");
        lText = new JLabel("SELAMAT DATANG DI");
        lText2 = new JLabel("PERPUSTAKAAN");
        ljudul.setFont(fjudul);
        lText.setFont(fText);
        lText2.setFont(fText2);
        lGline = new JLabel();
        lGlogo = new JLabel();
        lGWa = new JLabel();
        lGBrowser = new JLabel();

        //label.setIcon(new ImageIcon(new ImageIcon("icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        //lGline.setIcon(new ImageIcon(new ImageIcon("src/Image/line.png").getImage().getScaledInstance(120,100, Image.SCALE_DEFAULT)));
        lGlogo.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\logoo.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        lGline.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\line.png").getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
        lGWa.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\wa.png").getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
        lGBrowser.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\browser.png").getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
        lTextLine = new JLabel(": @perpusFebi");
        lTextWa = new JLabel(": 0895377963665");
        lTextBrowser = new JLabel(": www.perpus.com");

        bHome = new JButton("Home");
        bPinjam = new JButton("Pinjam");
        bTampil = new JButton("Tampil");
        bAbout = new JButton("About Us");

        add(ljudul);
        add(lText);
        add(lText2);
        add(bHome);
        add(bPinjam);
        add(bTampil);
        add(bAbout);
        add(lGlogo);
        add(lGline);
        add(lGWa);
        add(lGBrowser);
        add(lTextLine);
        add(lTextWa);
        add(lTextBrowser);

        ljudul.setBounds(200,30,360,20);
        lText.setBounds(250,150,360,20);
        lText2.setBounds(270,190,360,20);
        lTextLine.setBounds(80,338,120,50);
        lTextWa.setBounds(250,338,120,50);
        lTextBrowser.setBounds(410,338,120,50);

        bHome.setBounds(50,100,100,30);
        bPinjam.setBounds(50,150,100,30);
        bTampil.setBounds(50,200,100,30);
        bAbout.setBounds(50,250,100,30);

        lGlogo.setBounds(140,20,50,50);
        lGline.setBounds(30,350,30,30);
        lGWa.setBounds(215,350,30,30);
        lGBrowser.setBounds(365,350,30,30);
    }
}


