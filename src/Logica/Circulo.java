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
	public void calcArea() {
		
		this.setArea(this.PI * this.radio * this.radio);
	}

	@Override
	public void calcPerimetro() {
		
		this.setPerimetro(2 * PI * this.radio);
	}
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("Color: " + this.getColor());
		System.out.println("Radio: " + this.radio);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimetro());
		System.out.println("Posicion: (" + this.getPosicion().getPosX() + ", "+ this.getPosicion().getPosY() + ")");
		System.out.println("");
	}
}
