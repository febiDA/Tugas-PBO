package com.contactList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ModelPraktikum {
    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbcontact";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query

    public ModelPraktikum() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    public void insertData(String id, String nama, String nohp, String umur, String email){
        try {
            String query = "INSERT INTO `contact`(`nama`, `nohp`, `umur`, `email`) VALUES ('"+nama+"','"+nohp+"','"+umur+"','"+email+"')";//value 1 (id diskip)
            //String '"+String+"' kalau Int "+int+"
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public String[][] readData(){
        try{
            int jmlData = 0;//menampung jumlah data

            String data[][] = new String[getBanyakData()][5]; //baris, kolom nya ada 3

            String query = "Select * from`contact`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][2] = resultSet.getString("nohp");
                data[jmlData][3] = resultSet.getString("umur");
                data[jmlData][4] = resultSet.getString("email");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public int getBanyakData(){//menghitung jumlah baris
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from `contact`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                jmlData++;
            }
            return jmlData;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public void deleteData(String id) {
        try{
            String query = "DELETE FROM `contact` WHERE `id` = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");

        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

    public void updateData(String id, String nama, String nohp, String umur, String email){
        try{

            statement = koneksi.createStatement();

            String query = "UPDATE `contact` SET `id`='"+id+"',`nama`='"+nama+"',`nohp`='"+nohp+"',`umur`='"+umur+"', `email`='"+email+"' WHERE `id` = '"+id+"'";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Edit Data Sukses!");

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}