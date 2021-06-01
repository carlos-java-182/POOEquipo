package futbol;

public class Entrenador extends Persona {

	String estrategia;

	public Entrenador(String nombre, String apellido, int edad, String estrategia) {

		super(nombre, apellido, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un partido de futbol");
	}

	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planificar entrenamiento");
	}
}
