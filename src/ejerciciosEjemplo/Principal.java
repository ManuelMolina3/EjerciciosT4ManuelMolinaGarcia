package ejerciciosEjemplo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura cuadrado= new Cuadrado (1,2,2);
		Figura rectangulo=new Rectagulo(4,5,6,7);
		System.out.println(cuadrado.CalcularArea());
		System.out.println(rectangulo.CalcularArea());
	}

}
