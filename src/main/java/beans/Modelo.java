package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Modelo entity. @author MyEclipse Persistence Tools
 */

public class Modelo implements java.io.Serializable {

	// Fields

	private Integer idModelo;
	private Marca marca;
	private String nombreModelo;
	private String descripción;
	private Set equiposes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Modelo() {
	}

	/** minimal constructor */
	public Modelo(Integer idModelo, Marca marca, String nombreModelo,
			String descripción) {
		this.idModelo = idModelo;
		this.marca = marca;
		this.nombreModelo = nombreModelo;
		this.descripción = descripción;
	}

	/** full constructor */
	public Modelo(Integer idModelo, Marca marca, String nombreModelo,
			String descripción, Set equiposes) {
		this.idModelo = idModelo;
		this.marca = marca;
		this.nombreModelo = nombreModelo;
		this.descripción = descripción;
		this.equiposes = equiposes;
	}

	// Property accessors

	public Integer getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getNombreModelo() {
		return this.nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public String getDescripción() {
		return this.descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Set getEquiposes() {
		return this.equiposes;
	}

	public void setEquiposes(Set equiposes) {
		this.equiposes = equiposes;
	}

}