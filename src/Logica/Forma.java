package Logica;

public class Forma {

	private String color = "";
	private String nombreForma = "";
	
	private Posicion posicion = null;
	
	public double area = 0;
	public double perimetro = 0;
	
	public Forma(String color, String nombreForma, Posicion pos) {
		
		this.color = color;
		this.nombreForma = nombreForma;
		this.posicion = pos;
	}
	
	public double calcArea() {
		
		return this.area;
	}

	public double calcPerimetro() {
		
		return this.perimetro;
	}

	public void cambiarEscala(double escala) {
		
		System.out.println("Escala 1 a 1");
	}
}
