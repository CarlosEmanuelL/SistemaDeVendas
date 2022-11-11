package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where usuario_usuario = ? and senha_usuario = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getUsuario_usuario());
            pstm.setString(2,objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
    
    public void cadastrarUsuario(UsuarioDTO objusuariodto) {
        String sql = "insert into usuario (usuario_usuario ,senha_usuario, nome_usuario, matricula_usuario, email_usuario) values (?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getUsuario_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            pstm.setString(3, objusuariodto.getNome_usuario());
            pstm.setString(4, objusuariodto.getMatricula_usuario());
            pstm.setString(5, objusuariodto.getEmail_usuario());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Cadastrar: " + erro);
        }
    }

    public ArrayList<UsuarioDTO> ListarUsuario() {
        String sql = "select * from usuario";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                UsuarioDTO objusuarioDTO = new UsuarioDTO();
                objusuarioDTO.setId_usuario(rs.getInt("id_usuario"));
                objusuarioDTO.setUsuario_usuario(rs.getString("usuario_usuario"));
                objusuarioDTO.setSenha_usuario(rs.getString("senha_usuario"));
                objusuarioDTO.setNome_usuario(rs.getString("nome_usuario"));
                objusuarioDTO.setMatricula_usuario(rs.getString("matricula_usuario"));
                objusuarioDTO.setEmail_usuario(rs.getString("email_usuario"));

                lista.add(objusuarioDTO);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Listar: " + erro);
        }
        return lista;
    }
    
    public void alterarUsuario(UsuarioDTO objusuariodto) {
        String sql = "update usuario set usuario_usuario = ?, senha_usuario = ?, nome_usuario = ?, matricula_usuario = ?, email_usuario = ? where id_usuario = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getUsuario_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            pstm.setString(3, objusuariodto.getNome_usuario());
            pstm.setString(4, objusuariodto.getMatricula_usuario());
            pstm.setString(5, objusuariodto.getEmail_usuario());
            pstm.setInt(6, objusuariodto.getId_usuario());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Alterar: " + erro);
        }
    }

     public void excluirUsuario(UsuarioDTO objusuariodto) {
        String sql = "delete from usuario where id_usuario = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objusuariodto.getId_usuario());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Excluir: " + erro);
        }
    }
    
}
