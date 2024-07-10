package Logica;

public abstract class Forma {

	private String color = "";
	private String nombreForma = "";
	
	private Posicion posicion = null;
	
	private double area = 0;
	private double perimetro = 0;
	
	public Forma(String color, String nombreForma, Posicion pos) {
		
		this.color = color;
		this.nombreForma = nombreForma;
		this.posicion = pos;
	}

	public abstract void calcArea();

	public abstract void calcPerimetro();

	public abstract void cambiarEscala(double escala);
	
	public abstract void mostrarInfo();

	public Posicion getPosicion() {
		
		return this.posicion;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public String getColor() {
		
		return this.color;
	}
	
	public String getNombreForma() {
		
		return this.nombreForma;
	}
	
	public double getArea() {
		
		return this.area;
	}
	
	public void setArea(double area) {
		
		this.area = area;
	}
	
	public double getPerimetro() {
		
		return this.perimetro;
	}

	public void setPerimetro(double perimetro) {
		
		this.perimetro = perimetro;
	}

	
	public void moverForma(double nuevaPosX, double nuevaPosY) {
		
		this.posicion.setPosX(nuevaPosX);
		this.posicion.setPosY(nuevaPosY);
	}
}
