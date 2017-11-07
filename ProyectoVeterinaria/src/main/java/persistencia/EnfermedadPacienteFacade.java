package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class EnfermedadPacienteFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirEnfermedadPaciente(EnfermedadPaciente laEnfermedadPaciente){
		
		try {
			em.getTransaction().begin();
			em.persist(laEnfermedadPaciente);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}
public void editarEnfermedadPaciente(EnfermedadPaciente laEnfermedadPaciente){
		
		try {
			em.getTransaction().begin();
			em.merge(laEnfermedadPaciente);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarEnfermedadPaciente (EnfermedadPaciente laEnfermedadPaciente){
	em.getTransaction().begin();
	em.remove(laEnfermedadPaciente);
	em.getTransaction().commit();
}

}
