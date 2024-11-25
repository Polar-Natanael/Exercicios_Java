//Entrada e saída de números de ponto flutuante com Objetos Account 
import java.util.Scanner;

public class AccountValueTest
{
	public static void main(String[] args)
	{
		//Cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		AccountValue account1 = new AccountValue("Natanael Santos ", 50.00);
		AccountValue account2 = new AccountValue("Riquinho rico", -7.53);
		
		//Exibe o saldo inicial
		System.out.printf("%s possui %.2f $ de saldo %n",
		account1.getName(), account1.getBalance());
		System.out.printf("%s possui %.2f $ de saldo %n",
		account2.getName(), account2.getBalance());
		
		System.out.print("Quanto deseja depositar a account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("Foram adicionados %.2f ao saldo da account1%n%n ", depositAmount);
		account1.deposit(depositAmount);
		
		//Exibe os saldos 
		
		System.out.printf("%s balance: $%.2f %n",
		account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",
		account2.getName(),account2.getBalance());
		
		System.out.print("Quanto deseja depositar a account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("Foram adicionados %.2f ao saldo da account2%n%n ", depositAmount);
		account2.deposit(depositAmount);
		
		
		System.out.printf("%s balance: $%.2f %n",
		account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",
		account2.getName(),account2.getBalance());
		
		
	}
}