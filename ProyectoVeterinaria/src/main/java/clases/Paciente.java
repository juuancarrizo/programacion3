package clases;

import java.io.Serializable;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity
@SequenceGenerator(name="paciente_seq", sequenceName="paciente_seq",initialValue=0, allocationSize=1)
public class Paciente implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="paciente_seq")
	private long idPaciente;
	private String alias;
	@ManyToOne
	private Raza raza;
	private String colorPelo;
	private LocalDate fechaNacimiento;
	@ManyToOne
	private Cliente duenio;
	private float pesoActual;
	@OneToMany
	private List<Visita> visitas;
	@OneToMany
	private List<VacunaColocada> vacunas;
	@OneToMany
	private List<EnfermedadPaciente> enfermedades;
	private static final long serialVersionUID = 1L;

	public Paciente() {
		super();
	}   
	public long getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}   
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}   
	public Raza getRaza() {
		return this.raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}   
	public String getColorPelo() {
		return this.colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}   
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}   
	public Cliente getDuenio() {
		return this.duenio;
	}

	public void setDue�o(Cliente duenio) {
		this.duenio = duenio;
	}   
	public float getPesoActual() {
		return this.pesoActual;
	}

	public void setPesoActual(float pesoActual) {
		this.pesoActual = pesoActual;
	}   
	public List<Visita> getVisitas() {
		return this.visitas;
	}

	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}   
	public List<VacunaColocada> getVacunas() {
		return this.vacunas;
	}

	public void setVacunas(List<VacunaColocada> vacunas) {
		this.vacunas = vacunas;
	}   
	public List<EnfermedadPaciente> getEnfermedades() {
		return this.enfermedades;
	}

	public void setEnfermedades(List<EnfermedadPaciente> enfermedades) {
		this.enfermedades = enfermedades;
	}
   
}
