package retos;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conversion = -1;
		boolean mal=false;
		do {
			mal = false;
			System.out.println("Selecciona el tipo de conversion:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");

			try {
				String s = sc.nextLine();
				conversion = Integer.parseInt(s);
				if (conversion < 0 || conversion > 4) {
					mal = true;
					System.out.println("Entre 0 y 4");
				}
			} catch (Exception e) {
				System.out.println("Formato inválido");
				mal = true;
			}
		} while (conversion != 0);
		
		sc.close();
	}

}
