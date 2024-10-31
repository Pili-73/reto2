package retos;

import java.util.Scanner;

public class Funciones2 {

	public static void Temperatura() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		Double celsius, fahrenheit;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona la temperatura de conversión: \n 1. Celsius a Farhenheit \n 2. Farhenheit a Celsius \n 0. Salir",
					sc);
			if (opcion == 1) {
				celsius = Funciones.dimeDouble("Introduce los grados celsius que quieres convertir", sc);
				fahrenheit = Funciones.celsiusFahrenheit(celsius);
				System.out.println(celsius + "º celsius son: " + fahrenheit + "ºF");
			} else if (opcion == 2) {
				fahrenheit = Funciones.dimeDouble("Introduce los grados fahrenheit que quieres convertir", sc);
				celsius = Funciones.fahrenheitCelsius(fahrenheit);
				System.out.println(fahrenheit + "ºF son: " + celsius + "º celsius");
			} else if (opcion == 0) {
				System.out.println("Has salido fuera");
			}
			
		} while (opcion != 0);
	}
	
	public static void Volumen() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		Double litros, galones;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona el volumen de conversión: \n 1. Litros a Galones \n 2. Galones a Litros \n 0. Salir",
					sc);
			if (opcion == 1) {
				litros = Funciones.dimeDouble("Introduce los litros que quieres convertir", sc);
				galones = Funciones.litrosGalones(litros);
				System.out.println(litros + " litros son: " + galones + " galones");
			} else if (opcion == 2) {
				galones = Funciones.dimeDouble("Introduce los galones que quieres convertir", sc);
				litros = Funciones.galonesLitros(galones);
				System.out.println(galones + " galones son: " + litros + " litros" );
			} else if (opcion == 0) {
				System.out.println("Has salido fuera");
			}

		} while (opcion != 0);
	}
}
