package pojo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TipoDePagoTest {
	List<Factura> tickets = new ArrayList<Factura>();
	Cliente cliente = new Cliente(1234, "12134567G", "user", "userLastName", "userLastName2", "user@gmail.com",
			"631565644", "Y1234yk", 'F', tickets);

	TipoDePago info = new TipoDePago("1234567543233", "12/23", "324354", cliente, null);
	TipoDePago info2 = new TipoDePago("1234576767676", "08/26", "324354", cliente, null);

	// CONSTRUCTOR //
	@Test
	void testConsructor() {
		assertEquals(info.getNumTarjeta(), "1234567543233");
		assertEquals(info.getCaducidad(), "12/23");
		assertEquals(info.getCvv(), "324354");
		assertEquals(info.getCliente(), cliente);

	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(info.equals(info2), false);
	}

	// TO STRING //
	@Test
	void testToString() {
		String str = "TipoDePago [numTarjeta=1234567543233, caducidad=12/23, cvv=324354,"
				+ " cliente=Cliente [id=1234, dni=12134567G, nombre=user, apellido1=userLastName, apellido2=userLastName2, email=user@gmail.com, tele=631565644, password=Y1234yk, genero=F, tickets=[]], factura=null]";
		assertEquals(info.toString(), str);
	}

	// GETTERS AND SETTERS //
	@Test // NUMERO DE TARJETA
	void testNumTarjeta() {
		info.setNumTarjeta("1234 5675 432 0033");
		assertEquals(info.getNumTarjeta(), "1234 5675 432 0033");
	}

	@Test // CADUCIDAD
	void testCaducidad() {
		info.setCaducidad("11/23");
		assertEquals(info.getCaducidad(), "11/23");
	}

	@Test // CVV
	void testCvv() {
		info.setCvv("563");
		assertEquals(info.getCvv(), "563");
	}

	@Test // CLIENTE
	void testCliente() {
		info.setCliente(null);
		assertNull(info.getCliente());
	}

	@Test // FACTURA
	void testFactura() {
		info.setFactura(null);
		assertNull(info.getFactura());
	}
}
