package pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2125851948391893223L;
	/**
	 * 
	 */

	private int id;
	private String nombre = null;
	private boolean disponible = true;

	public Sala(int id, String nombre, boolean disponible, Cine cine, List<Asiento> asientos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.disponible = disponible;
		this.cine = cine;
		this.asientos = asientos;
	}

	private Cine cine = null;
	private List<Asiento> asientos = new ArrayList<Asiento>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

	public List<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<Asiento> asientos) {
		this.asientos = asientos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asientos, cine, disponible, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return Objects.equals(asientos, other.asientos) && Objects.equals(cine, other.cine)
				&& disponible == other.disponible && id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", nombre=" + nombre + ", disponible=" + disponible + ", cine=" + cine + ", asientos="
				+ asientos + "]";
	}

}
