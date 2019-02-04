/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



/**
 *
 * @author Diego
 */
@Entity
@DiscriminatorValue("1")
public class PessoaFisica extends Pessoa{
    @Column(name="cpf")
    private String cpf;

    @Column(name="numero_cartao")
    private String cartao;

    @Column(name="nome_cartao")
    private String nome_cartao;

    @Column(name="data_vencimento_cartao")
    private String data_vencimento_cartao;

    @Column(name="codigo_seguranca_cartao")
    private String codigo_seguranca_cartao;

    @OneToMany(mappedBy="comprador",cascade=CascadeType.ALL)
    private List<Compra> compras;

  

    public String getCodigo_seguranca_cartao() {
        return codigo_seguranca_cartao;
    }

   
    public String getData_vencimento_cartao() {
        return data_vencimento_cartao;
    }

    public String getNome_cartao() {
        return nome_cartao;
    }

   

    public void setCodigo_seguranca_cartao(String codigo_seguranca_cartao) {
        this.codigo_seguranca_cartao = codigo_seguranca_cartao;
    }

  

    public void setData_vencimento_cartao(String data_vencimento_cartao) {
        this.data_vencimento_cartao = data_vencimento_cartao;
    }

    public void setNome_cartao(String nome_cartao) {
        this.nome_cartao = nome_cartao;
    }

    public String getCartao() {
        return cartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
  
}
