/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author Caio
 */
public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO objclientedto) {
        String sql = "insert into cliente (nome_cliente, endereco_cliente, telefone_cliente, cep_cliente) values (?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getEndereco_cliente());
            pstm.setString(3, objclientedto.getTelefone_cliente());
            pstm.setString(4, objclientedto.getCep_cliente());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Cadastrar: " + erro);
        }
    }

    public ArrayList<ClienteDTO> ListarCliente() {
        String sql = "select * from cliente";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                ClienteDTO objclienteDTO = new ClienteDTO();
                objclienteDTO.setId_cliente(rs.getInt("id_cliente"));
                objclienteDTO.setNome_cliente(rs.getString("nome_cliente"));
                objclienteDTO.setEndereco_cliente(rs.getString("endereco_cliente"));
                objclienteDTO.setTelefone_cliente(rs.getString("telefone_cliente"));
                objclienteDTO.setCep_cliente(rs.getString("cep_cliente"));

                lista.add(objclienteDTO);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Listar: " + erro);
        }
        return lista;
    }
    
    public void alterarCliente(ClienteDTO objclientedto) {
        String sql = "update cliente set nome_cliente = ?, endereco_cliente = ?, telefone_cliente = ?, cep_cliente = ? where id_cliente = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getEndereco_cliente());
            pstm.setString(3, objclientedto.getTelefone_cliente());
            pstm.setString(4, objclientedto.getCep_cliente());
            pstm.setInt(5, objclientedto.getId_cliente());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Alterar: " + erro);
        }
    }

     public void excluirCliente(ClienteDTO objclientedto) {
        String sql = "delete from cliente where id_cliente = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objclientedto.getId_cliente());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir: " + erro);
        }
    }
}
