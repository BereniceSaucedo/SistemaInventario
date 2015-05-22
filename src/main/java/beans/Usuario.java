package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Usuario entity. @author MyEclipse Persistence Tools
 */

public class Usuario implements java.io.Serializable {

	// Fields

	private Integer idUsuario;
	private Rol rol;
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private Set equiposes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usuario() {
	}

	/** minimal constructor */
	public Usuario(Integer idUsuario, Rol rol, String nombre, String apellido,
			String telefono, String email) {
		this.idUsuario = idUsuario;
		this.rol = rol;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
	}

	/** full constructor */
	public Usuario(Integer idUsuario, Rol rol, String nombre, String apellido,
			String telefono, String email, Set equiposes) {
		this.idUsuario = idUsuario;
		this.rol = rol;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.equiposes = equiposes;
	}

	// Property accessors

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getEquiposes() {
		return this.equiposes;
	}

	public void setEquiposes(Set equiposes) {
		this.equiposes = equiposes;
	}

}