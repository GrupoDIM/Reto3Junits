package pojo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CineTest {
	Cine cine = new Cine(111222, "zubiarte", "direccioncine1", "631556677", "zubiarte@gmail.com", "48012", "bilbao",
			"bizkaia");
	Cine cine2 = new Cine(1112223, "FLOWERS", "direccioncine2", "631556887", "flowers@gmail.com", "48012", "bilbao",
			"bizkaia");

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

	@Test
	void testGetters() {

		cine.setNombre("maxcenter");
		assertEquals(cine.getNombre(), "zubiarte", "se esperaba maxcenter");
	}

	@Test
	void testSetters() {
		cine.setId(55555);
		assertEquals(cine.getId(), 55555);
	}

	@Test
	void testEquals() {
		assertEquals(cine.equals(cine2), false);
	}

	@Test
	void testToString() {
		String str = "Cine [id=111222, nombre=zubiarte, direccion=direccioncine1, tele=631556677, mail=zubiarte@gmail.com, codPostal=48012, ciudad=bilbao, provincia=bizkaia]";
		assertEquals(cine.toString(), str);
	}

}
