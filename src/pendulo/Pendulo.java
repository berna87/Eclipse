package pendulo;

public class Pendulo {
	private static final double PI = 3.14;
	private double longitud; //metros
	private static final double GRAVEDAD = 9.8;

	public Pendulo(double longitud) {
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double calcularPeriodo(){
		return (2*PI)*Math.sqrt(longitud/GRAVEDAD);
	}

	@Override
	public String toString() {
		return "Pendulo [longitud=" + longitud + " metros]";
	}
	
}
