package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que imprima un ticket de compra, basándonos en un
		 * supermercado. Debemos crear la clase Producto genérica y tres hijas con un
		 * atributo más cada una (Alimentación, Ropa y Electrónica). Cada Producto
		 * genérico deberá estar caracterizado por el precio unitario, nombre, código de
		 * identificación, etc. El precio de los productos de electrónica lleva un
		 * impuesto especial por ser de lujo y la alimentación un descuento cuando le
		 * quedan menos de 2 días para caducar. La clase Línea de venta, con un producto
		 * y una cantidad y la clase Venta con un array de líneas de venta. El ticket
		 * debe mostrar una venta completa con varios productos y varias cantidades. Se
		 * pueden crear los productos directamente en el main antes de empezar. Agregar
		 * un método solo en la clase alimentación, que avise si al producto le quedan
		 * menos de 2 días para caducar. Crear un main, crearemos directamente los
		 * objetos necesarios. Solo habrá la opción imprimir ticket y listar todos los
		 * productos guardados, avisando cuando a un producto de alimentación le falten
		 * menos de dos días para caducar
		 * 
		 */
		String fecha = "22-10-2023";
		Producto ele1 = new Electronica(150, "iphone 13", "10c", 20);
		Producto ele2 = new Electronica(60, "TV LG23", "20c", 20);
		Producto rop1 = new Ropa(20, "Camisa", "30a");
		Producto rop2 = new Ropa(35, "Pantalon", "40a");
		Producto ali1 = new Alimentacion(1.5, "Platanos", "50b", 0.30);
		Producto ali2 = new Alimentacion(0.35, "Pan", "60b", 0.5);
		LineaDeVenta ln1= new LineaDeVenta (ele1, 2);
		LineaDeVenta ln2= new LineaDeVenta (ele2, 3);
		LineaDeVenta ln3= new LineaDeVenta (rop1, 1);
		LineaDeVenta ln4= new LineaDeVenta (rop2, 1);
		LineaDeVenta ln5= new LineaDeVenta (ali1, 4);
		LineaDeVenta ln6= new LineaDeVenta (ali2, 3);
		LineaDeVenta lineasTickect []={ln1, ln2,ln3, ln4, ln5, ln6};
		Venta tickect = new Venta (lineasTickect, fecha);
		ln1.calcularPrecioT();
		ln2.calcularPrecioT();
		ln3.calcularPrecioT();
		ln4.calcularPrecioT();
		ln5.calcularPrecioT();
		ln6.calcularPrecioT();
		tickect.calcularPrecioTC();
		tickect.imprimirTickect();
	}

}
