package retos;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conversion = -1;
		do {
			conversion = Funciones.dimeEntero(
					"Selecciona el tipo de conversion: \n1. Longitud \n2. Peso \n3. Temperatura \n4. Volumen \n0. Salir", sc);
			
			if (conversion == 1) {
				Funciones1.Longitud();
			}
			
			if (conversion == 2) {
				Funciones1.Peso();
			}
			
			if (conversion == 3) {
				Funciones2.Temperatura();
			}
			
			if (conversion == 4) {
				Funciones2.Volumen();
			}
			
		} while (conversion != 0);
		
		sc.close();
	}

}
