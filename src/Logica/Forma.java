package Logica;

public class Forma {

	private String color = "";
	private String nombreForma = "";
	
	public Posicion posicion = null;
	
	public double area = 0;
	public double perimetro = 0;
	
	public Forma(String color, String nombreForma, Posicion pos) {
		
		this.color = color;
		this.nombreForma = nombreForma;
		this.posicion = pos;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public String getColor() {
		
		return this.nombreForma;
	}
	
	public String getNombreForma() {
		
		return this.nombreForma;
	}
	
	public void calcArea() {
		
		this.area = 0;
	}

	public void calcPerimetro() {
		
		this.perimetro = 0;
	}

	public void cambiarEscala(double escala) {
		
		System.out.println("Escala 1 a 1");
	}
	
	public void mostrarInfo() {
		
		System.out.println("No hay info de la Forma");
	}
}
