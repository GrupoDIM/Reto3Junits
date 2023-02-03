package pojo;

import java.io.Serializable;
import java.util.Objects;

public class Genero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8795581819198864173L;
	/**
	 * 
	 */

	private int id;
	private String genero = null;
	private Pelicula pelicula = null;

	public Genero(int id, String genero, Pelicula pelicula) {
		super();
		this.id = id;
		this.genero = genero;
		this.pelicula = pelicula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, id, pelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return Objects.equals(genero, other.genero) && id == other.id && Objects.equals(pelicula, other.pelicula);
	}

	@Override
	public String toString() {
		return "Genero [id=" + id + ", genero=" + genero + ", pelicula=" + pelicula + "]";
	}

}
