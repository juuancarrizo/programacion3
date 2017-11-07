package clases;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Especie
 *
 */
@Entity
@SequenceGenerator(name="especie_seq", sequenceName="especie_seq",initialValue=0, allocationSize=1)
public class Especie implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="especie_seq")
	private long idEspecie;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Especie() {
		super();
	}   
	public long getIdEspecie() {
		return this.idEspecie;
	}

	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
