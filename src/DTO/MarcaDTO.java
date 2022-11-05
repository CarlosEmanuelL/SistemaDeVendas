/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author carlos
 */
public class MarcaDTO {
    private int id_marca;
    private String nome_marca, codigo_marca;

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNome_marca() {
        return nome_marca;
    }

    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }

    public String getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(String codigo_marca) {
        this.codigo_marca = codigo_marca;
    }
}
