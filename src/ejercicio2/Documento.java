package ejercicio2;

public abstract class Documento {

	private String empresa;
	private String direccion;
	private String sector;
	
	
	public Documento(String empresa, String direccion, String sector) {
		super();
		this.empresa = empresa;
		this.direccion = direccion;
		this.sector = sector;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	@Override
	public String toString() {
		return "Documento [empresa=" + empresa + ", direccion=" + direccion + ", sector=" + sector + "]";
	}
	public abstract void printDocument ();
}
