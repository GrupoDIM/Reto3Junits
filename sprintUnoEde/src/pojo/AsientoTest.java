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
	Asiento asiento = new Asiento(444, 1, 34, true, sala);
	Asiento asiento1 = new Asiento(446, 2, 3, false, sala);

	// CONSTRUCTOR //
	@Test
	void testConstructor() {
		assertEquals(asiento.getId(), 444);
		assertEquals(asiento.isDisponible(), true);
		assertEquals(asiento.getSala(), sala);
	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(asiento.equals(asiento1), false);
	}

	// TO STRING //
	@Test
	void testToString() {
		String str = "Asiento [id=444, fila=1, numero=34, disponible=true, sala=Sala [id=1234, nombre=naranja, disponible=true,"
				+ " cine=Cine [id=111222, nombre=zubiarte, direccion=direccioncine1, tele=631556677, mail=zubiarte@gmail.com, codPostal=48012, ciudad=bilbao, provincia=bizkaia], asientos=[]]]";
		assertEquals(asiento.toString(), str);
	}

	// GETTERS Y SETTERS
	@Test // ID
	void testId() {
		asiento.setId(66);
		assertEquals(asiento.getId(), 66);
	}

	@Test // FILA
	void testFila() {
		asiento.setFila(66);
		assertEquals(asiento.getFila(), 66);
	}

	@Test // NUMERO
	void testNumero() {
		asiento.setNumero(66);
		assertEquals(asiento.getNumero(), 66);
	}

	@Test // DISPONIBLE
	void testDisponible() {
		asiento.setDisponible(false);
		assertEquals(asiento.isDisponible(), false);
	}
}
