package pojo;

import java.io.Serializable;
import java.util.Objects;

public class Asiento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6034836009531020782L;
	/**
	 * 
	 */

	private int id;
	private int fila;
	private int numero;
	private boolean disponible = true;
	private Sala sala = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(disponible, fila, id, numero, sala);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return disponible == other.disponible && fila == other.fila && id == other.id && numero == other.numero
				&& Objects.equals(sala, other.sala);
	}
	@Override
	public String toString() {
		return "Asiento [id=" + id + ", fila=" + fila + ", numero=" + numero + ", disponible=" + disponible + ", sala="
				+ sala + "]";
	}
	
	public Asiento(int id, int fila, int numero, boolean disponible, Sala sala) {
		super();
		this.id = id;
		this.fila = fila;
		this.numero = numero;
		this.disponible = disponible;
		this.sala = sala;
	}

	
}
