/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.MarcaDTO;
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
public class MarcaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<MarcaDTO> lista = new ArrayList<>();

    public void cadastrarMarca(MarcaDTO objmarcadto) {
        String sql = "insert into marca (nome_marca, codigo_marca) values (?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objmarcadto.getNome_marca());
            pstm.setString(2, objmarcadto.getCodigo_marca());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "MarcaDAO Cadastrar: " + erro);
        }
    }

    public ArrayList<MarcaDTO> ListarMarca() {
        String sql = "select * from marca";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                MarcaDTO objmarcaDTO = new MarcaDTO();
                objmarcaDTO.setId_marca(rs.getInt("id_marca"));
                objmarcaDTO.setNome_marca(rs.getString("nome_marca"));
                objmarcaDTO.setCodigo_marca(rs.getString("codigo_marca"));

                lista.add(objmarcaDTO);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "MarcaDAO Listar: " + erro);
        }
        return lista;
    }
    
    public void alterarMarca(MarcaDTO objmarcadto) {
        String sql = "update marca set nome_marca = ?, codigo_marca = ? where id_marca = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objmarcadto.getNome_marca());
            pstm.setString(2, objmarcadto.getCodigo_marca());
            pstm.setInt(3, objmarcadto.getId_marca());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "MarcaDAO Alterar: " + erro);
        }
    }

     public void excluirMarca(MarcaDTO objmarcadto) {
        String sql = "delete from marca where id_marca = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objmarcadto.getId_marca());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "MarcaDAO Excluir: " + erro);
        }
    }
    
}
