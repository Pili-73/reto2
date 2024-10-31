package retos;

import java.util.Scanner;

public class Funciones1 {

	public static double millas_Kilometros(double kilometros) {
		return kilometros *= 0.62137;
	}

	public static double kilometros_Millas(double millas) {
		return millas /= 0.62137;
	}

	public static void Longitud(double millas, double kilometros) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona la longitud de conversion:\n 1. millas a kilometros\n 2. kilometros a millas\n 0. Salir ",
					sc);
			if (opcion == 1) {
				kilometros = Funciones.dimeDouble("introduce las  millas que quieres convertir", sc);

			} else if (opcion == 2) {
				millas = Funciones.dimeDouble("introduce los kilometros que quieres convertir", sc);
			} else if (opcion == 0) {
				System.out.println("has salido fuera");
			}
		} while (opcion != 0);
	}

	public static void Peso(double kilometros) {

	}
}