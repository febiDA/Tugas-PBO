package View;

import javax.swing.*;
import java.awt.*;

public class ViewAbout extends JFrame{
    Font fjudul,fAbout;
    JLabel  ljudul, lGlogo, lAbout;
    public JButton bHome,bPinjam,bTampil,bAbout;

    public ViewAbout() {
        setLayout(null);
        setVisible(false);
        setSize(550,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(new java.awt.Color(204,204,204));
        getContentPane().setBackground(Color.PINK);
        setTitle("PERPUSTAKAAN");

        fjudul = new Font("Tahoma", Font.BOLD , 21);
        fAbout = new Font("Tahoma", Font.BOLD , 21);
        ljudul = new JLabel("-PERPUSTAKAAN-");
        lAbout = new JLabel("ABOUT US");
        ljudul.setFont(fjudul);
        lAbout.setFont(fAbout);
        lGlogo = new JLabel();

        lGlogo.setIcon(new ImageIcon(new ImageIcon("D:\\UPNVYK 2018\\Semester IV\\Prak. PBO\\Intellij\\Responsi\\src\\View\\Image\\logoo.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));

        bHome = new JButton("Home");
        bPinjam = new JButton("Pinjam");
        bTampil = new JButton("Tampil");
        bAbout = new JButton("About Us");

        add(ljudul);
        add(lGlogo);
        add(lAbout);
        add(bHome);
        add(bPinjam);
        add(bTampil);
        add(bAbout);

        ljudul.setBounds(200,30,360,20);
        lGlogo.setBounds(140,20,50,50);
        lAbout.setBounds(290,150,360,20);

        bHome.setBounds(50,100,100,30);
        bPinjam.setBounds(50,150,100,30);
        bTampil.setBounds(50,200,100,30);
        bAbout.setBounds(50,250,100,30);
    }
}


