/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Diego
 */

@Entity
@Table(name="ofertas")
public class Oferta implements Serializable{
 @Id
 @GeneratedValue
 @Column(name="id_ofertas")
 private Integer id;

 @Column(name="data")
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date data;

 @Column(name="hora_inicio")
 @Temporal(javax.persistence.TemporalType.TIME)
 private Date hora_inicio;

 @ManyToOne
 @JoinColumn(name="parceiro",nullable=false)
 private PessoaJuridica parceiro;

 @Column(name="percentual")
 private Float percentual;
 
 @Column(name="minimo_pessoas")
 private Integer minimo_pessoas;

 @Column(name="pessoas_efetuaram")
 private Integer pessoas_efetuaram;

 @ManyToOne
 @JoinColumn(name="produto",nullable=false)
 private Produto produto;

 @Column(name="status")
 private Boolean status;

 @OneToMany(mappedBy="oferta",cascade=CascadeType.ALL)
 private List<Compra> compras;

    public Date getData() {
        return data;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMinimo_pessoas() {
        return minimo_pessoas;
    }

 

    public Float getPercentual() {
        return percentual;
    }

    public Integer getPessoas_efetuaram() {
        return pessoas_efetuaram;
    }

    public Produto getProduto() {
        return produto;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMinimo_pessoas(Integer minimo_pessoas) {
        this.minimo_pessoas = minimo_pessoas;
    }



    public void setPercentual(Float percentual) {
        this.percentual = percentual;
    }

    public void setPessoas_efetuaram(Integer pessoas_efetuaram) {
        this.pessoas_efetuaram = pessoas_efetuaram;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

 


}
