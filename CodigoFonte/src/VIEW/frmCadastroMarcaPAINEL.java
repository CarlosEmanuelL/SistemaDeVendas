/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.MarcaDAO;
import DTO.MarcaDTO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class frmCadastroMarcaPAINEL extends javax.swing.JPanel {

    /**
     * Creates new form frmCadastroMarcaPAINEL
     */
    public frmCadastroMarcaPAINEL() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMarca = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNomeMarca = new javax.swing.JTextField();
        txtCodigoMarca = new javax.swing.JTextField();
        txtIdMarca = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        btnVerificar = new javax.swing.JToggleButton();
        btnCadastrar = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnCarregar = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(916, 762));

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 89, 163));
        jLabel1.setText("Cadastro de Marcas");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 89, 163));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 89, 163));
        jLabel3.setText("C??digo:");

        tabelaMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "C??digo"
            }
        ));
        jScrollPane1.setViewportView(tabelaMarca);

        jLabel4.setFont(new java.awt.Font("Noto Sans Mono CJK HK", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 89, 163));
        jLabel4.setText("ID Marca");

        txtIdMarca.setEnabled(false);

        btnCancelar.setBackground(new java.awt.Color(25, 89, 163));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(25, 89, 163));
        btnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificar.setText("Verificar");
        btnVerificar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(25, 89, 163));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(25, 89, 163));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(25, 89, 163));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(86, 23));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCarregar.setBackground(new java.awt.Color(25, 89, 163));
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("Carregar");
        btnCarregar.setPreferredSize(new java.awt.Dimension(86, 23));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarMarca();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        listarValores();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarMarca();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirMarca();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnCarregar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMarca;
    private javax.swing.JTextField txtCodigoMarca;
    private javax.swing.JTextField txtIdMarca;
    private javax.swing.JTextField txtNomeMarca;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {

        try {
            MarcaDAO objmarcadao = new MarcaDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaMarca.getModel();
            model.setNumRows(0);

            ArrayList<MarcaDTO> lista = objmarcadao.ListarMarca();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_marca(),
                    lista.get(num).getNome_marca(),
                    lista.get(num).getCodigo_marca()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);
        }
    }

    private void LimparCampos() {
        txtCodigoMarca.setText("");
        txtNomeMarca.setText("");
        txtNomeMarca.requestFocus();
    }

    private void CarregarCampos() {
        int setar = tabelaMarca.getSelectedRow();

        txtIdMarca.setText(tabelaMarca.getModel().getValueAt(setar, 0).toString());
        txtNomeMarca.setText(tabelaMarca.getModel().getValueAt(setar, 1).toString());
        txtCodigoMarca.setText(tabelaMarca.getModel().getValueAt(setar, 2).toString());
        
    }
    
    private void AlterarMarca() {
        int id_marca;
        String nomeMarca, codigoMarca;

        id_marca = Integer.parseInt(txtIdMarca.getText());
        nomeMarca = txtNomeMarca.getText();
        codigoMarca = txtCodigoMarca.getText();
        
        MarcaDTO objmarcadto = new MarcaDTO();
        objmarcadto.setId_marca(id_marca);
        objmarcadto.setNome_marca(nomeMarca);
        objmarcadto.setCodigo_marca(codigoMarca);
       

        MarcaDAO objmarcadao = new MarcaDAO();
        objmarcadao.alterarMarca(objmarcadto);

    }

    private void CadastrarMarca() {
        String nomeMarca, codigoMarca;

        nomeMarca = txtNomeMarca.getText();
        codigoMarca = txtCodigoMarca.getText();

        MarcaDTO objmarcadto = new MarcaDTO();
        objmarcadto.setNome_marca(nomeMarca);
        objmarcadto.setCodigo_marca(codigoMarca);

        MarcaDAO objmarcadao = new MarcaDAO();
        objmarcadao.cadastrarMarca(objmarcadto);
    }
    
     private void ExcluirMarca() {
        int id_marca;
        String nomeMarca, codigoMarca;

        id_marca = Integer.parseInt(txtIdMarca.getText());
        nomeMarca = txtNomeMarca.getText();
        codigoMarca = txtCodigoMarca.getText();

        MarcaDTO objmarcadto = new MarcaDTO();
        objmarcadto.setId_marca(id_marca);
        objmarcadto.setNome_marca(nomeMarca);
        objmarcadto.setCodigo_marca(codigoMarca);

        MarcaDAO objmarcadao = new MarcaDAO();
        objmarcadao.excluirMarca(objmarcadto);
    }

}
