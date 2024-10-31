package retos;

import java.util.Scanner;

public class Funciones2 {

	public static void Temperatura() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		Double celsius, fahrenheit;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona la conversión de temperatura \n1.Celsius a Farhenheit \n2.Farhenheit a Celsius \n0.Salir",
					sc);
			if (opcion == 1) {
				celsius = Funciones.dimeDouble("Escribe los grados celsius", sc);
				fahrenheit = Funciones.celsiusFahrenheit(celsius);
				System.out.println(celsius + "º celsius son " + fahrenheit + "ºF");
			} else if (opcion == 2) {
				fahrenheit = Funciones.dimeDouble("Escribe los grados farhenheit", sc);
				celsius = Funciones.fahrenheitCelsius(fahrenheit);
				System.out.println(fahrenheit + "ºF son " + celsius + "º celsius");
			}

		} while (opcion != 0);
	}
	
	public static void Volumen() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		Double litros, galones;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona la conversión de volumen \n1.Litros a Galones \n2.Galones a Litros \n0.Salir",
					sc);
			if (opcion == 1) {
				litros = Funciones.dimeDouble("Escribe los litros", sc);
				galones = Funciones.litrosGalones(litros);
				System.out.println(litros + " litros son " + galones + " galones");
			} else if (opcion == 2) {
				galones = Funciones.dimeDouble("Escribe los galones", sc);
				litros = Funciones.galonesLitros(galones);
				System.out.println(galones + " galones son " + litros + " litros" );
			}

		} while (opcion != 0);
	}
}
