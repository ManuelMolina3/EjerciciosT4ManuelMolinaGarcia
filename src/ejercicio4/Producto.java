package ejercicio4;

public class Producto implements IImpuesto, IImprimirPaplinas{
	private double precioUni;
	private String nombre;
	private String id;
	public Producto(double precioUni, String nombre, String id) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.id = id;
	}
	public double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Producto [PrecioUni=" + precioUni + ", nombre=" + nombre + ", id=" + id + "]";
	}
	public double calcularPrecioUni () {
		return precioUni;
	}
	@Override
	public double calcularIVA(double porcentaje) {
		// TODO Auto-generated method stub
		return precioUni*porcentaje/100;
	}
	@Override
	public void imprimirCod() {
		// TODO Auto-generated method stub
		
	}
	
}
