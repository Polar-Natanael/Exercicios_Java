// Par ou ímpar

import java.util.Scanner;

public class ImparPar
{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int number;
	
	System.out.print("Digite uma valor e vamos descobrir se é impar ou par: ");
	number = input.nextInt();
	
	if((number%2)== 0)
		System.out.printf("%n O numero %d é: par", number);
		
	if((number%2)!= 0)
		System.out.printf("%n O numero %d é: impar", number);
	
	}
}