package pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SalaTest {
	Cine cine = new Cine(111222, "ZUBIARTE", "direccioncine1", "631556677", "zubiarte@gmail.com", "48012", "bilbao",
			"bizkaia");

	Sala sala = new Sala(1234, "naranja", true, cine);
	Sala sala2 = new Sala(4566, "genger", true,  cine );

	// CONSTRUCTOR //
	@Test
	void testConstructor() {
		assertEquals(sala.getId(), 1234);
		assertEquals(sala.getNombre(), "naranja");
		assertEquals(sala.isDisponible(), true);
		assertEquals(sala.getCine(), cine);


	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(sala.equals(sala2), false);
	}

	// TO STRING //
	@Test
	void testToString() {
		String str = "Sala [id=1234, nombre=naranja, disponible=true,"
				+ " cine=Cine [id=111222, nombre=ZUBIARTE, direccion=direccioncine1, tele=631556677, mail=zubiarte@gmail.com, codPostal=48012, ciudad=bilbao, provincia=bizkaia], asientos=[]]";
		assertEquals(sala.toString(), str);
	}

	// GETTERS AND SETTERS //
	@Test // ID
	void testId() {
		sala.setId(83);
		assertEquals(sala.getId(), 83);
	}

	@Test // NOMBRE
	void testNombre() {
		sala.setNombre("BLUE");
		assertEquals(sala.getNombre(), "BLUE");
	}

	@Test // DISPONIBLE
	void testDisponible() {
		sala.setDisponible(false);
		assertEquals(sala.isDisponible(), false);
	}

	@Test // CINE
	void testCine() {
		sala.setCine(null);
		assertNull(sala.getCine());
	}

	
}
