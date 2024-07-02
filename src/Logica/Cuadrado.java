package Logica;

public class Cuadrado extends Rectangulo {

	private double lado = 0;
	
	public Cuadrado(String color, String nombreFigura, Posicion pos, double lado) {
		
		super(color, nombreFigura, pos, lado, lado);
		this.lado = lado;
	}

	@Override
	public void cambiarEscala(double escala) {
		
		this.lado *= escala;
	}

	@Override
	public void calcArea() {
		
		this.setArea(this.lado * this.lado);
	}

	@Override
	public void calcPerimetro() {
		
		this.setPerimetro(4 * this.lado);
	}
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("Color: " + this.getColor());
		System.out.println("Lado: " + this.lado);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimetro());
		System.out.println("Posicion: (" + this.getPosicion().getPosX() + ", "+ this.getPosicion().getPosY() + ")");
		System.out.println("");
	}
}
