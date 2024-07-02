package Logica;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Forma[] arrayFormas = new Forma[4];
		
		String color = "";
		String nombreFigura = "";

		double ladoMayor = 0;
		double ladoMenor = 0;

		Posicion posFig = null;
		
		posFig = crearPosicion();
		System.out.print("Ingresar color de la figura: ");
		color = scan.next();
		System.out.print("Ingresar nombre de la figura: ");
		nombreFigura = scan.next();
		System.out.print("Ingresar lado mayor: ");
		ladoMayor = scan.nextDouble();
		System.out.print("Ingresar lado menor: ");
		ladoMenor = scan.nextDouble();
		
		Forma rectangulo1 = new Rectangulo(color, nombreFigura, posFig, ladoMayor, ladoMenor);
		Forma cuadrado1 = new Cuadrado(color, nombreFigura, posFig, ladoMayor);
		Forma elipse1 = new Elipse(color, nombreFigura, posFig, ladoMayor, ladoMenor);
		Forma circulo1 = new Circulo(color, nombreFigura, posFig, ladoMayor);
		
		arrayFormas[0] = rectangulo1;
		arrayFormas[1] = cuadrado1;
		arrayFormas[2] = elipse1;
		arrayFormas[3] = circulo1;
		
		System.out.println("Area del rectangulo: " + arrayFormas[0].calcArea());
		System.out.println("Perimetro del rectangulo: " + arrayFormas[0].calcPerimetro());
		System.out.println("Area del cuadrado: " + arrayFormas[1].calcArea());
		System.out.println("Perimetro del cuadrado: " + arrayFormas[1].calcPerimetro());
		System.out.println("Area del elipse: " + arrayFormas[2].calcArea());
		System.out.println("Perimetro del elipse: " + arrayFormas[2].calcPerimetro());
		System.out.println("Area del circulo: " + arrayFormas[3].calcArea());
		System.out.println("Perimetro del circulo: " + arrayFormas[3].calcPerimetro());
	}
	
	public static Posicion crearPosicion() {
		
		double posicionX = 0;
		double posicionY = 0;
		
		System.out.print("Ingresa la posicion X de la figura: ");
		posicionX = scan.nextDouble();
		System.out.print("Ingresa la posicion Y de la figura: ");
		posicionY = scan.nextDouble();

		return new Posicion(posicionX, posicionY);
	}

}
