/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ProdutoDTO;
import DTO.VendaCacheDTO;
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
public class VendaCacheDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VendaCacheDTO> lista = new ArrayList<>();
    
    public void cadastrarVendaCache(VendaCacheDTO objvendacachedto) {
        String sql = "insert into venda_cache (produto_venda_cache, quantidade_venda_cache, preco_venda_cache) values (?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objvendacachedto.getNome_produto_cache());
            pstm.setInt(2, objvendacachedto.getQuantidade_venda_cache());
            pstm.setFloat(3, objvendacachedto.getValor_venda_cache());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendaCacheDAO Cadastrar: " + erro);
        }
    }
    
    public ArrayList<VendaCacheDTO> ListarVendaCache() {
        String sql = "select * from venda_cache";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                VendaCacheDTO objvendacacheDTO = new VendaCacheDTO();
                objvendacacheDTO.setNome_produto_cache(rs.getString("produto_venda_cache"));
                objvendacacheDTO.setQuantidade_venda_cache(rs.getInt("quantidade_venda_cache"));
                objvendacacheDTO.setValor_venda_cache(rs.getFloat("preco_venda_cache"));

                lista.add(objvendacacheDTO);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoVendaCacheDAO Listar: " + erro);
        }
        return lista;
    }
    
    public void excluirVendaCache(VendaCacheDTO objvendacachedto) {
        String sql = "delete from venda_cache";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DeletarDadosTabela VendaCacheDAO Excluir: " + erro);
        }
    }
    
}
