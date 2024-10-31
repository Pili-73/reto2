package retos;

import java.util.Scanner;

public class Funciones1 {

	public static double millas_Kilometros(double kilometros) {
		return kilometros *= 0.62137;
	}

	public static double kilometros_Millas(double millas) {
		return millas /= 0.62137;
	}

	public static void Longitud() {
		Scanner sc = new Scanner(System.in);
		double millas, kilometros;
		int opcion = -1;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona la longitud de conversion:\n 1. millas a kilometros\n 2. kilometros a millas\n 0. Salir ",
					sc);
			if (opcion == 1) {
				millas = Funciones.dimeDouble("introduce las  millas que quieres convertir", sc);
				kilometros=Funciones1.millas_Kilometros(millas);
				System.out.println(millas + "millas  son : " + kilometros + "Km");
			} else if (opcion == 2) {
				kilometros = Funciones.dimeDouble("introduce los kilometros que quieres convertir", sc);
				millas=Funciones1.kilometros_Millas(kilometros);
				System.out.println(millas + "millas  son : " + kilometros + "Km");
			} else if (opcion == 0) {
				System.out.println("has salido fuera");
			}
		} while (opcion != 0);
	}
public static double Kilogramos_libras(double libras ) {
	return libras *=2.2046;
}
public static double libras_Kilogramos(double kilogramos) {
	return kilogramos/=2.2046;
}
	
	public static void Peso() {
		Scanner sc = new Scanner(System.in);
		double kilogramos, libras;
		int opcion = -1;
		do {
			opcion = Funciones.dimeEntero(
					"Selecciona la longitud de conversion:\n 1. kilogramos a libras\n 2. libras a kilogramos\n 0. Salir ",
					sc);
			if (opcion == 1) {
				kilogramos = Funciones.dimeDouble("introduce los kilogramos que quieres convertir", sc);
				libras=Funciones1.millas_Kilometros(kilogramos);
				System.out.println(kilogramos + "kg  son : " + libras + "lb");
			} else if (opcion == 2) {
				libras = Funciones.dimeDouble("introduce los kilometros que quieres convertir", sc);
				kilogramos=Funciones1.kilometros_Millas(libras);
				System.out.println(libras + "lb  son : " + kilogramos + "Kg");
			} else if (opcion == 0) {
				System.out.println("has salido fuera");
			}
		} while (opcion != 0);
	}
}