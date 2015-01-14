package pendulo;

import java.util.Scanner;

public class TestPendulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendulo pen=new Pendulo(1.5);
		System.out.printf("%s tiene un periodo de %.2f segundos %n",pen,pen.calcularPeriodo());
		double long2 = Double.parseDouble(args[0]);
		pen.setLongitud(long2);
		System.out.println("Longitud pasada por argumentos:");
		System.out.printf("%s tiene un periodo de %.2f segundos %n",pen,pen.calcularPeriodo());
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud 'metros' ");
		pen.setLongitud(sc.nextDouble());
		System.out.println("Longitud pasada por scanner:");
		System.out.printf("%s tiene un periodo de %.2f segundos %n",pen,pen.calcularPeriodo());
		sc.close();
		
	}

}
