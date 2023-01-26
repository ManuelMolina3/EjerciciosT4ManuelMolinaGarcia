package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a pagar depende
		de la cilindrada, potencia en caballos y categoría de emisiones contaminantes (cero, ECO, tipo B y
		tipo C). Crear un programa para calcular la cantidad que debe pagar un vehículo dependiendo de sus
		características. (Los vehículos a motor pueden ser motocicletas, coches y furgonetas).
		El impuesto se calcula con una cantidad fija cuyo valor depende del tipo de emisiones por el simple
		hecho de ser un vehículo con motor más:
			- El 60 % de la cilindrada en el caso de las motocicletas.
			- Otra fija a las furgonetas por ser transporte de mercancías.
			- El 25 % de la potencia en el caso de los coches.
		La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para reescribir métodos.
		Probar todo en un main sencillo.
		 */
		double potencia, cilindrada, emisiones;
		int op;
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Bienvenido al programa el cual te ayuda a calcular cuanto tienes que pagar de impuestos de tu vehiculo");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Dígame cuantos caballos tiene su vehiculo");
		potencia=Leer.datoDouble();
		System.out.println("Dígame que clindrada tiene su vehiculo");
		cilindrada=Leer.datoDouble();
		do {
		System.out.println("\nPulse 1 si su vehiculo tiene 0 emisiones\n"
				+ "Pulse 2 si su vehiculo es ECO\n"
				+ "Pulse 3 si su vehiculo es Tipo B\n"
				+ "Pulse 4 si su vehiculo es tipo C\n");
		emisiones=Leer.datoInt();
		if (emisiones>4) 
			System.out.println("Opción no encontrada");
		
		}while (emisiones>4);
		Motocicleta moto= new Motocicleta(cilindrada, potencia, emisiones, 60);
		Furgoneta fragoneta= new Furgoneta(cilindrada, potencia, emisiones, 50);
		Coche cochecito= new Coche(cilindrada, potencia, emisiones, 25);
		do {
			System.out.println("\nPulse 1 si tiene una motocicleta\n"
					+ "Pulse 2 si tiene una furgoneta\n"
					+ "Pulse 3 si tiene un coche\n"
					+ "Pulse 0 si quiere salir del programa\n");
			op=Leer.datoInt();
			switch(op) {
			case 1:
				System.out.printf("Usted pagaria por su moto: %.2f euros",  moto.calcularImpuesto());
				break;
			case 2:
				System.out.printf("Usted pagaria por su furgoneta: %.2f euros",  fragoneta.calcularImpuesto());
				break;
			case 3:
				System.out.printf("Usted pagaria por su coche: %.2f euros",  cochecito.calcularImpuesto());
				break;
			case 0:
				break;
			default:
				System.out.println("Respuesta no encontrada");
				break;
			}
			
		}while(op!=0);
		System.out.println("Gracias por usar el programa esperemos que le haya servido de utilidad");
	}

}
