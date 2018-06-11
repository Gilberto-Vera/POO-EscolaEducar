/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.frame;

import br.edu.ifg.escolaAprender.util.BancoDeDados;
import br.edu.ifg.escolaAprender.vo.Professor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author gilberto
 */
public class FrmConsProfessor extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsProfessor
     */
    public FrmConsProfessor() {
        initComponents();
        setLocationRelativeTo(null);
        carregarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsProf = new javax.swing.JTable();

        tblConsProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblConsProf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmConsProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsProf;
    // End of variables declaration//GEN-END:variables

    private void carregarLista() {
        
        TableModel modeloDadosAluno = new AbstractTableModel() {
            private List<Professor> professores = BancoDeDados.getProfessores();
            private String[] colunas = new String[]{"Matrícula", "Nome", "Data de Nasc.", "Endereço", "Setro", "Área de Especialização"};
            
            @Override
            public int getRowCount() {
                return professores.size();
            }

            @Override
            public int getColumnCount() {
                return 6;
            }
            
            @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Object valorCelula = null;
                    switch(columnIndex) {
                        case 0:
                            valorCelula = professores.get(rowIndex).getCodigo();
                            break;
                        case 1:
                            valorCelula = professores.get(rowIndex).getNome();
                            break;
                        case 2:
                            valorCelula = professores.get(rowIndex).getDataNascimento();
                            break;
                        case 3:
                            valorCelula = professores.get(rowIndex).getEndereco();
                            break;
                        case 4:
                            valorCelula = professores.get(rowIndex).getSetor();
                            break;
                        case 5:
                            valorCelula = professores.get(rowIndex).getAreaEspecializacao();
                            break;
                    }
                    return valorCelula;
                }
                
            @Override
            public String getColumnName(int column) {
                return colunas[column];
            }

        };
        tblConsProf.setModel(modeloDadosAluno);
    }
}
