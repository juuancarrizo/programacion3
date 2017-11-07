package clases;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity
@SequenceGenerator(name="cliente_seq", sequenceName="cliente_seq",initialValue=0, allocationSize=1)
public class Cliente implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	private long idCliente;
	private String apellidoFamilia;
	@ManyToOne
	private Domicilio domicilio;
	private String nroCuenta;
	private String telefono;
	@OneToMany(mappedBy = "duenio")
	private List<Paciente> listaMascotas;
	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
	}   
	public long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}   
	public String getApellidoFamilia() {
		return this.apellidoFamilia;
	}

	public void setApellidoFamilia(String apellidoFamilia) {
		this.apellidoFamilia = apellidoFamilia;
	}   
	public Domicilio getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}   
	public String getNroCuenta() {
		return this.nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}   
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}   
	public List<Paciente> getListaMascotas() {
		return this.listaMascotas;
	}

	public void setListaMascotas(List<Paciente> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}
   
}
