package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Model {

    Connection koneksi ;
    Statement statement ;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/db_perpustakaan";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }

    public void insertData (String id_anggota , String nama, String id_buku , String judul_buku) {
        try {
            String query = "INSERT INTO `anggota` (`id_anggota`,`nama`,`id_buku`,`judul_buku`) "
                    + "VALUES ( '"+id_anggota+"', '"+nama+"', '"+id_buku+"', '"+judul_buku+"' )";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Kontak!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] readData() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getData()] [5];
            String query = "Select * FROM anggota";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("id_anggota");
                data[jumlah][1] = rs.getString("nama");
                data[jumlah][2] = rs.getString("id_buku");
                data[jumlah][3] = rs.getString("judul_buku");
                jumlah++;
            }
            return data;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }

    public int getData () {
        int jumlahData =0 ;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM anggota ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next() ) {
                jumlahData ++ ;
            }
            return jumlahData;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return 0;
        }
    }

    public void hapusData(String id_anggota) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = " DELETE FROM anggota WHERE `id_anggota` = '"+id_anggota+"' ";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }

    public void updateData (String id_anggota , String nama, String id_buku , String judul_buku){
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `anggota` SET `id_anggota` = '"+id_anggota+"', `nama` = '"+nama+"', `id_buku` = '"+id_buku+"', `judul_buku` = '"+judul_buku+"' "+"WHERE `id_anggota` = '"+id_anggota+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil di update");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
