package ejercicio1;

public class SobreMesa extends Ordenador {
	
	private double precioMontaje;
	
	
	public SobreMesa(double discoDuro, double frecuencia, double precioBase, String marca, double precioMontaje) {
		super(discoDuro, frecuencia, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return "SobreMesa [precioMontaje=" + precioMontaje + ", toString()=" + super.toString() + "]";
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}
	public double calcularPrecio (double ganacia) {
		return precioMontaje + super.calcularPrecio(ganacia);
	}
}
