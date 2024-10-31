package retos;

public class Funcionesextra {

	public static void saludaNombreEdad (String nombre, String apellido, int edad) {
		System.out.println("Buenos dias, " + nombre + " " + apellido + ", tienes " + edad + " años");
	}
	
	public static String notaAsignatura (double num) {
		if (num < 5) {
			return "Insuficiente";
		}
		else if (num < 6) {
			return "Suficiente";
		}
		else if (num < 7) {
			return "Bien";
		}
		else if (num < 9) {
			return "Notable";
		}
		else {
			return "Sobresaliente";
		}
	}
	
	public static String diaSemana (int num) {
		switch (num) {
		case 1:
			return "lunes";
		case 2:
			return "martes";
		case 3:
			return "miércoles";
		case 4:
			return "jueves";
		case 5:
			return "viernes";
		case 6:
			return "sábado";
		case 7:
			return "domingo";
		default:
			return "no es válido";
		}
	}
	
	public static boolean par (int num) {
		if (num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void divisores (int num) {
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i);
					if (i != num) {
						System.out.print(", ");
					}
				}
			}
		}
		System.out.println();
	}
	
	
	public static int contarDivisores (int num) {
		int contDiv = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contDiv++;
			}
		}
		return contDiv;
	}
	
	public static boolean divisible (int dividendo, int divisor) {
		if (dividendo % divisor == 0) {
			return true;
		}
		else
			return false;
	}
	
	public static boolean esPrimo (int num) {
		if (contarDivisores(num) == 2) {
			return true;
		}
		else
			return false;
	}
}



