package pojo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AsientoTest {
	List<Asiento> asientos = new ArrayList<Asiento>();
	Cine cine = new Cine(111222, "zubiarte", "direccioncine1", "631556677", "zubiarte@gmail.com", "48012", "bilbao",
			"bizkaia");
	Sala sala = new Sala(1234, "naranja", true, cine, asientos);
	Asiento asiento = new Asiento(444, true, sala);
	Asiento asiento1 = new Asiento(446, false, sala);

	@Test
	void testConstructor() {
		assertEquals(asiento.getId(), 444);
		assertEquals(asiento.isDisponible(), true);
		assertEquals(asiento.getSala(), sala);
	}

	@Test
	void testGetters() {
		asiento.setDisponible(false);
		assertEquals(asiento.isDisponible(), true);
	}

	@Test
	void testSetters() {
		asiento.setId(66);
		assertEquals(asiento.getId(), 66);
	}

	@Test
	void testEquals() {
		assertEquals(asiento.equals(asiento1), false);
	}

	@Test
	void testToString() {
		String str = "Asiento [id=444, disponible=true, sala=Sala [id=1234, nombre=naranja, disponible=true,"
				+ " cine=Cine [id=111222, nombre=zubiarte, direccion=direccioncine1, tele=631556677, mail=zubiarte@gmail.com, codPostal=48012, ciudad=bilbao, provincia=bizkaia], asientos=[]]]";
		assertEquals(asiento.toString(), str);
	}
}
