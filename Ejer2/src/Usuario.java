import java.util.List;

public class Usuario {
	private int idUsuario;
	private String login;
	private String pass;
	private String nombre;
	private List<Rol> roles;
	
	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String login, String pass, String nombre, List<Rol> roles) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.pass = pass;
		this.nombre = nombre;
		this.roles = roles;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
}
