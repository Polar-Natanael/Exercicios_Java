//Esse aplicativo vai receber três inteiros em seguida vai compara-los depois os somar,obeter seu produto, fazer a media aritímetica dos trez valores.

import java.util.Scanner;

public class AritimeticaMenorMaior
{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int number1, number2, number3;
	int soma,produto, media;
	int menor = 0, maior = 0;
	
	System.out.println("OLÁ. PARA DARMOS INICIO FORNEÇA 3 VALORES ");
	System.out.println("");
	
	System.out.print("Primeiro valor: ");
	number1 = input.nextInt();
	
	System.out.print("Segundo valor: ");
	number2 = input.nextInt();
	
	System.out.print("Terceiro valor: ");
	number3 = input.nextInt();
	
	//Não vou ultilizar o if not, nem o break
		menor = number1;
		if(number2 < menor) menor = number2;
		if(number3 < menor) menor = number3;
		
		maior = number1;
		if(number2 > maior)  maior = number2;
		if(number3 > maior)  maior = number3;
		
		System.out.println("");
		System.out.printf("O menor valor digitado foi: %d ", menor);
		System.out.println("");
		System.out.printf("O maior valor digitado foi: %d ", maior);
		System.out.println("");
		System.out.println("");
		
	// Aritimetica(A media vai aprensentar apenas o valor inteiro nesse primeiro momento)
		soma = number1 + number2 + number3;
		produto = number1 * number3 * number3;
		media = soma/3;
		
		System.out.printf("A soma dos valores é: %d%n", soma);
		System.out.printf("O produto dos valores é: %d%n", produto);
		System.out.printf("A media dos valores é: %d%n ", media);
		
	}
}