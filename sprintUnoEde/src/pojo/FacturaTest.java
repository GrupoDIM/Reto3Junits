package pojo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FacturaTest {

	List<Asiento> asientos = new ArrayList<Asiento>();
	Cine cine = new Cine(111222, "ZUBIARTE", "direccioncine1", "631556677", "zubiarte@gmail.com", "48012", "bilbao",
			"bizkaia");

	Sala sala = new Sala(1234, "naranja", true, cine, asientos);
	List<Genero> genero = new ArrayList<Genero>();
	File file = null;
	Pelicula pelicula = new Pelicula(234, "soule", "soule", 145, null, 8.9, genero, file);
	List<Factura> tickets = new ArrayList<Factura>();
	Cliente cliente = new Cliente(1234, "12134567G", "user", "userLastName", "userLastName2", "user@gmail.com",
			"631565644", "Y1234yk", 'F', tickets);
	TipoDePago info = new TipoDePago("121345657687", null, "23456", cliente, null);
	Factura factura = new Factura(5456, 3, 5.99, 0.3, 17.9, 5.4, info, pelicula, sala, cliente);
	Factura factura2 = new Factura(77, 1, 8.99, 0.0, 8.99, 8.99, info, pelicula, sala, cliente);

	@Test
	void testConstructor() {
		assertEquals(factura.getId(), 5456);
		assertEquals(factura.getCantidad(), 3);
		assertEquals(factura.getPrecioUnidad(), 5.99);
		assertEquals(factura.getDescuento(), 0.3);
		assertEquals(factura.getPrecio(), 17.9);
		assertEquals(factura.getPrecioTotal(), 5.4);
		assertEquals(factura.getInfo(), info);
		assertEquals(factura.getPelicula(), pelicula);
		assertEquals(factura.getSala(), sala);
		assertEquals(factura.getCliente(), cliente);
	}

	@Test
	void testGetters() {

		factura.setDescuento(0.5);
		assertEquals(factura.getDescuento(), 0.3, "se esperaba 0,5");
	}

	@Test
	void testSetters() {
		factura.setInfo(null);
		assertNull(factura.getInfo());
	}

	@Test
	void testEquals() {
		assertEquals(factura.equals(factura2), false);
	}

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

}
