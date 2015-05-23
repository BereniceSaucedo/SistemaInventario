package beans;

/**
 * Reparaciones entity. @author MyEclipse Persistence Tools
 */

public class Reparaciones implements java.io.Serializable {

	// Fields

	private ReparacionesId id;
	private String fechaReparacion;
	private String horaReparacion;

	// Constructors

	/** default constructor */
	public Reparaciones() {
	}

	/** full constructor */
	public Reparaciones(ReparacionesId id, String fechaReparacion,
			String horaReparacion) {
		this.id = id;
		this.fechaReparacion = fechaReparacion;
		this.horaReparacion = horaReparacion;
	}

	// Property accessors

	public ReparacionesId getId() {
		return this.id;
	}

	public void setId(ReparacionesId id) {
		this.id = id;
	}

	public String getFechaReparacion() {
		return this.fechaReparacion;
	}

	public void setFechaReparacion(String fechaReparacion) {
		this.fechaReparacion = fechaReparacion;
	}

	public String getHoraReparacion() {
		return this.horaReparacion;
	}

	public void setHoraReparacion(String horaReparacion) {
		this.horaReparacion = horaReparacion;
	}

}