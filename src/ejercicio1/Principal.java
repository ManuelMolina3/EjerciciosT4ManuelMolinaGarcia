package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ganancia;
		Ordenador o= new Ordenador (200.00, 2000, 300, "HP");
		SobreMesa sM= new SobreMesa (220.00, 1000, 340, "Levono", 50);
		Portatil p= new Portatil (290.00, 3090, 530, "Sony", 100);
		
		ganancia=Leer.datoDouble();
		System.out.println(o.calcularPrecio(ganancia));
		System.out.println(sM.calcularPrecio(ganancia));
		System.out.println(p.calcularPrecio(ganancia));
	}

}
