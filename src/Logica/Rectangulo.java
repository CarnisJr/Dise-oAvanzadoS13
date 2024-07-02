package Logica;

public class Rectangulo extends Forma{
	
	private double ladoMayor = 0;
	private double ladoMenor = 0;
	
	public Rectangulo(String color, String nombreFigura, Posicion pos, double ladoMayor, double ladoMenor) {
		
		super(color, nombreFigura, pos);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	
	@Override
	public void cambiarEscala(double escala) {
		
		this.ladoMayor *= escala;
		this.ladoMenor *= escala;
	}

	@Override
	public void calcArea() {
		
		this.setArea(this.ladoMayor * this.ladoMenor);
	}

	@Override
	public void calcPerimetro() {
		
		this.setPerimetro(2 * (this.ladoMayor + this.ladoMenor));
	}
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("Color: " + this.getColor());
		System.out.println("Lado mayor: " + this.ladoMayor);
		System.out.println("Lado menor: " + this.ladoMenor);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimetro());
		System.out.println("Posicion: (" + this.getPosicion().getPosX() + ", "+ this.getPosicion().getPosY() + ")");
		System.out.println("");
	}
}
