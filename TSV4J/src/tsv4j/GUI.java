/*
 * AUTHOR: kevin51jiang
 
 LICENSING:
 
 
 
 */
package tsv4j;

import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bob Zhang
 */
public class GUI extends javax.swing.JFrame {

    File selectedFile = null;
    String[][] tsvData;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlChooseFile = new javax.swing.JPanel();
        txtAbsFilePath = new javax.swing.JTextField();
        btnChooseFile = new javax.swing.JButton();
        pnlImportExport = new javax.swing.JPanel();
        btnExportFile = new javax.swing.JButton();
        btnImportFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTSVData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(270, 280));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("TSV Editor");

        btnChooseFile.setText("Choose File");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChooseFileLayout = new javax.swing.GroupLayout(pnlChooseFile);
        pnlChooseFile.setLayout(pnlChooseFileLayout);
        pnlChooseFileLayout.setHorizontalGroup(
            pnlChooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChooseFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAbsFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChooseFile)
                .addContainerGap())
        );
        pnlChooseFileLayout.setVerticalGroup(
            pnlChooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChooseFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAbsFilePath)
                    .addComponent(btnChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExportFile.setText("Export File Data");
        btnExportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportFileActionPerformed(evt);
            }
        });

        btnImportFile.setText("Import File Data");
        btnImportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImportExportLayout = new javax.swing.GroupLayout(pnlImportExport);
        pnlImportExport.setLayout(pnlImportExportLayout);
        pnlImportExportLayout.setHorizontalGroup(
            pnlImportExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlImportExportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImportFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlImportExportLayout.setVerticalGroup(
            pnlImportExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImportExportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlImportExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportFile)
                    .addComponent(btnImportFile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblTSVData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTSVData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImportExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImportExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportFileActionPerformed
         if (null != this.selectedFile) {
            String allData = "";
            for (int i = 0; i < this.tsvData[0].length; ++i) {
                allData = allData + this.tsvData[0][i].replaceAll("\\\\", "\\\\\\\\") + "\t";
            }
            allData = allData.substring(0, allData.length() - 2) + "\r\n";
            DefaultTableModel model = (DefaultTableModel)this.tblTSVData.getModel();
            for (int i = 0; i < model.getRowCount(); ++i) {
                for (int j = 0; j < model.getColumnCount(); ++j) {
                    allData = allData + String.valueOf(model.getValueAt(i, j)).replaceAll("\\\\", "\\\\\\\\") + "\t";
                }
                allData = allData.substring(0, allData.length() - 2) + "\r\n";
            }
            
             try {
                 PrintWriter writer = new PrintWriter(selectedFile);
                 writer.print(allData);
                 writer.close();
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        }
    }//GEN-LAST:event_btnExportFileActionPerformed

     public static String[][] readFileSplit(File file, String delimiter) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        int numLines = 0;
        try {
            numLines = GUI.numLines(file.getAbsolutePath());
        }
        catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[][] data = new String[numLines][];
        for (int i = 0; i < numLines; ++i) {
            data[i] = input.nextLine().split(delimiter);
        }
        return data;
    }
    
    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TSV Files: *.tsv ", "tsv");
        JFileChooser chooser = new JFileChooser("F:\\Games");
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);//don't let them accept all files. Only TSVs, or else things will get messed up.
        
        if (chooser.showOpenDialog(null) == 0) {
            try {
                this.selectedFile = chooser.getSelectedFile();
                this.txtAbsFilePath.setText(this.selectedFile.getAbsolutePath());
                this.tsvData = GUI.readFileSplit(this.selectedFile, "\t");
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnChooseFileActionPerformed

    private void btnImportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportFileActionPerformed
        populateTable();
    }//GEN-LAST:event_btnImportFileActionPerformed
    
    public  void populateTable(){
        if (null != selectedFile) {
            DefaultTableModel model = (DefaultTableModel)this.tblTSVData.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            Object[] titles = this.tsvData[0];
            model.setColumnIdentifiers(titles);
            for (int i = 0; i < this.tsvData.length - 1; ++i) {
                model.addRow(this.tsvData[i + 1]);
            }
        }
    }
    
    void setIcon(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo_16x16.png")));
    }
    
    /**

     * Finds the number of lines in a text File.
     * Definitely NOT copied from StackOverflow here: https://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
     * @param filename The file that you are trying to get the number of lines of.

     * @return Returns the number of lines in a file.
     * @throws java.io.IOException

     */
    public static int numLines(String filename) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try {
            byte[] c = new byte[1024];
            int count = 0;
            int readChars = 0;
            boolean empty = true;
            while ((readChars = is.read(c)) != -1) {
                empty = false;
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
            }
            return (count == 0 && !empty) ? 1 : count;
        } finally {
            is.close();
        }
    }
    
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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnChooseFile;
    public javax.swing.JButton btnExportFile;
    public javax.swing.JButton btnImportFile;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblTitle;
    public javax.swing.JPanel pnlChooseFile;
    public javax.swing.JPanel pnlImportExport;
    public javax.swing.JTable tblTSVData;
    public javax.swing.JTextField txtAbsFilePath;
    // End of variables declaration//GEN-END:variables
}
