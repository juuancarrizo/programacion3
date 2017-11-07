package clases;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MotivoVisita
 *
 */
@Entity
@SequenceGenerator(name="motivoVisita_seq", sequenceName="motivoVisita_seq",initialValue=0, allocationSize=1)
public class MotivoVisita implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="motivoVisita_seq")
	private long idMotivoVisita;
	private String descripcion;
	private static final long serialVersionUID = 1L;

	public MotivoVisita() {
		super();
	}   
	public long getIdMotivoVisita() {
		return this.idMotivoVisita;
	}

	public void setIdMotivoVisita(long idMotivoVisita) {
		this.idMotivoVisita = idMotivoVisita;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
   
}
