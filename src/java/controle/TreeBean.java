package controle;

import org.primefaces.model.TreeNode;
import org.primefaces.model.DefaultTreeNode;
import facades.ProdutoFacade;
import facades.CategoriaFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import modelo.Categoria;

import modelo.Produto;
@ManagedBean(name="treeBean")
public class TreeBean {

	private TreeNode root;
        private List<Categoria> categorias;
        private List<Produto> produtos;
        private Categoria categoria;

        @EJB
        private CategoriaFacade categoriaFacade = null;

        @EJB
        private ProdutoFacade produtoFacade = null;

        public TreeBean() {
            categoria = new Categoria();
            
            //root = new DefaultTreeNode("root", null);
                //carregarTree();
                /*
               ProdutoFacade produtoFacade = null;
                List<Produto> produtos;
                produtos = produtoFacade.buscarTodos();*/
                     


	}
        @PostConstruct
        public void inicializar(){
                 categorias = categoriaFacade.buscarTodos();
                 produtos = produtoFacade.buscarTodos();
                 carregarTree();
        }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

        

        public void carregarTree(){
                root = new DefaultTreeNode("root", null);
               //TreeNode nodo = new DefaultTreeNode(categorias.get(0).getDescricao(), root);
               
                for(int i=0;i< categorias.size();i++){
                    
                    TreeNode cate = new DefaultTreeNode(categorias.get(i).getDescricao(), root);
                                   //    TreeNode jogos = new DefaultTreeNode(produtos.get(1).getNome(), cate);
                    for(int y=0;y<produtos.size();y++){

                        if(produtos.get(y).getCategoria().getId().equals(categorias.get(i).getId())){

                            TreeNode jogos = new DefaultTreeNode(produtos.get(y).getNome(), cate);
                            
                        }

                    }

                   

               }
    }


	public TreeNode getRoot() {
		return root;
	}
}
