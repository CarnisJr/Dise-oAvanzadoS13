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
		
		this.area = this.ladoMayor * this.ladoMenor;
	}

	@Override
	public void calcPerimetro() {
		
		this.perimetro = 2 * (this.ladoMayor + this.ladoMenor);
	}
	
	@Override
	public void mostrarInfo() {
		
		System.out.println("Lado mayor: " + this.ladoMayor);
		System.out.println("Lado menor: " + this.ladoMenor);
		System.out.println("Area: " + this.area);
		System.out.println("Perimetro: " + this.perimetro);
		System.out.println("Posicion: (" + this.posicion.getPosX() + ", "+ this.posicion.getPosY() + ")");
		System.out.println("");
	}
}
