//Entrada e saída de números de ponto flutuante com Objetos Account 
import java.util.Scanner;

public class AccountValueTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		AccountValue account1 = new AccountValue("Natanael Santos ", 50.00);
		AccountValue account2 = new AccountValue("Riquinho rico", -7.53);
		
		System.out.printf("%s possui %.2f $ de saldo %n",
		account1.getName(), account1.getBalance());
		
		
	}
}