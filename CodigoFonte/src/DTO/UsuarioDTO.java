
package DTO;

public class UsuarioDTO {
    
    private int id_usuario;
    private String usuario_usuario, senha_usuario, nome_usuario, matricula_usuario, email_usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario_usuario() {
        return usuario_usuario;
    }

    public void setUsuario_usuario(String nome_usuario) {
        this.usuario_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getMatricula_usuario() {
        return matricula_usuario;
    }

    public void setMatricula_usuario(String matricula_usuario) {
        this.matricula_usuario = matricula_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }
    
}
