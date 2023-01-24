package ejercicio1;

public class Portatil extends Ordenador{

	private double seguroPantalla;

	public Portatil(double discoDuro, double frecuencia, double precioBase, String marca, double seguroPantalla) {
		super(discoDuro, frecuencia, precioBase, marca);
		this.seguroPantalla = seguroPantalla;
	}

	public double getSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(double seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	@Override
	public String toString() {
		return "Portatil [seguroPantalla=" + seguroPantalla + ", toString()=" + super.toString() + "]";
	}
	public double calcularPrecio (double ganancia) {
		return seguroPantalla+ super.calcularPrecio(ganancia);
	}
}
