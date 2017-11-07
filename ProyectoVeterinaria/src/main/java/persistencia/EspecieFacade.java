package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class EspecieFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirEspecie(Especie laEspecie){
		
		try {
			em.getTransaction().begin();
			em.persist(laEspecie);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}
public void editarEspecie(Especie laEspecie){
		
		try {
			em.getTransaction().begin();
			em.merge(laEspecie);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarEspecie (Especie laEspecie){
	em.getTransaction().begin();
	em.remove(laEspecie);
	em.getTransaction().commit();
}

}
