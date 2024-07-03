package Logica;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Forma[] arrayFormas = new Forma[4];
		
		arrayFormas = agregarFormasArray();
		asignarColor(arrayFormas);
		System.out.println("Esta es la figura con mayor area: ");
		encontrarAreaMayor(arrayFormas);
		escalarForma(arrayFormas);
		trasladarForma(arrayFormas);
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

		System.out.println(".:Ingresa la figura que quieres crear");
		System.out.println("1. Rectangulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Elipse");
		System.out.println("4. Circulo");
		
		selector = scan.nextInt();

		switch(selector) {
		
		case 1:
			
			pos = crearPosicion();
			nombreFigura = "Rectangulo";
			System.out.print("Ingrese el color: ");
			color = scan.next();
			System.out.print("Ingrese el lado mayor: ");
			ladoMayor = scan.nextDouble();
			System.out.print("Ingrese el lado menor: ");
			ladoMenor = scan.nextDouble();
			return new Rectangulo(color, nombreFigura, pos, ladoMayor, ladoMenor);
		case 2:

			pos = crearPosicion();
			nombreFigura = "Cuadrado";
			System.out.print("Ingrese el color: ");
			color = scan.next();
			System.out.print("Ingrese el lado: ");
			lado = scan.nextDouble();
			return new Cuadrado(color, nombreFigura, pos, lado);
		case 3:

			pos = crearPosicion();
			nombreFigura = "Elipse";
			System.out.print("Ingrese el color: ");
			color = scan.next();
			System.out.print("Ingrese el radio mayor: ");
			radioMayor = scan.nextDouble();
			System.out.print("Ingrese el radio menor: ");
			radioMenor = scan.nextDouble();
			return new Elipse(color, nombreFigura, pos, radioMayor, radioMenor);
		case 4:

			pos = crearPosicion();
			nombreFigura = "Circulo";
			System.out.print("Ingrese el color: ");
			color = scan.next();
			System.out.print("Ingrese el radio: ");
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

		System.out.println("-------------------------------------------------");
		for(int i = 0; i < arrayFormas.length; i++) {
			
			arrayFormas[i].setColor(nuevoColor);
			System.out.println(arrayFormas[i].getNombreForma() + " en la posicion " + i);
			arrayFormas[i].calcArea();
			arrayFormas[i].calcPerimetro();
			arrayFormas[i].mostrarInfo();
		}
		System.out.println("-------------------------------------------------");
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

	public static void encontrarAreaMayor(Forma[] arrayFormas) {
		
		double mayorArea = 0;
		
		for(int i = 0; i < arrayFormas.length - 1; i++) {
			
			mayorArea = arrayFormas[i].getArea();
			if(mayorArea < arrayFormas[i + 1].getArea()) {
				
				mayorArea = arrayFormas[i + 1].getArea();
			}
		}
		
		for(int i = 0; i < arrayFormas.length; i++) {
			
			if(mayorArea == arrayFormas[i].getArea()) {
				
				arrayFormas[i].getNombreForma();
				arrayFormas[i].mostrarInfo();
				break;
			}
		}
		System.out.println("-------------------------------------------------");
	}
	
	public static void escalarForma(Forma[] arrayFormas) {
		
		int indiceForma = 0;
		double escalaNueva = 0;
		
		System.out.print("Ingresa el indice de la figura que quiere escalar: ");
		indiceForma = scan.nextInt();
		System.out.print("Ingresa el nuevo escalado: ");
		escalaNueva = scan.nextDouble();
		
		for(int i = 0; i < arrayFormas.length; i++) {
			
			if(indiceForma == i) {
				
				arrayFormas[i].cambiarEscala(escalaNueva);
				arrayFormas[i].calcArea();
				arrayFormas[i].calcPerimetro();
				break;
			}
		}

		imprimirInfo(arrayFormas);
	}
	
	public static void trasladarForma(Forma[] arrayFormas) {
		
		int indiceForma = 0;
		double posX = 0;
		double posY = 0;
		
		System.out.print("Ingresa el indice de la figura que quiere trasladar: ");
		indiceForma = scan.nextInt();
		System.out.print("Nueva posicion en x: ");
		posX = scan.nextDouble();
		System.out.print("Nueva posicion en y: ");
		posY = scan.nextDouble();
		
		for(int i = 0; i < arrayFormas.length; i++) {
			
			if(indiceForma == i) {
				
				arrayFormas[i].moverForma(posX, posY);
				break;
			}
		}
		
		imprimirInfo(arrayFormas);
	}
	
	public static void imprimirInfo(Forma[] arrayFormas) {
		
		
		System.out.println("-------------------------------------------------");
		for(int i = 0; i < arrayFormas.length; i++) {
			
			arrayFormas[i].mostrarInfo();;
		}
		System.out.println("-------------------------------------------------");
	}
}
