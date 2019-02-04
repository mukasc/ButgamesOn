
package facades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import modelo.PessoaFisica;


@Stateless
public class PessoaFisicaFacade {

    @PersistenceUnit(name="ButgamesOnPU")
    private EntityManagerFactory emf;


    public void inserir(PessoaFisica pessoa) {
       

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(pessoa);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }

       public void remover(PessoaFisica pessoa) {
    
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            PessoaFisica atual = em.merge(pessoa);
            em.remove(atual);
            em.getTransaction().commit();
        } finally {
            em.close();
         
        }

    }
     public void alterar(PessoaFisica pessoa) {

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(pessoa);
            em.getTransaction().commit();
        } finally {
            em.close();
        
        }
    }

     public void atualizar(PessoaFisica pessoa) {
      
        EntityManager em = emf.createEntityManager();
        try {
            em.refresh(pessoa);
        } finally {
            em.close();
            
        }
    }

     public PessoaFisica buscarPorChave(int idPessoa) {
       
        EntityManager em = emf.createEntityManager();
        PessoaFisica pessoa;
        try {
            pessoa = em.find(PessoaFisica.class, idPessoa);
        } finally {
            em.close();
            
        }
        return pessoa;
    }

     public List<PessoaFisica> buscarTodos() {
      
        EntityManager em = emf.createEntityManager();
        List<PessoaFisica> pessoas;
        try {
            Query q = em.createQuery("select pf from PessoaFisica pf");
            pessoas = q.getResultList();
        } finally {
            em.close();
            
        }
        return pessoas;
    }



}
