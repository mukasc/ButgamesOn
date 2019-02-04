/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Diego
 */
@Entity
@Table(name="pessoas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_pessoa", discriminatorType= DiscriminatorType.INTEGER)
@DiscriminatorValue("0")

public class Pessoa implements Serializable{

    @Id
    @GeneratedValue
    @Column(name="id_pessoas")
    private Integer id;

    @Column(name ="nome")
    private String nome;

    @Column(name ="email")
    private String email;

    @Column(name ="telefone")
    private String telefone;

    @Column(name ="senha")
    private String senha;

    @Column(name ="CEP")
    private String cep;

    @Column(name ="UF")
    private String uf;

    @Column(name ="numero")
    private Integer numero;

    @Column(name ="complemento")
    private String complemento;

    @Column(name ="bairro")
    private String bairro;

    @Column(name ="cidade")
    private String cidade;

   

    public String getBairro() {
        return bairro;
    }



    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getSenha() {
        return senha;
    }

  

    public String getUf() {
        return uf;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

  

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    

}
