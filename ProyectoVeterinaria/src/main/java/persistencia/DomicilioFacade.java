package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class DomicilioFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirDomicilio(Domicilio elDomicilio){
		
		try {
			em.getTransaction().begin();
			em.persist(elDomicilio);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}

public void editarDomicilio(Domicilio elDomicilio){
		
		try {
			em.getTransaction().begin();
			em.merge(elDomicilio);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}	
		}
public void eliminarDomicilio (Domicilio elDomicilio){
	em.getTransaction().begin();
	em.remove(elDomicilio);
	em.getTransaction().commit();
}

}
