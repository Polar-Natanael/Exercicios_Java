//Separando os digitos em um valor inteiro

import java.util.Scanner;

public class SeparandoDig 
{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int dig1, dig2, dig3, dig4, dig5;
		int restante;
		
		System.out.print("Forneça um valor(inteiro) de 5 digitos: ");
		number = input.nextInt();// valor foi guardado.
		
		dig1= number/10000;//Como o valor é um intero dig vai "Selecionar" apenas o valor intero na casa 10*4
		restante = number%10000;//Temos que guardar o restante da divisão na variavel restante 
		
		dig2 = restante/1000;//Agora fazemos a divisão do valor restante pelo valor de uma milhar 10*3 o resutado será um valor inteiro que corresponde ao segundo digito 
		restante = restante%1000;//Novamente precisamos guarda o valor do resto da divisão em uma variavel, podemos ultilizar a variavel restante (novamente)
		
		dig3 = restante/100;//Seguindo a mesma logica devemos dividir o resto por uma centena 10*2 o resutado será um valor inteiro que corresponde ao terceiro digito
		restante = restante % 100;// Guardamos o novo valor em restante
		
		dig4 = restante/10;//Divisão do resto da operação por uma dezena 10*1
		
		dig5 = restante%10;//Aqui está o resto da divisão que é o ultimo digito 
		
		System.out.printf("Temos que esses 5 digitos são %d %d %d %d %d", dig1, dig2, dig3, dig4, dig5);
		
		/*
		Refatorando temos.
		
		dig1 = number/10000;
		dir2 =(number%10000)/1000;
		dir3 =(number%1000)/100;
		dir4 =(number%100)/10;
		dir5 =(number%10);
		*/
		
	}
}