package doc;
/**
 * 
 * @author Bernabe Fernandez
 * @version 1.0
 */
public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
/**
 * 	
 * @param nombre nombre del alumno
 * @param apellidos apellidos del alumno
 * @param edad edad del alumno
 */
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	/**
	 * 	
	 * @return el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre para modificar el nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return apellidos del alumno
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * 
	 * @param apellidos para modificar apellidos del alumno
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * 
	 * @return edad que tiene el alumno
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad para modificar la edad del alumno
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + "]";
	}
}
