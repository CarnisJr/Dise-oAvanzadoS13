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
		
		this.area = this.lado * this.lado;
	}

	@Override
	public void calcPerimetro() {
		
		this.perimetro = 4 * this.lado;
	}
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("Lado: " + this.lado);
		System.out.println("Area: " + this.area);
		System.out.println("Perimetro: " + this.perimetro);
		System.out.println("Posicion: (" + this.posicion.getPosX() + ", "+ this.posicion.getPosY() + ")");
		System.out.println("");
	}
}
