package pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class TipoDePago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2679266115629226382L;
	/**
	 * 
	 */

	private String numTarjeta = null;
	private String caducidad = null;
	private String cvv = null;
	private Cliente cliente = null;
	private Factura factura = null;

	public TipoDePago(String numTarjeta, String caducidad, String cvv, Cliente cliente, Factura factura) {
		super();
		this.numTarjeta = numTarjeta;
		this.caducidad = caducidad;
		this.cvv = cvv;
		this.cliente = cliente;
		this.factura = factura;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caducidad, cliente, cvv, factura, numTarjeta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoDePago other = (TipoDePago) obj;
		return Objects.equals(caducidad, other.caducidad) && Objects.equals(cliente, other.cliente)
				&& Objects.equals(cvv, other.cvv) && Objects.equals(factura, other.factura)
				&& Objects.equals(numTarjeta, other.numTarjeta);
	}

	@Override
	public String toString() {
		return "TipoDePago [numTarjeta=" + numTarjeta + ", caducidad=" + caducidad + ", cvv=" + cvv + ", cliente="
				+ cliente + ", factura=" + factura + "]";
	}

}
