/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import facades.ImagemFacade;
import facades.ProdutoFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import modelo.Imagem;
import modelo.Produto;
import org.primefaces.event.CloseEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;






/**
 *
 * @author Diego
 */

@ManagedBean(name="produtoBean")
public class ProdutoBean {
    private Produto produto;
    private List<Produto> produtos;
    private byte[] imagem;

    @EJB
    private ProdutoFacade produtoFacade;
    @EJB
    private ImagemFacade imagemFacade;

    public ProdutoBean() {
        // inicializa o livro com um novo
        produto = new Produto();
    }

    @PostConstruct
    public void inicializar(){
        produtos = produtoFacade.buscarTodos();
    }

     public void handleClose(CloseEvent event) {  
         FacesContext facesContext = FacesContext.getCurrentInstance();  
         FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,   
             event.getComponent().getId() + " Fechou", "Que tal comprar esse?");
           
         facesContext.addMessage(null, message);  
     }

    public Produto getProduto() {
        return produto;
    }

   

    public void salvarImagem(){
                     Imagem imgg = new Imagem();
                     imgg.setArquivo(imagem);
                     imgg.setCaminho("uasdhusa");
                     imagemFacade.inserir(imgg);
    
    }


    public void Imagem(FileUploadEvent event) {
                     UploadedFile file = event.getFile();
                     imagem=file.getContents();
                    
                     

               

    }

    public ProdutoFacade getProdutoFacade() {
        return produtoFacade;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setProdutoFacade(ProdutoFacade produtoFacade) {
        this.produtoFacade = produtoFacade;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

   
}
