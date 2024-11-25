//
import java.util.Scanner;

public class AccountVTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double valor1 = 300;
		double valor2 = 276.33;
		double valor3 = 0.33;
		double valor4 = -9.8;
		
		
		
		AccountV conta1 = new AccountV("Natanael", valor1);
		AccountV conta2 = new AccountV("jeniffer", valor2);
		AccountV conta3 = new AccountV("Enzo", valor3);
		AccountV conta4 = new AccountV("Leandro", valor4);
		
		System.out.printf("A primeira conta tem como titular: %s%n possui: %.2f R$%n%n",
		conta1.getName(), conta1.getBalance());
		System.out.printf("A Segunda conta tem como titular: %s%n possui: %.2f R$%n%n",
		conta2.getName(), conta2.getBalance());
		System.out.printf("A Terceira conta tem como titular: %s%n possui: %.2f R$%n%n",
		conta3.getName(), conta3.getBalance());
		System.out.printf("A Quarta conta tem como titular: %s%n possui: %.2f R$%n%n",
		conta4.getName(), conta4.getBalance());
		
		conta4.deposit(234.00);
		
		System.out.printf("A Quarta conta tem como titular: %s%n possui: %.2f R$%n%n",
		conta4.getName(), conta4.getBalance());
		
		System.out.print("Nos informe o nome do titular que deseja abrir uma conta:");
		String theName = input.nextLine();
		System.out.print("Insira o valor que deseja depositar:");
		double valor = input.nextDouble();
		
		AccountV conta = new AccountV(theName, valor);
		System.out.printf("A ultima conta tem como titular: %s%n possui: %.2f R$%n%n",
		conta.getName(), conta.getBalance());
	}
}