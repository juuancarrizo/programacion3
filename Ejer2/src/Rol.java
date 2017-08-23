import java.util.List;

public class Rol {
	private int idRol;
	private String nombre;
	private List<Usuario> usuarios;
	private List<Permiso> permisos;
	public Rol() {
		super();
	}
	public Rol(int idRol, String nombre, List<Usuario> usuarios, List<Permiso> permisos) {
		super();
		this.idRol = idRol;
		this.nombre = nombre;
		this.usuarios = usuarios;
		this.permisos = permisos;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Permiso> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}
	
	
}
