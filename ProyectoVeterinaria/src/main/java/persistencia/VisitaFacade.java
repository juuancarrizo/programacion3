package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class VisitaFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirVisita(Visita laVisita){
		
		try {
			em.getTransaction().begin();
			em.persist(laVisita);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}
public void editarVisita(Visita laVisita){
		
		try {
			em.getTransaction().begin();
			em.merge(laVisita);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarVisita (Visita laVisita){
	em.getTransaction().begin();
	em.remove(laVisita);
	em.getTransaction().commit();
}

}
