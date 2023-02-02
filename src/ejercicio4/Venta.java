package ejercicio4;

import java.util.Arrays;

public class Venta {
	private LineaDeVenta [] lineaTickect;
	private String fecha;
	private double precioTC;
	public Venta(LineaDeVenta[] lineaTickect, String fecha, double precioTC) {
		super();
		this.lineaTickect = lineaTickect;
		this.fecha = fecha;
		this.precioTC = precioTC;
	}
	
	public Venta(LineaDeVenta[] lineaTickect, String fecha) {
		super();
		this.lineaTickect = lineaTickect;
		this.fecha = fecha;
	}

	public LineaDeVenta[] getLineaTikect() {
		return lineaTickect;
	}
	public void setLineaTikect(LineaDeVenta[] lineaTikect) {
		this.lineaTickect = lineaTikect;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getPrecioTC() {
		return precioTC;
	}
	public void setPrecioTC(double precioTC) {
		this.precioTC = precioTC;
	}
	@Override
	public String toString() {
		return "Venta [lineaTikect=" + Arrays.toString(lineaTickect) + ", fecha=" + fecha + ", precioTC=" + precioTC
				+ "]";
	}
	
	public double calcularPrecioTC () {
	
		for (int i = 0; i < lineaTickect.length; i++) {
			precioTC+=lineaTickect[i].calcularPrecioT();
		}
		return precioTC;
	}
	public void imprimirTickect () {
		System.out.printf("\t\t\t\t%s\n",fecha);
		for (int i = 0; i < lineaTickect.length; i++) {
			lineaTickect[i].imprimirLineaTicket();
		}
		System.out.printf("\n\t\t\t\t %.2f", precioTC);
	}
}
