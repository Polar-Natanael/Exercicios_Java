//O valor inteiro de uma caractere
/**Cada caractere tem uma representação correspondente de inteiro. O conjunto de caracteres que um computador utiliza com as respectivas representações na forma de inteiro desses caracteres é chamado de conjunto de caracteres desse computador. Você pode indicar um valor de caractere em um programa simplesmente incluindo esse caractere entre aspas simples, como em ‘A'.**/

import java.util.Scanner;

public class IntCaractere
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
			
		System.out.printf("O caractere %c Tem valor igual a %d%n", 'A', ((int) 'A'));
	}
}