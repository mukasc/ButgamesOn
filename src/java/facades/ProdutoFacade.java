
package facades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import modelo.Produto;

@Stateless
public class ProdutoFacade {

    @PersistenceUnit(name="ButgamesOnPU")
    private EntityManagerFactory emf;


    public void inserir(Produto produto) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }

       public void remover(Produto produto) {
    
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Produto atual = em.merge(produto);
            em.remove(atual);
            em.getTransaction().commit();
        } finally {
            em.close();
         
        }

    }
     public void alterar(Produto produto) {

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
        } finally {
            em.close();
        
        }
    }

     public void atualizar(Produto produto) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.refresh(produto);
        } finally {
            em.close();
            
        }
    }

     public Produto buscarPorChave(int idProduto) {
       
        EntityManager em = emf.createEntityManager();
        Produto produto;
        try {
            produto = em.find(Produto.class, idProduto);
        } finally {
            em.close();
            
        }
        return produto;
    }

     public List<Produto> buscarTodos() {
      
        EntityManager em = emf.createEntityManager();
        List<Produto> produtos;
        try {
            Query q = em.createQuery("select l from Produto l");
            produtos = q.getResultList();
        } finally {
            em.close();
            
        }
        return produtos;
    }

     public List<Produto> buscarTodos(int cat) {

        EntityManager em = emf.createEntityManager();
        List<Produto> produtos;
        try {
            Query q = em.createQuery("select l from Produto l where l.categoria = "+cat);
            produtos = q.getResultList();
        } finally {
            em.close();

        }
        return produtos;
    }


}
