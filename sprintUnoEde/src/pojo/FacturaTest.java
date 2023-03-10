package pojo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FacturaTest {

	List<Genero> genero = new ArrayList<Genero>();
	File file = null;
	Pelicula pelicula = new Pelicula(234, "soule", "soule", 145, null, 8.9, genero, file);
	List<Factura> tickets = new ArrayList<Factura>();
	Cliente cliente = new Cliente(1234, "12134567G", "user", "userLastName", "userLastName2", "user@gmail.com",
			"631565644", "Y1234yk", 'F', tickets);
	Factura factura = new Factura(5456, 3, 5.99, 0.3, 17.9, 5.4, pelicula, cliente);
	Factura factura2 = new Factura(77, 1, 8.99, 0.0, 8.99, 8.99, pelicula, cliente);

	// CONSTRUCTOR //
	@Test
	void testConstructor() {
		assertEquals(factura.getId(), 5456);
		assertEquals(factura.getCantidad(), 3);
		assertEquals(factura.getPrecioUnidad(), 5.99);

		assertEquals(factura.getPrecioTotal(), 5.4);
		assertEquals(factura.getCliente(), cliente);
	}

	// EQUALS //
	@Test
	void testEquals() {
		assertEquals(factura.equals(factura2), false);
	}

	// TO STRING //
	@Test
	void testToString() {
		String str = "Factura [id=5456, cantidad=3, precioUnidad=5.99, descuento=0.3, precio=17.9, precioTotal=5.4,"
				+ " info=TipoDePago [numTarjeta=121345657687, caducidad=null, cvv=23456, "
				+ "cliente=Cliente [id=1234, dni=12134567G, nombre=user, apellido1=userLastName, apellido2=userLastName2, email=user@gmail.com, tele=631565644, password=Y1234yk, genero=F, tickets=[]], factura=null],"
				+ " pelicula=Pelicula [id=234, tituloOrigin=soule, tituloCastellano=soule, duracion=145, descripcion=null, calificacion=8.9, genero=[], image=null],"
				+ " sala=Sala [id=1234, nombre=naranja, disponible=true, cine=Cine [id=111222, nombre=ZUBIARTE, direccion=direccioncine1, tele=631556677, mail=zubiarte@gmail.com, codPostal=48012, ciudad=bilbao, provincia=bizkaia], asientos=[]], "
				+ "cliente=Cliente [id=1234, dni=12134567G, nombre=user, apellido1=userLastName, apellido2=userLastName2, email=user@gmail.com, tele=631565644, password=Y1234yk, genero=F, tickets=[]]]";
		assertEquals(factura.toString(), str);
	}

	// GETTERS AND SETTERS //
	@Test // ID
	void testId() {
		factura.setId(1);
		assertEquals(factura.getId(), 1);
	}

	@Test // CANTIDAD
	void testCantidad() {
		factura.setCantidad(1);
		assertEquals(factura.getCantidad(), 1);
	}

	@Test // PRECIO UNIDAD
	void testPrecioUnidad() {
		factura.setPrecioUnidad(1.2);
		assertEquals(factura.getPrecioUnidad(), 1.2);
	}

	@Test // PRECIO TOTAL
	void testPrecioTotal() {
		factura.setPrecioTotal(1.2);
		assertEquals(factura.getPrecioTotal(), 1.2);
	}

	@Test // CLIENTE
	void testCliente() {
		factura.setCliente(null);
		assertNull(factura.getCliente());
	}
}
