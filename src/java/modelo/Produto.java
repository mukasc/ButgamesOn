/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import modelo.Categoria;
/**
 *
 * @author Diego
 */
@Entity
@Table(name="produtos")
public class Produto implements Serializable{
 @Id
 @GeneratedValue
 @Column(name="id_produto")
 private Integer id;

 @Column(name="nome")
 private String nome;

 @Column(name="imagem")
 private String imagem;

 @Column(name="preco")
 private Double preco;

 @Column(name="quantidade")
 private Integer quantidade;

 @Column(name="descricao")
 private String descricao;

 @Column(name="parceiro")
 private Integer parceiro;

 @OneToMany(mappedBy="produto",cascade=CascadeType.ALL)
 private List<Oferta> Ofertas;

@OneToMany(mappedBy="produto", cascade=CascadeType.ALL)
private List<Imagem> imagens;


@ManyToOne
@JoinColumn(name="categoria", nullable=false)
private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
  

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    public Integer getParceiro() {
        return parceiro;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setParceiro(Integer parceiro) {
        this.parceiro = parceiro;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }




 
}
