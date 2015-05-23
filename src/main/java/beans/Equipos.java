package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Equipos entity. @author MyEclipse Persistence Tools
 */

public class Equipos implements java.io.Serializable {

	// Fields

	private Integer idEquipos;
	private Ubicacion ubicacion;
	private Estado estado;
	private Usuario usuario;
	private Tipo tipo;
	private Modelo modelo;
	private String numSerie;
	private Set reparacioneses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Equipos() {
	}

	/** minimal constructor */
	public Equipos(Integer idEquipos, Ubicacion ubicacion, Estado estado,
			Usuario usuario, Tipo tipo, Modelo modelo, String numSerie) {
		this.idEquipos = idEquipos;
		this.ubicacion = ubicacion;
		this.estado = estado;
		this.usuario = usuario;
		this.tipo = tipo;
		this.modelo = modelo;
		this.numSerie = numSerie;
	}

	/** full constructor */
	public Equipos(Integer idEquipos, Ubicacion ubicacion, Estado estado,
			Usuario usuario, Tipo tipo, Modelo modelo, String numSerie,
			Set reparacioneses) {
		this.idEquipos = idEquipos;
		this.ubicacion = ubicacion;
		this.estado = estado;
		this.usuario = usuario;
		this.tipo = tipo;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.reparacioneses = reparacioneses;
	}

	// Property accessors

	public Integer getIdEquipos() {
		return this.idEquipos;
	}

	public void setIdEquipos(Integer idEquipos) {
		this.idEquipos = idEquipos;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getNumSerie() {
		return this.numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public Set getReparacioneses() {
		return this.reparacioneses;
	}

	public void setReparacioneses(Set reparacioneses) {
		this.reparacioneses = reparacioneses;
	}

}