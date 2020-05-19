package Controller;

import MVC.MVC;
import Model.Model;
import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller {
    ViewHome viewHome;
    ViewPinjam viewPinjam;
    ViewTampil viewTampil;
    ViewAbout viewAbout;
    ViewEdit viewEdit;
    Model model;
    String dataterpilih = null;
    int baris,kolom;

        public Controller(ViewHome viewHome, ViewPinjam viewPinjam, Model model, ViewTampil viewTampil, ViewAbout viewAbout) {
            this.model = model;
            this.viewHome = viewHome;
            this.viewPinjam = viewPinjam;
            this.viewTampil = viewTampil;
            this.viewEdit = viewEdit;

            if (model.getData() != 0) {
                String dataMahasiswa[][] = model.readData();
                viewTampil.tabel.setModel(new JTable(dataMahasiswa, viewTampil.namaKolom).getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ada");
            }

            viewTampil.tabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                    baris = viewTampil.tabel.getSelectedRow();
                    kolom = viewTampil.tabel.getSelectedColumn();

                    dataterpilih = viewTampil.tabel.getValueAt(baris, 0).toString();
                    System.out.println(dataterpilih);
                    if (dataterpilih != null) {
                        viewTampil.bhapus.setEnabled(true);
                        viewTampil.bEdit.setEnabled(true);
                    }
                }
            });

            viewPinjam.bHome.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewHome.setVisible(true);
                    viewPinjam.setVisible(false);
                }
            });

            viewHome.bHome.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewHome.setVisible(false);
                    viewHome.setVisible(true);
                }
            });

            viewTampil.bHome.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewHome.setVisible(true);
                    viewTampil.setVisible(false);
                }
            });

            viewAbout.bHome.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewHome.setVisible(true);
                    viewAbout.setVisible(false);
                }
            });

            viewHome.bPinjam.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewPinjam.setVisible(true);
                    viewHome.setVisible(false);
                }
            });

            viewTampil.bPinjam.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewPinjam.setVisible(true);
                    viewTampil.setVisible(false);
                }
            });

            viewAbout.bPinjam.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewPinjam.setVisible(true);
                    viewAbout.setVisible(false);
                }
            });

            viewPinjam.bBatal.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    //String datas[][] = model.readData();
                    viewPinjam.tfId_anggota.setText("");
                    viewPinjam.tfnama.setText("");
                    viewPinjam.tfId_buku.setText("");
                    viewPinjam.tfJudul_buku.setText("");
                }
            });

            viewPinjam.bTampil.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewTampil.setVisible(true);
                    viewPinjam.setVisible(false);
                }
            });

            viewHome.bTampil.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewTampil.setVisible(true);
                    viewHome.setVisible(false);
                }
            });

            viewAbout.bTampil.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewTampil.setVisible(true);
                    viewAbout.setVisible(false);
                }
            });

            viewPinjam.bAbout.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewAbout.setVisible(true);
                    viewPinjam.setVisible(false);
                }
            });

            viewTampil.bAbout.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewAbout.setVisible(true);
                    viewTampil.setVisible(false);
                }
            });

            viewTampil.bAbout.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewAbout.setVisible(true);
                    viewTampil.setVisible(false);
                }
            });

            viewHome.bAbout.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    viewAbout.setVisible(true);
                    viewHome.setVisible(false);
                }
            });

            viewPinjam.bTambah.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (viewPinjam.getId_anggota().equals("")
                            || viewPinjam.getNama().equals("")
                            || viewPinjam.getId_buku().equals("")
                            || viewPinjam.getJudul_buku().equals("")) {
                        JOptionPane.showMessageDialog(null, "field kosong");
                    } else {
                        String id_anggota = viewPinjam.getId_anggota();
                        String nama = viewPinjam.getNama();
                        String id_buku = viewPinjam.getId_buku();
                        String judul_buku = viewPinjam.getJudul_buku();
                        model.insertData(id_anggota, nama, id_buku, judul_buku);
                        viewPinjam.tfId_anggota.setText("");
                        viewPinjam.tfnama.setText("");
                        viewPinjam.tfId_buku.setText("");
                        viewPinjam.tfJudul_buku.setText("");

                        updateTable();
                    }
                }
             });

            viewTampil.bhapus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    try {
                        if (dataterpilih != null) {
                            model.hapusData(dataterpilih);
                            updateTable();
                            viewTampil.bhapus.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        System.out.println("Gagal Hapus!");
                    }
                }
            });

            viewTampil.bEdit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    try{
                        if(dataterpilih != null){
                            String dataEditId_anggota = viewTampil.tabel.getValueAt(baris,0).toString();
                            String dataEditNama = viewTampil.tabel.getValueAt(baris,1).toString();
                            String dataEditId_buku = viewTampil.tabel.getValueAt(baris,2).toString();
                            String dataEditJudul_buku = viewTampil.tabel.getValueAt(baris,3).toString();

                            System.out.println("data edit terpilih :"+dataEditId_anggota+" "+dataEditNama+" "+dataEditId_buku+" "+dataEditJudul_buku+"");
                            viewEdit = new ViewEdit();

                            viewTampil.dispose();
                            viewEdit.tfId_anggota.setText(dataEditId_anggota);
                            viewEdit.tfNama.setText(dataEditNama);
                            viewEdit.tfId_buku.setText(dataEditId_buku);
                            viewEdit.tfJudul_buku.setText(dataEditJudul_buku);
                            viewEdit.tfId_anggota.setEditable(false);
                            viewEdit.bEdit.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent ae) {
                                    if(dataterpilih != null){
                                        model.updateData(
                                                viewEdit.getId_anggota(),
                                                viewEdit.getNama(),
                                                viewEdit.getId_buku(),
                                                viewEdit.getJudul_buku());
                                        viewEdit.dispose();
                                        updateTable();
                                        viewTampil.setVisible(true);
//                                        MVC mvc = new MVC();
                                    }
                                }
                            });
                        }
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                        System.out.println("Edit Gagal!");
                    }
                }
            });
        }

        private void updateTable() {
            String dataMahasiswa[][] = model.readData();
            viewTampil.tabel.setModel(new JTable(dataMahasiswa, viewTampil.namaKolom).getModel());
        }
}

