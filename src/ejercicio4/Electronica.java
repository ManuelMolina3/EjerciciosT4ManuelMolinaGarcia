package ejercicio4;

public class Electronica extends Producto{

	private double impuestoEsp;

	public Electronica(double precioUni, String nombre, String id, double impuestoEsp) {
		super(precioUni, nombre, id);
		this.impuestoEsp = impuestoEsp;
	}

	public double getImpuestoEsp() {
		return impuestoEsp;
	}

	public void setImpuestoEsp(double impuestoEsp) {
		this.impuestoEsp = impuestoEsp;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoEsp=" + impuestoEsp + ", toString()=" + super.toString() + "]";
	}
	public double calcularPrecioUni () {
		return super.calcularPrecioUni()*impuestoEsp;
	}
}
