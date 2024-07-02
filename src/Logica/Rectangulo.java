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
	public double calcArea() {
		
		return this.area = this.ladoMayor * this.ladoMenor;
	}

	@Override
	public double calcPerimetro() {
		
		return this.perimetro = 2 * (this.ladoMayor + this.ladoMenor);
	}
}
