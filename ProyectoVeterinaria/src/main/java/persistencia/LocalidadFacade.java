package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class LocalidadFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirLocalidad(Localidad laLocalidad){
		
		try {
			em.getTransaction().begin();
			em.persist(laLocalidad);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}	
		}
public void editarLocalidad(Localidad laLocalidad){
		
		try {
			em.getTransaction().begin();
			em.merge(laLocalidad);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarLocalidad (Localidad laLocalidad){
	em.getTransaction().begin();
	em.remove(laLocalidad);
	em.getTransaction().commit();
}

}
