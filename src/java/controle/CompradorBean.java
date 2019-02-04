/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import facades.ImagemFacade;
import facades.PessoaFisicaFacade;
import facades.ProdutoFacade;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import modelo.Imagem;
import modelo.PessoaFisica;
import modelo.Produto;
import org.primefaces.event.CloseEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.FlowEvent;
import org.primefaces.model.UploadedFile;






/**
 *
 * @author Diego
 */

@ManagedBean(name="compradorBean")
@SessionScoped
public class CompradorBean {
    private PessoaFisica comprador = new PessoaFisica();
    private List<PessoaFisica> compradores;
    private ArrayList estados;
    private Long cep;

    @EJB
    private PessoaFisicaFacade compradorFacade;
    private boolean skip;
    private static Logger logger = Logger.getLogger(CompradorBean.class.getName());
   
        


     public boolean isSkip() {
         return skip;
     }

     public void setSkip(boolean skip) {
         this.skip = skip;
     }

     public String onFlowProcess(FlowEvent event) {
         logger.info("Current wizard step:" + event.getOldStep());
         logger.info("Next step:" + event.getNewStep());

         if(skip) {
             skip = false;   //reset in case user goes back
             return "confirm";
         }
         else {
            return event.getNewStep();
         }
     }




    public CompradorBean() {
        // inicializa o livro com um novo
        comprador = new PessoaFisica();
        estados = new ArrayList();
        estados.add("SC");
        estados.add("PR");
        estados.add("RS");

    }

    @PostConstruct
    public void inicializar(){
        
        compradores = compradorFacade.buscarTodos();
    }

    public ArrayList getEstados() {
        return estados;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

  

  

    
    

    public void setEstados(ArrayList estados) {
        this.estados = estados;
    }


   

    

    public void Salvar(){
     //   PessoaFisica compradorAtual= new PessoaFisica();
       // compradorAtual=getComprador();
        compradorFacade.inserir(comprador);

        //return "/produto/listarAccordionPanel";
    }

    public PessoaFisica getComprador() {
        return comprador;
    }

    public PessoaFisicaFacade getCompradorFacade() {
        return compradorFacade;
    }

    public List<PessoaFisica> getCompradores() {
        return compradores;
    }

    public void setComprador(PessoaFisica comprador) {
        this.comprador = comprador;
    }

    public void setCompradorFacade(PessoaFisicaFacade compradorFacade) {
        this.compradorFacade = compradorFacade;
    }

    public void setCompradores(List<PessoaFisica> compradores) {
        this.compradores = compradores;
    }

     public void validarNumero(FacesContext context,UIComponent componente,Object valor) throws ValidatorException{

         try{Integer numero = (Integer)valor;}catch(Exception e){
                  throw new ValidatorException(
                    new FacesMessage("Campo com valor inválido."));
        }




        //if (numero.intValue() < 0 || numero.intValue() > 10000000){
         //   throw new ValidatorException(
         //           new FacesMessage("Campo com valor inválido."));
       // }

    }
       

     public void converterAnoCartao() {



    }

   


   
}
