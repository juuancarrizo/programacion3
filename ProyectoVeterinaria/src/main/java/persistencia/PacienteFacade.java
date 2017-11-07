package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class PacienteFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirPaciente(Paciente elPaciente){
		
		try {
			em.getTransaction().begin();
			em.persist(elPaciente);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}
		}
public void editarPaciente(Paciente elPaciente){
		
		try {
			em.getTransaction().begin();
			em.merge(elPaciente);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}		
		}
public void eliminarPaciente (Paciente elPaciente){
	em.getTransaction().begin();
	em.remove(elPaciente);
	em.getTransaction().commit();
}

}
