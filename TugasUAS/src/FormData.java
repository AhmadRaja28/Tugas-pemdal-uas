import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class FormData {
    private JTextField textnama;
    private JComboBox comboBoxtanggal;
    private JComboBox comboBoxbulan;
    private JComboBox comboBoxtahun;
    private JTextField textUKT;
    private JPanel root;
    private JTable tableOutput;
    private JButton buttonsimpan;
    private DefaultTableModel tableModel;

    public int no;

    public FormData() {
        initComponents();
        buttonsimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textnama.getText().isBlank() || textUKT.getText().isBlank()){
                    JOptionPane.showMessageDialog(null, "Data tidak Lengkap!");
                    return;
                }

                OOPClass oopClass = new OOPClass();

                oopClass.setNama(textnama.getText());

                int tahun = Integer.parseInt(comboBoxtahun.getSelectedItem().toString());
                int bulan = Integer.parseInt(comboBoxbulan.getSelectedItem().toString());
                int tanggal = Integer.parseInt(comboBoxtanggal.getSelectedItem().toString());

                oopClass.setTTL(LocalDate.of(tahun, bulan, tanggal));

                oopClass.setUKT(Long.valueOf(textUKT.getText()));
                no++;
                Object[] baris = {no, oopClass.getNama(), oopClass.getTTL(), oopClass.Penghitungumur(), oopClass.PengkategorianUKT()};
                tableModel.addRow(baris);

                JOptionPane.showMessageDialog(null,"Data Berhasil disimpan");
            }
        });
    }
        public void initComponents(){

            Object[] kolom = {"No.", "Nama", "Tgl Lahir", "Usia", "Jenis UKT"};
            Object[][] baris = {};

            tableModel = new DefaultTableModel(baris, kolom);
            tableOutput.setModel(tableModel);
            tableOutput.setAutoCreateRowSorter(true);
        }

    public JPanel getRoot() {
        return root;
    }
}

