
package facades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import modelo.PessoaJuridica;


@Stateless
public class PessoaJuridicaFacade {

    @PersistenceUnit(name="ButgamesOnPU")
    private EntityManagerFactory emf;


    public void inserir(PessoaJuridica pessoa) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }

       public void remover(PessoaJuridica pessoa) {
    
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            PessoaJuridica atual = em.merge(pessoa);
            em.remove(atual);
            em.getTransaction().commit();
        } finally {
            em.close();
         
        }

    }
     public void alterar(PessoaJuridica pessoa) {

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(pessoa);
            em.getTransaction().commit();
        } finally {
            em.close();
        
        }
    }

     public void atualizar(PessoaJuridica pessoa) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.refresh(pessoa);
        } finally {
            em.close();
            
        }
    }

     public PessoaJuridica buscarPorChave(int idPessoa) {
       
        EntityManager em = emf.createEntityManager();
        PessoaJuridica pessoa;
        try {
            pessoa = em.find(PessoaJuridica.class, idPessoa);
        } finally {
            em.close();
            
        }
        return pessoa;
    }

     public List<PessoaJuridica> buscarTodos() {
      
        EntityManager em = emf.createEntityManager();
        List<PessoaJuridica> pessoas;
        try {
            Query q = em.createQuery("select pj from PessoaJuridica pj");
            pessoas = q.getResultList();
        } finally {
            em.close();
            
        }
        return pessoas;
    }



}
