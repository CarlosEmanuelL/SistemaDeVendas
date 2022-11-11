/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author carlos
 */
public class VendaTotalDTO {
    private int id_venda;
    private String cliente_venda, forma_pagamento_venda;
    private float desconto_venda, valor_pago_venda, total_produto_venda,total_venda, troco_venda;

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getCliente_venda() {
        return cliente_venda;
    }

    public void setCliente_venda(String cliente_venda) {
        this.cliente_venda = cliente_venda;
    }

    public String getForma_pagamento_venda() {
        return forma_pagamento_venda;
    }

    public void setForma_pagamento_venda(String forma_pagamento_venda) {
        this.forma_pagamento_venda = forma_pagamento_venda;
    }

    public float getDesconto_venda() {
        return desconto_venda;
    }

    public void setDesconto_venda(float desconto_venda) {
        this.desconto_venda = desconto_venda;
    }

    public float getValor_pago_venda() {
        return valor_pago_venda;
    }

    public void setValor_pago_venda(float valor_pago_venda) {
        this.valor_pago_venda = valor_pago_venda;
    }

    public float getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(float total_venda) {
        this.total_venda = total_venda;
    }

    public float getTotal_produto_venda() {
        return total_produto_venda;
    }

    public void setTotal_produto_venda(float total_produto_venda) {
        this.total_produto_venda = total_produto_venda;
    }

    public float getTroco_venda() {
        return troco_venda;
    }

    public void setTroco_venda(float troco_venda) {
        this.troco_venda = troco_venda;
    }

  
}
