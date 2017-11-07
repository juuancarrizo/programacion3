package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class clienteFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirCliente(Cliente elCliente){
		
		try {
			em.getTransaction().begin();
			em.persist(elCliente);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}

public void editarCliente(Cliente elCliente){
		
		try {
			em.getTransaction().begin();
			em.merge(elCliente);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}	
		}
public void eliminarCliente (Cliente elCliente){
	em.getTransaction().begin();
	em.remove(elCliente);
	em.getTransaction().commit();
}

}
