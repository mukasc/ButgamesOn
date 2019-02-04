/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Entity
@Table(name="imagens")
public class Imagem implements Serializable{
@Id
@GeneratedValue
@Column(name="id_produto")
private Integer id;

@Column(name="caminho")
private String caminho;

@OneToOne
@JoinColumn(name="produto")
private Produto produto;

@Column
private byte[] arquivo;

    public byte[] getArquivo() {
        return arquivo;
    }

    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }

    

    public String getCaminho() {
        return caminho;
    }

    public Integer getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }




}
