package Logica;

public class Posicion {
	
	private double posX = 0;
	private double posY = 0;

	public Posicion(double posX, double posY) {
		
		this.posX = posX;
		this.posY = posY;
	}
	
	public void setPosX(double posX) {
		
		this.posX = posX;
	}

	public void setPosY(double posY) {
		
		this.posY = posY;
	}

	public double getPosX() {
		
		return this.posX;
	}

	public double getPosY() {
		
		return this.posY;
	}
}
