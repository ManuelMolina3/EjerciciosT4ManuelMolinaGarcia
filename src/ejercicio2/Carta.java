package ejercicio2;

public class Carta extends Documento{
	
	private String fecha;

	public Carta(String empresa, String direccion, String sector, String fecha) {
		super(empresa, direccion, sector);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", toString()=" + super.toString() + "]";
	}
	public void printDocument () {
		System.out.println("-----------------------");
		System.out.printf("\n\t\t\t %s", fecha);
		System.out.println("-----------------------");
		System.out.println(super.getEmpresa());
		System.out.println(super.getSector());
		System.out.println(super.getDireccion());
		System.out.println("------------------------");
	}
}
