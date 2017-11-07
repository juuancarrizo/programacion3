package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class VacunaColocadaFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirVacunaColocada(VacunaColocada laVacunaColocada){
		
		try {
			em.getTransaction().begin();
			em.persist(laVacunaColocada);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}	
		}
public void editarVacunaColocada(VacunaColocada laVacunaColocada){
		
		try {
			em.getTransaction().begin();
			em.merge(laVacunaColocada);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarVacunaColocada (VacunaColocada laVacunaColocada){
	em.getTransaction().begin();
	em.remove(laVacunaColocada);
	em.getTransaction().commit();
}

}
