package Logica;

public class Circulo extends Elipse{

	private double radio;
	
	public Circulo(String color, String nombreFigura, Posicion pos, double radio) {
		
		super(color, nombreFigura, pos, radio, radio);
		this.radio = radio;
	}

	@Override
	public void cambiarEscala(double escala) {
		
		this.radio *= escala;
	}

	@Override
	public double calcArea() {
		
		return this.area = this.PI * this.radio * this.radio;
	}

	@Override
	public double calcPerimetro() {
		
		return this.area = 2 * PI * this.radio;
	}
}
