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
		
		this.area = this.PI * this.radio * this.radio;
	}

	@Override
	public void calcPerimetro() {
		
		this.perimetro = 2 * PI * this.radio;
	}
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("Radio: " + this.radio);
		System.out.println("Area: " + this.area);
		System.out.println("Perimetro: " + this.perimetro);
		System.out.println("Posicion: (" + this.posicion.getPosX() + ", "+ this.posicion.getPosY() + ")");
		System.out.println("");
	}
}
