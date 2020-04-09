package koneksidatabase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerPraktikum {

    ModelPraktikum modelpraktikum;
    ViewPraktikum viewpraktikum;
    ViewFormEdit viewformedit;
    String dataterpilih = null;
    int baris,kolom;

    public ControllerPraktikum(ModelPraktikum modelpraktikum, ViewPraktikum viewpraktikum) {
        this.modelpraktikum = modelpraktikum;
        this.viewpraktikum = viewpraktikum;

        if (modelpraktikum.getBanyakData() != 0) {
            String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
            viewpraktikum.tabel.setModel((new JTable(dataMahasiswa, viewpraktikum.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        viewpraktikum.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                modelpraktikum.insertMahasiswa(nim, nama, alamat);

                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
            }
        });

        viewpraktikum.tabel.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
         super.mousePressed(e);
         baris = viewpraktikum.tabel.getSelectedRow();
         kolom = viewpraktikum.tabel.getSelectedColumn();

         dataterpilih = viewpraktikum.tabel.getValueAt(baris, 0).toString();

         System.out.println(dataterpilih);

         //int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus NIM" + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

             if (dataterpilih != null) {
                 viewpraktikum.btnHapus.setEnabled(true);
                 viewpraktikum.btnEdit.setEnabled(true);
             }
         }});

        viewpraktikum.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (dataterpilih != null) {
                        modelpraktikum.deleteMahasiswa(dataterpilih);
                        updateTable();
                        viewpraktikum.btnHapus.setEnabled(true);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    System.out.println("Gagal Hapus!");
                }
            }
        });

        viewpraktikum.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    if(dataterpilih != null){
                        String dataEditNim = viewpraktikum.tabel.getValueAt(baris,0).toString();
                        String dataEditNama = viewpraktikum.tabel.getValueAt(baris,1).toString();
                        String dataEditAlamat = viewpraktikum.tabel.getValueAt(baris,2).toString();

                        System.out.println("data edit terpilih :"+dataEditNim+" "+dataEditNama+" "+dataEditAlamat+"");
                        viewformedit = new ViewFormEdit();

                        viewpraktikum.dispose();
                        viewformedit.tfnim.setText(dataEditNim);
                        viewformedit.tfnama.setText(dataEditNama);
                        viewformedit.taalamat.setText(dataEditAlamat);
                        viewformedit.tfnim.setEditable(false);
                        viewformedit.btnTambahPanel.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                if(dataterpilih != null){
                                    modelpraktikum.updateMahasiswa(
                                            viewformedit.getTfnim(),
                                            viewformedit.getTfnama(),
                                            viewformedit.getTaalamat());
                                    viewformedit.dispose();
                                    MVC_praktikum mvc_praktikum = new MVC_praktikum();
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
        String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
        viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
    }
}
