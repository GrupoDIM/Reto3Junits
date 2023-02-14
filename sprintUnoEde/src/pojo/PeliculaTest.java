package pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
	void testId() {
		pelicula.setId(66);
		assertEquals(pelicula.getId(), 66);
	}

	@Test // TITULO ORIGINAL
	void testTituloOrigin() {
		pelicula.setTituloOrigin("Avatar: The Way of Water");
		assertEquals(pelicula.getTituloOrigin(), "Avatar: The Way of Water");
	}

	@Test // TITULO CASTELLANO
	void testTituloCastellano() {
		pelicula.setTituloCastellano("Avatar: El sentido del agua");
		assertEquals(pelicula.getTituloCastellano(), "Avatar: El sentido del agua");
	}

	@Test // DURACIÓN
	void testDuracion() {
		pelicula.setDuracion("3:10:00");
		assertEquals(pelicula.getDuracion(), "3:10:00");
	}

	@Test // DESCRIPCIÓN
	void testDescripcion() {
		pelicula.setDescripcion(
				"Jake Sully y Ney'tiri han formado una familia y hacen todo lo posible por permanecer juntos. Sin embargo, deben abandonar su hogar y explorar las regiones de Pandora cuando una antigua amenaza reaparece.");
		assertEquals(pelicula.getDescripcion(),
				"Jake Sully y Ney'tiri han formado una familia y hacen todo lo posible por permanecer juntos. Sin embargo, deben abandonar su hogar y explorar las regiones de Pandora cuando una antigua amenaza reaparece.");
	}

	@Test // CALIFICACIÓN
	void testCalificacion() {
		pelicula.setCalificacion(4.3);
		assertEquals(pelicula.getCalificacion(), 4.3);
	}

	@Test // GENERO
	void testGenero() {
		pelicula.setGenero(null);
		assertNull(pelicula.getGenero());
	}

	@Test // IMAGEN
	void testImage() {
		pelicula.setImage(null);
		assertNull(pelicula.getImage());
	}

}
