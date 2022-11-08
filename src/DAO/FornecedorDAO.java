/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FornecedorDTO;
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
public class FornecedorDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> lista = new ArrayList<>();

    public void cadastrarFornecedor(FornecedorDTO objfornecedordto) {
        String sql = "insert into fornecedor (nome_fornecedor, cnpj_fornecedor, telefone_fornecedor, localidade_fornecedor) values (?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordto.getNome_fornecedor());
            pstm.setString(2, objfornecedordto.getCnpj_fornecedor());
            pstm.setString(3, objfornecedordto.getTelefone_fornecedor());
            pstm.setString(4, objfornecedordto.getLocalidade_fornecedor());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Cadastrar: " + erro);
        }
    }

    public ArrayList<FornecedorDTO> ListarFornecedor() {
        String sql = "select * from fornecedor";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                FornecedorDTO objfornecedorDTO = new FornecedorDTO();
                objfornecedorDTO.setId_fornecedor(rs.getInt("id_fornecedor"));
                objfornecedorDTO.setNome_fornecedor(rs.getString("nome_fornecedor"));
                objfornecedorDTO.setCnpj_fornecedor(rs.getString("cnpj_fornecedor"));
                objfornecedorDTO.setTelefone_fornecedor(rs.getString("telefone_fornecedor"));
                objfornecedorDTO.setLocalidade_fornecedor(rs.getString("localidade_fornecedor"));

                lista.add(objfornecedorDTO);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Listar: " + erro);
        }
        return lista;
    }
    
    public void alterarFornecedor(FornecedorDTO objfornecedordto) {
        String sql = "update fornecedor set nome_fornecedor = ?, cnpj_fornecedor = ?, telefone_fornecedor = ?, localidade_fornecedor = ? where id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordto.getNome_fornecedor());
            pstm.setString(2, objfornecedordto.getCnpj_fornecedor());
            pstm.setString(3, objfornecedordto.getTelefone_fornecedor());
            pstm.setString(4, objfornecedordto.getLocalidade_fornecedor());
            pstm.setInt(5, objfornecedordto.getId_fornecedor());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Alterar: " + erro);
        }
    }

     public void excluirFornecedor(FornecedorDTO objfornecedordto) {
        String sql = "delete from fornecedor where id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objfornecedordto.getId_fornecedor());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Excluir: " + erro);
        }
    }
}
