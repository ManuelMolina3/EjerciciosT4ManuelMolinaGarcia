package ejercicio1;

public class Ordenador {
	
	private double discoDuro;
	private double frecuencia;
	private double precioBase;
	private String marca;
	public Ordenador(double discoDuro, double frecuencia, double precioBase, String marca) {
		super();
		this.discoDuro = discoDuro;
		this.frecuencia = frecuencia;
		this.precioBase = precioBase;
		this.marca = marca;
	}
	public double getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(double discoDuro) {
		this.discoDuro = discoDuro;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Ordenador [discoDuro=" + discoDuro + ", frecuencia=" + frecuencia + ", precioBase=" + precioBase
				+ ", marca=" + marca + "]";
	}
	public double calcularPrecio (double ganancia) {
		int cien=100;
		return precioBase+ (precioBase*ganancia/cien);
	}
}
