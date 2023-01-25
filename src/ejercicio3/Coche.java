package ejercicio3;

public class Coche extends Vehiculo{
	private double increPotencia;

	public Coche(double cilindrada, double potencia, double emisiones, double increPotencia) {
		super(cilindrada, potencia, emisiones);
		this.increPotencia = increPotencia;
	}

	public double getIncrePotencia() {
		return increPotencia;
	}

	public void setIncrePotencia(double increPotencia) {
		this.increPotencia = increPotencia;
	}

	@Override
	public String toString() {
		return "Coche [increpotencia=" + increPotencia + ", toString()=" + super.toString() + "]";
	}
	public double calcularImpuesto() {
		int cien=100;
		return super.calcularImpuesto()+(getPotencia() *increPotencia/cien);
		
	}
	
}
