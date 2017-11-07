package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class MedicacionFacade {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirMedicacion(Medicacion laMedicacion){
	
	try {
		em.getTransaction().begin();
		em.persist(laMedicacion);
		em.getTransaction().commit();
	}
	finally {
	em.close();
	}

	
	}
	public void editarMedicacion(Medicacion laMedicacion){
		
		try {
			em.getTransaction().begin();
			em.merge(laMedicacion);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
	public void eliminarMedicacion (Medicacion laMedicacion){
	em.getTransaction().begin();
	em.remove(laMedicacion);
	em.getTransaction().commit();
}

}