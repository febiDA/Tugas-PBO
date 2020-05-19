package View;

import javax.swing.*;
import java.awt.*;

public class ViewLogin extends JFrame{
    Font fJudul;
    JLabel lJudul, lUsername, lPassword;
    public JTextField tfUser;
    JPasswordField tfPassword;
    public JButton bLogin, bExit;

    public ViewLogin() {
        setTitle("PERPUSTAKAAN");
        fJudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        lJudul = new JLabel("-LOGIN-");
        lJudul.setFont(fJudul);
        lUsername = new JLabel("Username : ");
        tfUser = new JTextField();
        lPassword = new JLabel("Password : ");
        tfPassword = new JPasswordField();

        bLogin = new JButton("Login");
        bExit = new JButton("Exit");

        setLayout(null);
        add(lJudul);
        add(lUsername);
        add(lPassword);
        add(tfUser);
        add(tfPassword);
        add(bLogin);
        add(bExit);

        lJudul.setBounds(160, 30, 100, 20);
        lUsername.setBounds(70, 70, 80, 25);
        tfUser.setBounds(160, 70, 145, 25);
        lPassword.setBounds(70, 110, 80, 25);
        tfPassword.setBounds(160, 110, 145, 25);
        bLogin.setBounds(160, 150, 80, 25);
        bExit.setBounds(245, 150, 80, 25);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUser() {
        return tfUser.getText();
    }

    public String getPassword() {
        return tfPassword.getText();
    }

}
