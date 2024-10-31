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
				fahrenheit = celsius * 9 / 5 + 32;
				System.out.println(celsius + "º celsius son " + fahrenheit + " ºF");
			} else if (opcion == 2) {
				fahrenheit = Funciones.dimeDouble("Escribe los grados farhenheit", sc);
				celsius = (fahrenheit - 32) * 5 / 9;
			}

		} while (opcion != 0);
	}
}
