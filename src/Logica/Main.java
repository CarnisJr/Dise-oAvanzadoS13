package Logica;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Forma[] arrayFormas = new Forma[4];
		
		arrayFormas = agregarFormasArray();
		asignarColor(arrayFormas);
	}
	
	public static Forma crearFormas() {
		
		int selector = 0;
		
		Posicion pos = null;

		String color = "";
		String nombreFigura = "";
		double ladoMayor = 0;
		double ladoMenor = 0;
		
		double radioMayor = 0;
		double radioMenor = 0;
		
		double lado = 0;
		double radio = 0;

		System.out.println("1. Rectangulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Elipse");
		System.out.println("4. Circulo");
		
		selector = scan.nextInt();

		switch(selector) {
		
		case 1:
			
			pos = crearPosicion();
			nombreFigura = "Rectangulo";
			System.out.println("Ingrese el color: ");
			color = scan.next();
			System.out.println("Ingrese el lado mayor: ");
			ladoMayor = scan.nextDouble();
			System.out.println("Ingrese el lado menor: ");
			ladoMenor = scan.nextDouble();
			return new Rectangulo(color, nombreFigura, pos, ladoMayor, ladoMenor);
		case 2:

			pos = crearPosicion();
			nombreFigura = "Cuadrado";
			System.out.println("Ingrese el color: ");
			color = scan.next();
			System.out.println("Ingrese el lado: ");
			lado = scan.nextDouble();
			return new Cuadrado(color, nombreFigura, pos, lado);
		case 3:

			pos = crearPosicion();
			nombreFigura = "Elipse";
			System.out.println("Ingrese el color: ");
			color = scan.next();
			System.out.println("Ingrese el radio mayor: ");
			radioMayor = scan.nextDouble();
			System.out.println("Ingrese el radio menor: ");
			radioMenor = scan.nextDouble();
			return new Elipse(color, nombreFigura, pos, radioMayor, radioMenor);
		case 4:

			pos = crearPosicion();
			nombreFigura = "Circulo";
			System.out.println("Ingrese el color: ");
			color = scan.next();
			System.out.println("Ingrese el radio: ");
			radio = scan.nextDouble();
			return new Circulo(color, nombreFigura, pos, radio);
		default:
			
			return null;
		}
	}
	
	public static void asignarColor(Forma[] arrayFormas) {
		
		String nuevoColor = "";

		System.out.println("Ingresa el color nuevo: ");
		nuevoColor = scan.next();

		for(int i = 0; i < arrayFormas.length; i++) {
			
			arrayFormas[i].setColor(nuevoColor);
			System.out.println(arrayFormas[i].getNombreForma() + " en la posicion " + i);
			arrayFormas[i].calcArea();
			arrayFormas[i].calcPerimetro();
			arrayFormas[i].mostrarInfo();
		}
	}
	
	public static Forma[] agregarFormasArray() {
		
		Forma[] arrayFormas = new Forma[4];
		
		for(int i = 0; i < arrayFormas.length; i++) {
			
			arrayFormas[i] = crearFormas();
		}
		
		return arrayFormas;
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
