package pojo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
class ClienteTest {
	List<Factura> tickets = new ArrayList<Factura>();
	Cliente cliente = new Cliente(1234, "12134567G", "user", "userLastName", "userLastName2", "user@gmail.com",
			"631565644", "Y1234yk", 'F', tickets);
	Cliente cliente2 = new Cliente(1235, "12155567R", "user22", "userLastName22", "userLastName222",
			"user222@gmail.com", "63154367", "ASD333", 'M', tickets);

	@Test
	void testConstructor() {

		assertEquals(cliente.getId(), 1234);
		assertEquals(cliente.getDni(), "12134567G");
		assertEquals(cliente.getNombre(), "user");
		assertEquals(cliente.getApellido1(), "userLastName");
		assertEquals(cliente.getApellido2(), "userLastName2");
		assertEquals(cliente.getEmail(), "user@gmail.com");
		assertEquals(cliente.getTele(), "631565644");
		assertEquals(cliente.getPassword(), "Y1234yk");
		assertEquals(cliente.getGenero(), 'F');
		assertEquals(cliente.getTickets().isEmpty(), true);

	}

	@Test
	void testGetters() {
		cliente.setPassword("XXX123YY");
		assertEquals(cliente.getPassword(), "Y1234yk");
	}

	@Test
	void testSetters() {

		cliente.setApellido2(null);
		assertNull(cliente.getApellido2());
	}

	@Test
	void testEquals() {
		assertEquals(cliente.equals(cliente2), false);
	}

	@Test
	void testToString() {
		String str = "Cliente [id=1234, dni=12134567G, nombre=user, apellido1=userLastName, apellido2=userLastName2, email=user@gmail.com, tele=631565644, password=Y1234yk, genero=F, tickets=[]]";
		assertEquals(cliente.toString(), str);
	}

}
