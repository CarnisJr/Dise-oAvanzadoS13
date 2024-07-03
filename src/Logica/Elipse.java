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
	public void calcArea() {
		
		this.setArea(this.PI * this.radioMayor * this.radioMenor);
	}

	@Override //2PIsqrt((r^2+R^2)/2)
	public void calcPerimetro() {
		
		this.setPerimetro(2 * PI * Math.sqrt((((radioMayor * radioMayor) + (radioMenor * radioMenor)) / 2)));
	}

	@Override
	public void mostrarInfo() {
		
		System.out.println("Figura: " + this.getNombreForma());
		System.out.println("Color: " + this.getColor());
		System.out.println("Radio mayor: " + this.radioMayor);
		System.out.println("Radio menor: " + this.radioMenor);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimetro: " + this.getPerimetro());
		System.out.println("Posicion: (" + this.getPosicion().getPosX() + ", "+ this.getPosicion().getPosY() + ")");
		System.out.println("");
	}
}
