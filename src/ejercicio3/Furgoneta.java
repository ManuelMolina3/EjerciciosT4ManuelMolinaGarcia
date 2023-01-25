package ejercicio3;

public class Furgoneta extends Vehiculo{
	private double mercancia;

	public Furgoneta(double cilindrada, double potencia, double emisiones, double mercancia) {
		super(cilindrada, potencia, emisiones);
		this.mercancia = mercancia;
	}

	public double getMercancia() {
		return mercancia;
	}

	public void setMercancia(double mercancia) {
		this.mercancia = mercancia;
	}

	@Override
	public String toString() {
		return "Furgoneta [mercancia=" + mercancia + ", toString()=" + super.toString() + "]";
	}
	public double calcularImpuesto() {
		
		return super.calcularImpuesto()+ mercancia;
		
	}
}
