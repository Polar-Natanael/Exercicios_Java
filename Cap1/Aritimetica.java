//Programa onde são adicionados dois valores inteiros e então exibe sua soma, produto, diferença, Quociente e resto/módulo.

import java.util.Scanner;// Classe Scanner

public class Aritimetica
{
	public static void main(String[] args){
	
	//Cria uma Scanner(obtém a entrada a partir da janela de comando)
	Scanner input = new Scanner(System.in);
	
	int number1;// valor 1
	int number2;// valor 2
	int sum;// soma dos valores
	int dif,
		mul;
	int div = 0;
	int mod = 0;
	
	System.out.println("Forneça dois valores inteiros para fazemos as operações.");
	
	System.out.print("Primeiro Valor: ");
	number1 = input.nextInt();//Lê o primeiro valor;
	System.out.print("Segundo Valor: ");
	number2 = input.nextInt();//Lê o segundo valor;
	
	sum = number1 + number2;// Soma 
	dif = number1 - number2;// Difereça
	mul = number1 * number2;// multiplicação
	
	System.out.printf("%nA soma de %d e %d é igual a: %d", number1, number2, sum);
	System.out.printf("%nA diferença de %d e %d é igual a: %d", number1, number2, dif);
	System.out.printf("%nO produto de %d e %d é igual a: %d", number1, number2, mul);

	
	if(number2!= 0)
	{
		div = number1 / number2;// Divisão
		mod = number1 % number2;// resto/módulo
		System.out.printf("%n%s%d%s%d%s%d", "O quociente de ", number1," e ", number2, " é igual a: ", div );
		System.out.printf("%n%s%d%s%d%s%d", "O resto/módulo de ", number1," e ", number2, " é igual a: ", mod );
	}
	if(number2 == 0)
		System.out.println("\n\nNão se pode fazer divisão por 0");
	
	}
}