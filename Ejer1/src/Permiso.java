import java.util.List;

public class Permiso {
	private int idPermiso;
	private List<Rol> roles;
	private Accion accion;
	private Entidad entidad;
	public Permiso() {
		super();
	}
	public Permiso(int idPermiso, List<Rol> roles, Accion accion, Entidad entidad) {
		super();
		this.idPermiso = idPermiso;
		this.roles = roles;
		this.accion = accion;
		this.entidad = entidad;
	}
	public int getIdPermiso() {
		return idPermiso;
	}
	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	public Accion getAccion() {
		return accion;
	}
	public void setAccion(Accion accion) {
		this.accion = accion;
	}
	public Entidad getEntidad() {
		return entidad;
	}
	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}
	
}
