package Logica;

public class Elipse extends Forma{

	private double radioMayor = 0;
	private double radioMenor = 0;
	public final double PI = 3.14159;
	
	public Elipse(String color, String nombreFigura, Posicion pos, double radioMayor, double radioMenor) {
		
		super(color, nombreFigura, pos);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public void cambiarEscala(double escala) {
		
		this.radioMayor *= escala;
		this.radioMenor *= escala;
	}

	@Override
	public double calcArea() {
		
		return this.area = this.PI * this.radioMayor * this.radioMenor;
	}

	@Override //2PIsqrt((r^2+R^2)/2)
	public double calcPerimetro() {
		
		return this.area = 2 * PI * radioMayor;
	}
}
