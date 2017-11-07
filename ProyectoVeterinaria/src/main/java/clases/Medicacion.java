package clases;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicacion
 *
 */
@Entity
@SequenceGenerator(name="medicacion_seq", sequenceName="medicacion_seq",initialValue=0, allocationSize=1)
public class Medicacion implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medicacion_seq")
	private long idMedicacion;
	private String dosis;
	@ManyToOne
	private Medicamento medicamento;
	private Integer intervalo;
	private String periodo;
	private static final long serialVersionUID = 1L;

	public Medicacion() {
		super();
	}   
	public long getIdMedicacion() {
		return this.idMedicacion;
	}

	public void setIdMedicacion(long idMedicacion) {
		this.idMedicacion = idMedicacion;
	}   
	public String getDosis() {
		return this.dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}   
	public Medicamento getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}   
	public Integer getIntervalo() {
		return this.intervalo;
	}

	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}   
	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
   
}
