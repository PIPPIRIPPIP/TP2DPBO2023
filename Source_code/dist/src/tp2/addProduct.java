/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// Import packages
package tp2;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author AYESHA ALI FIRDAUS
 */
public class addProduct extends javax.swing.JFrame {
    private dbConnection db;
    private String path;
    private File selectedFile;
    private File sourceFile = null;
    private File destinationFile = null;
    boolean update = false;
    private String idToko;
    private String idBarang;
    private Home home;

    /**
     * Creates new form addProduct
     */
    public addProduct() {
        initComponents();
        // Menghubugnkan ke database
        db = new dbConnection();
        // membuat window muncul di tengah
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // set update menjadi false
        update = false;
    }
    
    public addProduct(String idToko, Home home){
        initComponents();
        // Menghubugnkan ke database
        db = new dbConnection();
        // membuat window muncul di tengah
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // set update menjadi false
        update = false;
        this.idToko = idToko;
        this.home = home;
    }
    
    public addProduct(String idBarang, String namaBarang, String stokBarang, String hargaBarang, Home home){
        initComponents();
        // Menghubugnkan ke database
        db = new dbConnection();
        // membuat window muncul di tengah
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        update = false;
        this.idBarang = idBarang;
        this.home = home;
        // Set data ke dalam frame edit data
        id.setText(idBarang);
        nama.setText(namaBarang);
        stok.setText(stokBarang);
        harga.setText(hargaBarang);
        update = true;
    }
    
    // method untuk mereset form
    public void resetForm(){
        id.setText("");
        nama.setText("");
        stok.setText("");
        harga.setText("");
        jalur.setText("");
    }
    
    // method untuk menambahkan data ke dalam database
    public void insertData(){
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Data Yang Anda Masukkan Sudah Benar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            // jika user memilih ya maka akan masuk ke proses selanjutnya

            // mengambil data dari frame
            String id_barang = id.getText();
            String nama_barang = nama.getText();
            String stok_barang = stok.getText();
            String harga_barang = harga.getText();
            if(!id_barang.isEmpty() && !nama_barang.isEmpty() && !harga_barang.isEmpty() && destinationFile != null){
                // jika semua data sudah terisi maka dapat menambahkan data ke database
                String foto = destinationFile.toString();
                foto = foto.replace("\\", "\\\\");
                // membuat query untuk memasukkan data
                String sql = "INSERT INTO barang (id_barang, id_toko, nama, stok, foto, harga) VALUES "
                        + "('"+id_barang+"', '"+idToko+"', '"+nama_barang+"', '"+stok_barang+"', '"+foto+"', '"+harga_barang+"')";
                // menjalankan query
                db.updateQuery(sql);
                
                JOptionPane.showMessageDialog(null, "Berhasil menambahkan data!");
                // berpindah ke frame home
                this.dispose();
                home.tampilData();
                home.setVisible(true);
            }else{
                // jika data yang di isikan tidak lengkap
                 JOptionPane.showMessageDialog(null, "Isikan Data Secara Lengkap!");   
            }  
        }else{
            resetForm();
        }
    }
    
    // method untuk mengubah data
    public void updateData(){
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Data Yang Anda Masukkan Sudah Benar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION){
            // jika user memilih ya maka akan masuk ke proses selanjutnya

            // mengambil data dari frame
            String id_barang = id.getText();
            String nama_barang = nama.getText();
            String stok_barang = stok.getText();
            String harga_barang = harga.getText();
            if(!id_barang.isEmpty() && !nama_barang.isEmpty() && !harga_barang.isEmpty() && destinationFile != null){
                // jika semua data sudah terisi maka dapat mengubah data ke database
                String foto = destinationFile.toString();
                foto = foto.replace("\\", "\\\\");
                // membuat query untuk mengubah data
                String sql = "UPDATE barang SET id_barang = '"+id_barang+"', nama = '"+nama_barang+"', "
                        + "stok = '"+stok_barang+"', harga = '"+harga_barang+"' WHERE id_barang = '"+this.idBarang+"'";
                // menjalankan query
                db.updateQuery(sql);
                
                JOptionPane.showMessageDialog(null, "Berhasil mengubah data!");
                // berpindah ke frame home
                this.dispose();
                home.tampilData();
            }else{
                 JOptionPane.showMessageDialog(null, "Isikan Data Secara Lengkap!");   
            }  
        }else{
            resetForm();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jalur = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel1.setText("Tambah Barang");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Stok Barang");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("Harga Barang");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Foto Barang");

        uploadButton.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        uploadButton.setText("Upload File");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(204, 255, 102));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel.setText("ID BARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(nama)
                            .addComponent(stok)
                            .addComponent(harga)
                            .addComponent(jLabel)
                            .addComponent(id)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uploadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jalur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uploadButton)
                    .addComponent(jalur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // Setting untuk tombol upload
        try{
            JFileChooser choose = new JFileChooser();
            choose.showOpenDialog(null);
            choose.setCurrentDirectory(new File(System.getProperty("user.home")));
            selectedFile = choose.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            jalur.setText(path);
            
            String newPath = "src/resource/images/fotoBarang/";
            File directory = new File(newPath);
            if(!directory.exists()){
                directory.mkdirs();
            }
            
            String namaFile = selectedFile.getName();
            sourceFile = new File(path);
            destinationFile = new File(newPath+"/"+namaFile);
            
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Upload Error!");
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Setting untuk tombol cancel
        this.dispose();
        // kembali ke home
        home.tampilData();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // Setting untuk tombol submit
        if(update == true){
            // jika menjalankan edit data
            updateData();
        }else{
            // jika tambah data
            insertData();
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jalur;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField stok;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
