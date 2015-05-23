package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Marca entity. @author MyEclipse Persistence Tools
 */

public class Marca implements java.io.Serializable {

	// Fields

	private Integer idMarca;
	private String descripcion;
	private Set modelos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Marca() {
	}

	/** minimal constructor */
	public Marca(Integer idMarca, String descripcion) {
		this.idMarca = idMarca;
		this.descripcion = descripcion;
	}

	/** full constructor */
	public Marca(Integer idMarca, String descripcion, Set modelos) {
		this.idMarca = idMarca;
		this.descripcion = descripcion;
		this.modelos = modelos;
	}

	// Property accessors

	public Integer getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getModelos() {
		return this.modelos;
	}

	public void setModelos(Set modelos) {
		this.modelos = modelos;
	}

}