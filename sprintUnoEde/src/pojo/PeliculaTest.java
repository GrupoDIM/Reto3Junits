package pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PeliculaTest {
	List<Genero> genero = new ArrayList<Genero>();
	File file = null;
	Pelicula pelicula = new Pelicula(234, "soule", "soule", 145, null, 8.9, genero, file);
	Pelicula pelicula2 = new Pelicula(235, "cinderella", "cenicienta", 120, null, 8.9, genero, file);

	// CONSTRUCTOR
	@Test
	void testConstructor() {
		assertEquals(pelicula.getId(), 234);
		assertEquals(pelicula.getTituloOrigin(), "soule");
		assertEquals(pelicula.getTituloCastellano(), "soule");
		assertEquals(pelicula.getDuracion(), 145);
		assertEquals(pelicula.getDescripcion(), null);
		assertEquals(pelicula.getCalificacion(), 8.9);
		assertEquals(pelicula.getGenero().isEmpty(), true);
		assertEquals(pelicula.getImage(), null);

	}

	@Test
	void testGetters() {
		pelicula.setTituloOrigin("harry Potter");
		assertEquals(pelicula.getTituloOrigin(), "harry Potter");
	}

	@Test
	void testSetters() {
		pelicula.setId(66);
		assertEquals(pelicula.getId(), 66);
	}

	// EQUALS
	@Test
	void testEquals() {
		assertEquals(pelicula.equals(pelicula2), false);
	}

	// TO STRING
	@Test
	void testToString() {
		String str = "Pelicula [id=234, tituloOrigin=soule, tituloCastellano=soule,"
				+ " duracion=145, descripcion=null, calificacion=8.9, genero=[], image=null]";
		assertEquals(pelicula.toString(), str);
	}
	
	// GETTERS AND SETTERS
	@Test // ID
	void testId() {}
	@Test // TITULO ORIGINAL
	void testTituloOrigin() {}
	@Test // TITULO CASTELLANO
	void testTituloCastellano() {}
	@Test // DURACIÓN
	void testDuracion() {}
	@Test // DESCRIPCIÓN
	void testDescripcion() {}
	@Test // CALIFICACIÓN
	void testCalificacion() {}

}
