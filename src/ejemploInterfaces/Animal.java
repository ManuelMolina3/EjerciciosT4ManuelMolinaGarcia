package ejemploInterfaces;

public class Animal implements IDepredador, IPresa{
	private String color;
	private int numPatas;
	
	public Animal(String color, int numPatas) {
		super();
		this.color = color;
		this.numPatas = numPatas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + ", numPatas=" + numPatas + "]";
	}
	@Override
	public void localizar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy localizando");
	}
	@Override
	public void cazar() {
		// TODO Auto-generated method stub
		System.out.println("Me he cargado un "+color+" con "+numPatas+" patas");
	}
	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("Me he hartado de correr");
	}
	
	
}
