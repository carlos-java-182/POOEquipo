package futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner entrada = new Scanner(System.in);

	static Persona futbolista1 = new Futbolista("Gonzalo", "Higuain", 29, 9, "Delantero");
	static Persona futbolista2 = new Futbolista("Paulo", "Dybala", 23, 21, "Delantero");

	static Persona entrenador = new Entrenador("Massimiliano", "Allegri", 49, "Defensiva");
	static Persona doctor = new Doctor("Alex", "Marroni", 55, "Lic en fisioterapia", 20);

	public static void main(String[] args) {

		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(doctor);
		
		menu();

	}

	public static void menu() {

		int opcion;
		do {

			System.out.println("\t.: MENU:.");
			System.out.println("1.- Viaje de equipo");
			System.out.println("2.- Entrenamiento");
			System.out.println("3.- Partido de futbol");
			System.out.println("4.- Planificar entrenamiento");
			System.out.println("5.- Entrevista");
			System.out.println("6.- Curar lesión");
			System.out.println("7.- Salir");
			System.out.println("Digita la opción");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1: // Viaje de equipo
				System.out.println(" ");
				viajarEquipo();
				break;
			case 2: // Entrenamiento
				System.out.println(" ");
				entrenarEquipo();
				break;
			case 3: // Partido de futbol
				System.out.println(" ");
				partidoFutbol();
				break;
			case 4: // Planificar entrenamiento
				System.out.println(" ");
				planificarEntrenamiento();
				break;
			case 5: // Entrevista
				System.out.println(" ");
				darEntrevista();
				break;
			case 6: // Curar lesión
				System.out.println(" ");
				curarLesion();
				break;
			case 7: // Salir
				System.out.println("Haz salido del sistema ");
				break;
			default:
				System.out.print("Error, digita una opción válida");
			}

		} while (opcion != 7);
	}

	public static void viajarEquipo() {
		for (Persona equipo : persona) {

			System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " ->");
			equipo.viajar();

		}
	}

	public static void entrenarEquipo() {

		for (Persona equipo : persona) {

			System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " ->");
			equipo.entrenamiento();

		}

	}

	public static void partidoFutbol() {

		for (Persona equipo : persona) {

			System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " ->");
			equipo.partidoFutbol();

		}

	}

	public static void planificarEntrenamiento() {
		System.out.print(entrenador.getNombre() + " " + entrenador.getApellido() + " ->");
		((Entrenador) entrenador).planificarEntrenamiento();
	}

	public static void darEntrevista() {

		System.out.print(futbolista1.getNombre() + " " + futbolista1.getApellido() + " ->");
		((Futbolista) futbolista1).entrevista();

		System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellido() + " ->");
		((Futbolista) futbolista2).entrevista();

	}

	public static void curarLesion() {

		System.out.print(doctor.getNombre() + " " + doctor.getApellido()+" ->");
		((Doctor) doctor).curarLesion();
	}

}
