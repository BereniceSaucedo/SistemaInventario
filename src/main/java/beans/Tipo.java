package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Tipo entity. @author MyEclipse Persistence Tools
 */

public class Tipo implements java.io.Serializable {

	// Fields

	private Integer idTipo;
	private String tipoEquipo;
	private String descripcion;
	private Set equiposes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tipo() {
	}

	/** minimal constructor */
	public Tipo(Integer idTipo, String tipoEquipo, String descripcion) {
		this.idTipo = idTipo;
		this.tipoEquipo = tipoEquipo;
		this.descripcion = descripcion;
	}

	/** full constructor */
	public Tipo(Integer idTipo, String tipoEquipo, String descripcion,
			Set equiposes) {
		this.idTipo = idTipo;
		this.tipoEquipo = tipoEquipo;
		this.descripcion = descripcion;
		this.equiposes = equiposes;
	}

	// Property accessors

	public Integer getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipoEquipo() {
		return this.tipoEquipo;
	}

	public void setTipoEquipo(String tipoEquipo) {
		this.tipoEquipo = tipoEquipo;
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