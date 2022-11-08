/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.VendaTotalDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author carlos
 */
public class VendaTotalDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VendaTotalDTO> lista = new ArrayList<>();
    
     public void cadastrarVendaTotal(VendaTotalDTO objvendatotaldto) {
        String sql = "insert into venda (cliente_venda, desconto_venda, forma_pagamento_venda, valor_pago_venda, total_produto_venda, total_venda, troco_venda) values (?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objvendatotaldto.getCliente_venda());
            pstm.setFloat(2, objvendatotaldto.getDesconto_venda());
            pstm.setString(3, objvendatotaldto.getForma_pagamento_venda());
            pstm.setFloat(4, objvendatotaldto.getValor_pago_venda());
            pstm.setFloat(5, objvendatotaldto.getTotal_produto_venda());
            pstm.setFloat(6, objvendatotaldto.getTotal_venda());
            pstm.setFloat(7, objvendatotaldto.getTroco_venda());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendaTotalDAO Cadastrar: " + erro);
        }
    }
}
