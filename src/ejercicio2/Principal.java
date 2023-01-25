package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*. Escribir un programa que tenga una clase Documento y dos clases hijas, Tarjeta de visita y Carta.
		Crear los métodos necesarios para que, la cabecera de cada tipo de documento se imprima en pantalla
		de una forma diferente, según sus características. Como es un ejemplo académico, podemos hacer los
		métodos de impresión dentro de cada clase.
		Crear un main para hacer una prueba con cada método llamado con objetos de las distintas clases. Por
		ejemplo, el documento genérico solo tiene un pequeño encabezado con los datos de la empresa, la
		tarjeta puede llevar, además, los datos de contacto de una persona y la carta, una fecha leída por teclado.*/
			int op;
			
			TarjetaVisita tV= new TarjetaVisita ("Paco.S.L", "C/San Miguel", "Hosteleria",  "Manuel Molina Garcia" );
			Carta c= new Carta ("Paco.S.L", "C/San Miguel", "Hosteleria", "22-1-2023");
			do {
				op=Leer.datoInt();
				switch(op) {
				case 1:   
					
					break;
				case 2:
					tV.printDocument();
					break;
				case 3:
					c.printDocument();

					break;
				case 0:
					break;
				default:
					System.out.println("Opción no encontrada");
					break;
				}

		
			}while(op!=0);
			
	
	}

}
