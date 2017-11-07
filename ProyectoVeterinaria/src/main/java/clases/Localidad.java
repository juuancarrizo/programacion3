package clases;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Localidad
 *
 */
@Entity
@SequenceGenerator(name="localidad_seq", sequenceName="localidad_seq",initialValue=0, allocationSize=1)
public class Localidad implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="localidad_seq")
	private long idLocalidad;
	private String codigoPostal;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Localidad() {
		super();
	}   
	public long getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}   
	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
