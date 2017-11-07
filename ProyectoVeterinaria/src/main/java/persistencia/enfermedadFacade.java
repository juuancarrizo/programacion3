package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class enfermedadFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirEnfermedad(Enfermedad laEnfermedad){
		
		try {
			em.getTransaction().begin();
			em.persist(laEnfermedad);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}

public void editarEnfermedad(Enfermedad laEnfermedad){
		
		try {
			em.getTransaction().begin();
			em.merge(laEnfermedad);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarEnfermedad (Enfermedad laEnfermedad){
	em.getTransaction().begin();
	em.remove(laEnfermedad);
	em.getTransaction().commit();
}

}
