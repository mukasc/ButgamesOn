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
@DiscriminatorValue("2")
public class PessoaJuridica extends Pessoa {
     @Column(name="razao_social")
     private String razao_social;

     @Column(name="fax")
     private String fax;

     @Column(name="cnpj")
     private String cnpj;

     @Column(name="ie")
     private String ie;

     @Column(name="banco")
     private String banco;

     @Column(name="numero_conta")
     private String numero_conta;

     @Column(name="agencia")
     private String agencia;

     @Column(name="numero_variacao")
     private Integer numero_variacao;

    @OneToMany(mappedBy="parceiro",cascade=CascadeType.ALL)
    private List<Oferta> Ofertas;

   

    public String getBanco() {
        return banco;
    }

    public List<Oferta> getOfertas() {
        return Ofertas;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getFax() {
        return fax;
    }

    public String getIe() {
        return ie;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setOfertas(List<Oferta> Ofertas) {
        this.Ofertas = Ofertas;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

 

   

    public Integer getNumero_variacao() {
        return numero_variacao;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

  

   

    public void setNumero_variacao(Integer numero_variacao) {
        this.numero_variacao = numero_variacao;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    

}
