package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class MotivoVisitaFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirMotivoVisita(MotivoVisita elMotivo){
	
		try {
			em.getTransaction().begin();
			em.persist(elMotivo);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}
public void editarMotivoVisita(MotivoVisita elMotivo){
		
		try {
			em.getTransaction().begin();
			em.merge(elMotivo);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarMotivoVisita (MotivoVisita elMotivo){
	em.getTransaction().begin();
	em.remove(elMotivo);
	em.getTransaction().commit();
}


}
