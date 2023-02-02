package ejercicio4;

public class LineaDeVenta {
	private Producto produc;
	private int cantidad;
	private double precioT;
	public LineaDeVenta(Producto produc, int cantidad, double precioT) {
		super();
		this.produc = produc;
		this.cantidad = cantidad;
		this.precioT = precioT;
	}
	
	public LineaDeVenta(Producto produc, int cantidad) {
		super();
		this.produc = produc;
		this.cantidad = cantidad;
	}

	public Producto getProduc() {
		return produc;
	}
	public void setProduc(Producto produc) {
		this.produc = produc;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioT() {
		return precioT;
	}
	public void setPrecioT(double precioT) {
		this.precioT = precioT;
	}
	@Override
	public String toString() {
		return "LineaDeVenta [produc=" + produc + ", cantidad=" + cantidad + ", precioT=" + precioT + "]";
	}
	public double calcularPrecioUNA(Producto p) {
		return p.calcularPrecioUni();
	}
	public double calcularPrecioT () {
		precioT=cantidad * produc.calcularPrecioUni();
		return precioT;
	}
	public void imprimirLineaTicket () {
		System.out.printf("%d\t%s\t%.2f\t%.2f\n", cantidad, produc.getNombre(), produc.getPrecioUni(), precioT);
	}
}
