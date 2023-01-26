package ejercicio4;

import java.util.Random;

public class Alimentacion extends Producto{

	private double descuento;

	public Alimentacion(double precioUni, String nombre, String id, double descuento) {
		super(precioUni, nombre, id);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + ", toString()=" + super.toString() + "]";
	}
	public int generarCaducidad () {
		int desde=1, hasta=5;
		Random n = new Random (System.nanoTime());
		int caducidad= n.nextInt(hasta-desde+1)+desde;
		return caducidad;
	}
	public double calcularPrecioUni () {
		int dos=2;
		if (generarCaducidad()<dos)
			return super.calcularPrecioUni()-descuento;
		else 
			return super.calcularPrecioUni();
	}
}
