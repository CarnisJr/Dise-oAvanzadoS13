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
	public double calcArea() {
		
		return this.area = this.lado * this.lado;
	}

	@Override
	public double calcPerimetro() {
		
		return this.perimetro = 4 * this.lado;
	}
}
