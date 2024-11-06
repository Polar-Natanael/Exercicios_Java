//Instrução if

import java.util.Scanner;

public class InstrucaoSe
{
	public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 
	 int number1;
	 int number2;
	 
	 System.out.println("Forneça dois valores para que possamos comparalos");
	 
	 System.out.print("Primeiro valor: ");
	 number1 = input.nextInt();
	 System.out.print("Segundo valor: ");
	 number2 = input.nextInt();
	 
	 if(number1 == number2)//igual
		System.out.printf("%d%s%d%n", number1, " = ", number2);
	
	 if(number1 != number2)// diferente
		System.out.printf("%d%s%d%n", number1, " != ", number2);
	 
	 if(number1 > number2)//maior que
		System.out.printf("%d%s%d%n", number1, " > ", number2);
	 
	 if(number1 < number2)//Menor que
		System.out.printf("%d%s%d%n", number1, " < ", number2);
	 
	 if(number1 <= number2)// menor ou igual
		System.out.printf("%n%s%n%d%s%d%n", "Nesse caso estamos analizando se for menor ou igual.", number1, "<=", number2);
	
	 if(number1 >= number2)// maior ou igual
		System.out.printf("%n%s%n%d%s%d%n", "Nesse caso estamos analizando se for maior ou igual.", number1, ">=", number2);
	 
	}
}