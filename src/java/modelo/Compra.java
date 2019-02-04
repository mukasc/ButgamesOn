/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Diego
 */
@Entity
@Table(name="compras")
public class Compra implements Serializable{
 @Id
 @GeneratedValue
 @Column(name="id_compras")
 private Integer id;

 @Column(name="data")
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date data;

 @ManyToOne
 @JoinColumn(name="pessoa",nullable=false)
 private PessoaFisica comprador;

 @Column(name="total")
 private Float total;

 @ManyToOne
 @JoinColumn(name="oferta",nullable=false)
 private Oferta oferta;

 @Column(name="tipo_oferta")
 private Integer tipo_oferta;

    public PessoaFisica getComprador() {
        return comprador;
    }

    public void setComprador(PessoaFisica comprador) {
        this.comprador = comprador;
    }




    public Date getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public Integer getTipo_oferta() {
        return tipo_oferta;
    }

    public Float getTotal() {
        return total;
    }

 

    public void setData(Date data) {
        this.data = data;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public void setTipo_oferta(Integer tipo_oferta) {
        this.tipo_oferta = tipo_oferta;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

 


}
