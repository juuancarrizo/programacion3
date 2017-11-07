package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class MedicamentoFacade {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	public void persistirMedicamento(Medicamento elmedicamento){
		
		try {
			em.getTransaction().begin();
			em.persist(elmedicamento);
			em.getTransaction().commit();
		}
		finally {
		em.close();
		}	
		}
public void editarMedicamento(Medicamento elMedicamento){
		
		try {
			em.getTransaction().begin();
			em.merge(elMedicamento);
			em.getTransaction().commit();
		}
		catch(Exception error) {
			System.out.println(error.getStackTrace());
		}
		finally {
		em.close();
		}
		}
public void eliminarMedicamento (Medicamento elMedicamento){
	em.getTransaction().begin();
	em.remove(elMedicamento);
	em.getTransaction().commit();
}

}
