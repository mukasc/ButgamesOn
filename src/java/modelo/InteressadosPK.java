/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Diego
 */
@Embeddable
public class InteressadosPK implements Serializable{
    @Column(name="id_ofertas")
    private int compra;

    @Column(name="id_pessoas")
    private int produto;

    public int getCompra() {
        return compra;
    }

    public int getProduto() {
        return produto;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    

}
