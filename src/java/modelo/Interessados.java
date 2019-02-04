/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
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
@Table(name="interessados")
public class Interessados implements Serializable{
    @EmbeddedId
    private InteressadosPK itemPedidoPK;
    
    @ManyToOne
    @JoinColumn(name="pessoa", insertable=false, updatable=false)
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name="oferta", insertable=false, updatable=false)
    private Oferta oferta;

    public InteressadosPK getItemPedidoPK() {
        return itemPedidoPK;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setItemPedidoPK(InteressadosPK itemPedidoPK) {
        this.itemPedidoPK = itemPedidoPK;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }



}
