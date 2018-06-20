/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.escolaAprender.frame;

import br.edu.ifg.escolaAprender.util.BancoDeDados;
import br.edu.ifg.escolaAprender.vo.Disciplina;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author gilberto
 */
public class FrmConsDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsDisciplina
     */
    public FrmConsDisciplina() {
        initComponents();
        setLocationRelativeTo(null);
        
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
                carregarLista();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
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
        tblConsDisc = new javax.swing.JTable();

        setTitle("Consulta de Disciplina");
        setPreferredSize(new java.awt.Dimension(600, 300));

        tblConsDisc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblConsDisc);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsDisc;
    // End of variables declaration//GEN-END:variables

    private void carregarLista() {
                
        TableModel modeloDadosAluno = new AbstractTableModel() {
            private List<Disciplina> disciplinas = BancoDeDados.getDisciplinas();
            private String[] colunas = new String[]{"Código", "Nome", "Professor", "Semestre", "Ano"};
            
            @Override
            public int getRowCount() {
                return disciplinas.size();
            }

            @Override
            public int getColumnCount() {
                return 5;
            }
            
            @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Object valorCelula = null;
                    switch(columnIndex) {
                        case 0:
                            valorCelula = disciplinas.get(rowIndex).getCodigo();
                            break;
                        case 1:
                            valorCelula = disciplinas.get(rowIndex).getNome();
                            break;
                        case 2:
                            valorCelula = disciplinas.get(rowIndex).getProfessor();
                            break;
                        case 3:
                            valorCelula = disciplinas.get(rowIndex).getSemestre();
                            break;
                        case 4:
                            valorCelula = disciplinas.get(rowIndex).getAno();
                            break;
                    }
                    return valorCelula;
                }
                
            @Override
            public String getColumnName(int column) {
                return colunas[column];
            }

        };
        tblConsDisc.setModel(modeloDadosAluno);
    }
}
