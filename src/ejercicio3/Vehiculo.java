package ejercicio3;


public class Vehiculo {
	private double cilindrada;
	private double potencia;
	private double emisiones;
	public Vehiculo(double cilindrada, double potencia, double emisiones) {
		super();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.emisiones = emisiones;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getEmisiones() {
		return emisiones;
	}
	public void setEmisiones(double emisiones) {
		this.emisiones = emisiones;
	}	
	@Override
	public String toString() {
		return "Vehiculo [cilindrada=" + cilindrada + ", potencia=" + potencia + ", emisiones=" + emisiones + "]";
	}
	public double calcularImpuesto() {
		double Ppotencia= 4, Pcilindrada=5, Pemisiones=10;
		return (potencia*Ppotencia) + (cilindrada *Pcilindrada) + (emisiones* Pemisiones);
		
	}
}
