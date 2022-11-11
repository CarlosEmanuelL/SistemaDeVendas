/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author carlos
 */
public class VendaCacheDTO {
    private String nome_produto_cache;
    private int id_venda_cache, quantidade_venda_cache;
    private float valor_venda_cache;

    public String getNome_produto_cache() {
        return nome_produto_cache;
    }

    public void setNome_produto_cache(String nome_produto_cache) {
        this.nome_produto_cache = nome_produto_cache;
    }

    public int getId_venda_cache() {
        return id_venda_cache;
    }

    public void setId_venda_cache(int id_venda_cache) {
        this.id_venda_cache = id_venda_cache;
    }

    public int getQuantidade_venda_cache() {
        return quantidade_venda_cache;
    }

    public void setQuantidade_venda_cache(int quantidade_venda_cache) {
        this.quantidade_venda_cache = quantidade_venda_cache;
    }

    public float getValor_venda_cache() {
        return valor_venda_cache;
    }

    public void setValor_venda_cache(float valor_venda_cache) {
        this.valor_venda_cache = valor_venda_cache;
    }

}
