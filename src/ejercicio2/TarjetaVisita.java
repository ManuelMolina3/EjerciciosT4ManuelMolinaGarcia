package ejercicio2;

public class TarjetaVisita extends Documento{

	private String datosPersonales;

	public TarjetaVisita(String empresa, String direccion, String sector, String datosPersonales) {
		super(empresa, direccion, sector);
		this.datosPersonales = datosPersonales;
	}

	public String getDatosPersonales() {
		return datosPersonales;
	}

	public void setDatosPersonales(String datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	@Override
	public String toString() {
		return "TarjetaVisita [datosPersonales=" + datosPersonales + ", toString()=" + super.toString() + "]";
	}
	public void printDocument() {
		System.out.println("-----------------");
		System.out.println(datosPersonales);
		System.out.println("-----------------------");
		System.out.println(super.getEmpresa());
		System.out.println(super.getSector());
		System.out.println(super.getDireccion());
		System.out.println("------------------------");
	}
	
}
