package DAO;

import DTO.ProdutoDTO;
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
public class ProdutoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();

    public void cadastrarProduto(ProdutoDTO objprodutodto) {
        String sql = "insert into produto (nome_produto, quant_produto, cod_produto, valor_compra, valor_venda, id_marca) values (?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();
        
      

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto());
            pstm.setInt(2, objprodutodto.getQuant_produto());
            pstm.setString(3, objprodutodto.getCod_produto());
            pstm.setFloat(4, objprodutodto.getValor_compra());
            pstm.setFloat(5, objprodutodto.getValor_venda());
            pstm.setInt(6, objprodutodto.getId_marca());
           
            
            
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Cadastrar: " + erro);
        }
    }
    

    public ArrayList<ProdutoDTO> ListarProduto() {
        String sql = "select * from produto";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                ProdutoDTO objprodutoDTO = new ProdutoDTO();
                objprodutoDTO.setId_produto(rs.getInt("id_produto"));
                objprodutoDTO.setNome_produto(rs.getString("nome_produto"));
                objprodutoDTO.setQuant_produto(rs.getInt("quant_produto"));
                objprodutoDTO.setCod_produto(rs.getString("cod_produto"));
                objprodutoDTO.setValor_compra(rs.getFloat("valor_compra"));
                objprodutoDTO.setValor_venda(rs.getFloat("valor_venda"));
                objprodutoDTO.setId_marca(rs.getInt("id_marca"));

                lista.add(objprodutoDTO);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Listar: " + erro);
        }
        return lista;
    }

    public void alterarProduto(ProdutoDTO objprodutodto) {
        String sql = "update produto set nome_produto = ?, quant_produto = ?, cod_produto = ?, valor_compra = ?, valor_venda = ? where id_produto = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto());
            pstm.setInt(2, objprodutodto.getQuant_produto());
            pstm.setString(3, objprodutodto.getCod_produto());
            pstm.setFloat(4, objprodutodto.getValor_compra());
            pstm.setFloat(5, objprodutodto.getValor_venda());
            pstm.setInt(6, objprodutodto.getId_produto());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Alterar: " + erro);
        }
    }

    public void excluirProduto(ProdutoDTO objprodutodto) {
        String sql = "delete from produto where id_produto = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objprodutodto.getId_produto());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Excluir: " + erro);
        }
    }

    public ResultSet listarMarca() {
        conn = new ConexaoDAO().conectaBD();
        String sql = "select * from marca order by nome_marca";

        try {
            
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO listarMarca: " + erro);
            return null;
        } 
    }
}
        
