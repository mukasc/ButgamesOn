/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Entity
@Table(name="compras_pedidos")
public class CompraPedido implements Serializable{

    @EmbeddedId
    private CompraPedidoPK itemPedidoPK;

    @Column(name="quantidade")
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name="compra", insertable=false, updatable=false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name="produto", insertable=false, updatable=false)
    private Produto produto;

    public Compra getCompra() {
        return compra;
    }

    public CompraPedidoPK getItemPedidoPK() {
        return itemPedidoPK;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setItemPedidoPK(CompraPedidoPK itemPedidoPK) {
        this.itemPedidoPK = itemPedidoPK;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
}
