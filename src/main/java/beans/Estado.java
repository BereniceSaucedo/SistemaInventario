package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Estado entity. @author MyEclipse Persistence Tools
 */

public class Estado implements java.io.Serializable {

	// Fields

	private Integer idEstado;
	private String nombreEquipo;
	private String descripcion;
	private Set equiposes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Estado() {
	}

	/** minimal constructor */
	public Estado(Integer idEstado, String nombreEquipo, String descripcion) {
		this.idEstado = idEstado;
		this.nombreEquipo = nombreEquipo;
		this.descripcion = descripcion;
	}

	/** full constructor */
	public Estado(Integer idEstado, String nombreEquipo, String descripcion,
			Set equiposes) {
		this.idEstado = idEstado;
		this.nombreEquipo = nombreEquipo;
		this.descripcion = descripcion;
		this.equiposes = equiposes;
	}

	// Property accessors

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombreEquipo() {
		return this.nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getEquiposes() {
		return this.equiposes;
	}

	public void setEquiposes(Set equiposes) {
		this.equiposes = equiposes;
	}

}