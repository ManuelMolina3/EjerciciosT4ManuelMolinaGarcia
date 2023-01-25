package ejercicio3;

public class Motocicleta extends Vehiculo{
	
	private double porcentaje;
	
	

	public Motocicleta(double cilindrada, double potencia, double emisiones, double porcentaje) {
		super(cilindrada, potencia, emisiones);
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Motocicleta [porcentaje=" + porcentaje + ", toString()=" + super.toString() + "]";
	}
	public double calcularImpuesto() {
		int cien=100;
		return super.calcularImpuesto()+(getCilindrada()*porcentaje/cien);
		
	}
	
}
