//Diametro, Circuferencia  e  área

import java.util.Scanner;

public class Circulo {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int r;
		
		System.out.print("Forneça um valor inteiro para o raio do círculo:");
		r = input.nextInt();
		
		System.out.printf("O diamentro do ciculo é %d", (2 * r));
		System.out.println("");
		System.out.printf("A circuferencia é %f", (2* 3.14159)*r);
		System.out.println("");
		System.out.printf("A área é %f", (3.14159 * r * r));
		
	}
}