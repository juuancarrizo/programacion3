package clases;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enfermedad
 *
 */
@Entity
@SequenceGenerator(name="enfermedad_seq", sequenceName="enfermedad_seq",initialValue=0, allocationSize=1)
public class Enfermedad implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="enfermedad_seq")
	private long idEnfermedad;
	private String nombreEnfermedad;
	private static final long serialVersionUID = 1L;

	public Enfermedad() {
		super();
	}   
	public long getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(long idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}   
	public String getNombreEnfermedad() {
		return this.nombreEnfermedad;
	}

	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}
   
}
