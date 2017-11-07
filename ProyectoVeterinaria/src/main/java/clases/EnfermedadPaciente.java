package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: EnfermedadPaciente
 *
 */
@Entity
@SequenceGenerator(name="enfermedadPaciente_seq", sequenceName="enfermedadPaciente_seq",initialValue=0, allocationSize=1)
public class EnfermedadPaciente implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="enfermedadPaciente_seq")
	private long idEnfermedadPaciente;
	@ManyToOne
	private Enfermedad enfermedad;
	private LocalDate fechaEnfermedad;
	@OneToMany
	private List<Medicacion> medicacion;
	private static final long serialVersionUID = 1L;

	public EnfermedadPaciente() {
		super();
	}   
	public long getIdEnfermedadPaciente() {
		return this.idEnfermedadPaciente;
	}

	public void setIdEnfermedadPaciente(long idEnfermedadPaciente) {
		this.idEnfermedadPaciente = idEnfermedadPaciente;
	}   
	public Enfermedad getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}   
	public LocalDate getFechaEnfermedad() {
		return this.fechaEnfermedad;
	}

	public void setFechaEnfermedad(LocalDate fechaEnfermedad) {
		this.fechaEnfermedad = fechaEnfermedad;
	}   
	public List<Medicacion> getMedicacion() {
		return this.medicacion;
	}

	public void setMedicacion(List<Medicacion> medicacion) {
		this.medicacion = medicacion;
	}
   
}
