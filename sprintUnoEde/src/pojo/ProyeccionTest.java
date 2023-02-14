package pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.File;

import java.util.ArrayList;

import java.util.List;

import org.junit.jupiter.api.Test;

class ProyeccionTest {
	
	Cine cine = new Cine(111222, "ZUBIARTE", "direccioncine1", "631556677", "zubiarte@gmail.com", "48012", "bilbao",
			"bizkaia");

	Sala sala = new Sala(1234, "naranja", true, cine);
	Sala sala1 = new Sala(1237, "jasmin", true, cine);
	List<Genero> genero = new ArrayList<Genero>();
	File file = null;
	Pelicula pelicula = new Pelicula(234, "soule", "soule", 145, null, 8.9, genero, file);
	Proyeccion proyec = new Proyeccion(sala, pelicula, null, null, 9.99);
	Proyeccion proyec1 = new Proyeccion(sala1, pelicula, null, null, 9.99);

	// CONSTRUCTOR //
	@Test
	void testConstuctor() {
		assertEquals(proyec.getSala(), sala);
		assertEquals(proyec.getPelicula(), pelicula);
		assertEquals(proyec.getFecha(), null);
		assertEquals(proyec.getHora(), null);
		assertEquals(proyec.getPrecio(), 9.99);
	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(proyec.equals(proyec1), false);
	}

	// TO STRING //
	@Test
	void testToString() {
		String str = "Proyeccion [sala=Sala [id=1234, nombre=naranja, disponible=true,"
				+ " cine=Cine [id=111222, nombre=ZUBIARTE, direccion=direccioncine1, tele=631556677, mail=zubiarte@gmail.com, codPostal=48012, ciudad=bilbao, provincia=bizkaia], asientos=[]],"
				+ " pelicula=Pelicula [id=234, tituloOrigin=soule, tituloCastellano=soule, duracion=145, descripcion=null, calificacion=8.9, genero=[], image=null], fecha=null, hora=null, precio=9.99]";
		assertEquals(proyec.toString(), str);
	}

	// GETTERS AND SETTERS //
	@Test // SALA
	void testSala() {
		proyec.setSala(sala1);
		assertEquals(proyec.getSala(), sala1);
	}
	@Test // PELICULA
	void testPelicula() {
		proyec.setPelicula(pelicula);
		assertEquals(proyec.getPelicula(), pelicula);
	}
	@Test // FECHA
	void testFecha() {
		proyec.setFecha(null);
		assertNull(proyec.getFecha());
	}
	@Test // HORA
	void testHora() {
		proyec.setHora(null);
		assertNull(proyec.getHora());
	}
	@Test // PRECIO
	void testPrecio() {
		proyec.setPrecio(5.99);
		assertEquals(proyec.getPrecio(), 9.99, "se esperaba 5,99");
	}
}
