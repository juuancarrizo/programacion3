package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class RazaFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirRaza(Raza laRaza){
		
		try {
			em.getTransaction().begin();
			em.persist(laRaza);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}
public void editarRaza(Raza laRaza){
		
		try {
			em.getTransaction().begin();
			em.merge(laRaza);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}	
		}
public void eliminarRaza (Raza laRaza){
	em.getTransaction().begin();
	em.remove(laRaza);
	em.getTransaction().commit();
}

}
