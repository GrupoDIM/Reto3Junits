package pojo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GeneroTest {
	List<Genero> generos = new ArrayList<Genero>();
	File file = null;
	Pelicula peli = new Pelicula(234, "soule", "soule", 145, null, 8.9, generos, file);
	Genero genero = new Genero(1, "Drama", peli);
	Genero genero1 = new Genero(2, "comedia", peli);

	// CONSTRUCTOR //
	@Test
	void testConstructor() {

		assertEquals(genero.getId(), 1);
		assertEquals(genero.getGenero(), "Drama");
		assertEquals(genero.getPelicula(), peli);
	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(genero.equals(genero1), false);
	}

	// TO STRING
	@Test
	void testToString() {
		String str = "Genero [id=1, genero=Drama, pelicula=Pelicula [id=234, tituloOrigin=soule, tituloCastellano=soule,"
				+ " duracion=145, descripcion=null, calificacion=8.9, genero=[], image=null]]";
		assertEquals(genero.toString(), str);
	}

	// GETTERS AND SETTERS
	@Test // ID
	void testId() {
		genero.setId(22);
		assertEquals(genero.getId(), 1);
	}

	@Test // GENERO
	void testGenero() {
		genero.setGenero("comedia");
		assertEquals(genero.getGenero(), "comedia");
	}

	@Test // PELICULA
	void testPelicula() {
		genero.setPelicula(null);
		assertNull(genero.getPelicula());
	}
}
