//Programa onde são adicionados dois valores inteiros e então exibe sua soma.

import java.util.Scanner;// Classe Scanner

public class AdicaoDeNumeros
{
	public static void main(String[] args){
	
	//Cria uma Scanner(obetem a entrada a parti da janela de comando)
	Scanner input = new Scanner(System.in);
	
	int number1;// valor 1
	int number2;// valor 2
	int sum;// soma dos valores
	
	System.out.println("Forneça dois valores inteiros para fazemos sua soma.");
	
	System.out.print("Primeiro Valor: ");
	number1 = input.nextInt();//Lê o primeiro valor;
	System.out.print("Segundo Valor: ");
	number2 = input.nextInt();//Lê o segundo valor;
	
	sum = number1 + number2;// depois que temos o valor podemos fazer a soma e salvar na variavel.
		
	System.out.printf("%s%d%s%d%s%d", "A soma de ", number1," e ", number2, " é igual a: ", sum );

	
	}

}