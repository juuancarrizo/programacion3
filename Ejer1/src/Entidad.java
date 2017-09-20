
public class Entidad {
	private int idEntidad;
	private String nombre;
	public Entidad() {
		super();
	}
	public Entidad(int idEntidad, String nombre) {
		super();
		this.idEntidad = idEntidad;
		this.nombre = nombre;
	}
	public int getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
