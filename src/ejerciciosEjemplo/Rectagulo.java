package ejerciciosEjemplo;

public class Rectagulo extends Figura{
	private double altura,base;

	public Rectagulo(double x, double y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rectagulo [altura=" + altura + ", base=" + base + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double CalcularArea() {
		
		return base*altura;
	}
	
}
