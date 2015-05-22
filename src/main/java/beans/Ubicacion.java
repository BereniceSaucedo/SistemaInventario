package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Ubicacion entity. @author MyEclipse Persistence Tools
 */

public class Ubicacion implements java.io.Serializable {

	// Fields

	private Integer idUbicacion;
	private String descripcion;
	private Set equiposes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ubicacion() {
	}

	/** minimal constructor */
	public Ubicacion(Integer idUbicacion, String descripcion) {
		this.idUbicacion = idUbicacion;
		this.descripcion = descripcion;
	}

	/** full constructor */
	public Ubicacion(Integer idUbicacion, String descripcion, Set equiposes) {
		this.idUbicacion = idUbicacion;
		this.descripcion = descripcion;
		this.equiposes = equiposes;
	}

	// Property accessors

	public Integer getIdUbicacion() {
		return this.idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
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