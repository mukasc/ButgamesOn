
package facades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import modelo.Oferta;



@Stateless
public class OfertaFacade {

    @PersistenceUnit(name="ButgamesOnPU")
    private EntityManagerFactory emf;


    public void inserir(Oferta oferta) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(oferta);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }

       public void remover(Oferta oferta) {
    
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Oferta atual = em.merge(oferta);
            em.remove(atual);
            em.getTransaction().commit();
        } finally {
            em.close();
         
        }

    }
     public void alterar(Oferta oferta) {

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(oferta);
            em.getTransaction().commit();
        } finally {
            em.close();
        
        }
    }

     public void atualizar(Oferta oferta) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.refresh(oferta);
        } finally {
            em.close();
            
        }
    }

     public Oferta buscarPorChave(int idOferta) {
       
        EntityManager em = emf.createEntityManager();
        Oferta oferta;
        try {
            oferta = em.find(Oferta.class, idOferta);
        } finally {
            em.close();
            
        }
        return oferta;
    }

     public List<Oferta> buscarTodos() {
      
        EntityManager em = emf.createEntityManager();
        List<Oferta> ofertas;
        try {
            Query q = em.createQuery("select o from Ofertas of");
            ofertas = q.getResultList();
        } finally {
            em.close();
            
        }
        return ofertas;
    }



}
