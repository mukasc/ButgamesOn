
package facades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import modelo.Categoria;
import modelo.Produto;

@Stateless
public class CategoriaFacade {

    @PersistenceUnit(name="ButgamesOnPU")
    private EntityManagerFactory emf;


    public void inserir(Categoria categoria) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }

       public void remover(Categoria categoria) {
    
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Categoria atual = em.merge(categoria);
            em.remove(atual);
            em.getTransaction().commit();
        } finally {
            em.close();
         
        }

    }
     public void alterar(Categoria categoria) {

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();
        } finally {
            em.close();
        
        }
    }

     public void atualizar(Categoria categoria) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.refresh(categoria);
        } finally {
            em.close();
            
        }
    }

     public Categoria buscarPorChave(int idCategoria) {
       
        EntityManager em = emf.createEntityManager();
        Categoria categoria;
        try {
            categoria = em.find(Categoria.class, idCategoria);
        } finally {
            em.close();
            
        }
        return categoria;
    }

     public List<Categoria> buscarTodos() {
      
        EntityManager em = emf.createEntityManager();
        List<Categoria> categorias;
        try {
            Query q = em.createQuery("select c from Categoria c");
            categorias = q.getResultList();
        } finally {
            em.close();
            
        }
        return categorias;
    }



}
