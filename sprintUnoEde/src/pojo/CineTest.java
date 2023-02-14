package pojo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CineTest {
	Cine cine = new Cine(111222, "zubiarte", "direccioncine1", "631556677", "zubiarte@gmail.com", "48012", "bilbao", "bizkaia");
	Cine cine2 = new Cine(1112223, "FLOWERS", "direccioncine2", "631556887", "flowers@gmail.com", "48012", "bilbao",
			"bizkaia");

	// CONSTRUCTOR //
	@Test
	void testConstructor() {
		assertEquals(cine.getId(), 111222);
		assertEquals(cine.getNombre(), "zubiarte");
		assertEquals(cine.getDireccion(), "direccioncine1");
		assertEquals(cine.getTele(), "631556677");
		assertEquals(cine.getMail(), "zubiarte@gmail.com");
		assertEquals(cine.getCodPostal(), "48012");
		assertEquals(cine.getCiudad(), "bilbao");
		assertEquals(cine.getProvincia(), "bizkaia");
	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(cine.equals(cine2), false);
	}

	// GETTERS Y SETTERS //

	@Test // ID
	void testId() {
		cine.setId(111222);
		assertEquals(cine.getId(), 111222);
	}

	@Test // NOMBRE
	void tetNombre() {
		cine.setNombre("maxcenter");
		assertEquals(cine.getNombre(), "zubiarte", "se esperaba maxcenter");
	}

	@Test // DIRECCION
	void testDireccion() {
		cine.setDireccion("direccioncine1");
		assertEquals(cine.getDireccion(), "direccioncine1", "se esperaba maxcenter");
	}

	@Test // TELEFONO
	void testTele() {
		cine.setTele("631556677");
		assertEquals(cine.getTele(), "631556677", "se esperaba 631556677");
	}

	@Test // MAIL
	void testMail() {
		cine.setMail("zubiarte@gmail.com");
		assertEquals(cine.getMail(), "zubiarte@gmail.com", "se esperaba zubiarte@gmail.com");
	}

	@Test // CODIGO POSTAL
	void testCodPostal() {
		cine.setCodPostal("48012");
		assertEquals(cine.getCodPostal(), "48012", "se esperaba 48012");
	}

	@Test // CIUDAD
	void testCiudad() {
		cine.setCiudad("bilbao");
		assertEquals(cine.getCiudad(), "bilbao", "se esperaba bilbao");
	}

	@Test // PROVINCIA
	void testProvincia() {
		cine.setProvincia("bizkaia");
		assertEquals(cine.getProvincia(), "bizkaia", "se esperaba bizkaia");
	}

}
