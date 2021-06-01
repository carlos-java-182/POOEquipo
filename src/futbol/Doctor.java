package futbol;

public class Doctor extends Persona {

	String titulacion;
	int experiencia;

	public Doctor(String nombre, String apellido, int edad, String titulacion, int experiencia) {
		
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.experiencia = experiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getExperiencia() {
		return experiencia;
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Da asistencia en un partido de futbol");
	}
	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en un entrenamiento");
	}
	
	public void curarLesion() {
		System.out.println("Curar la lesión");
	}
	

}
