//Classe ContaTest removendo codigos duplicados
//Esse codigo é uma Atualização Da classe AccountValueTest

public class AccountTest3_15 {
	
	public static void main(String[] args)
	{	
		AccountValue test1 = new AccountValue("Natanael Santos", 50.49);
		AccountValue test2 = new AccountValue("Erick Roberto", -90.80);
		
		displayAccount(test1);
		displayAccount(test2);
		
		System.out.print("Quanto deseja depositar a account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("Foram adicionados %.2f ao saldo da account1%n%n ", depositAmount);
		test1.deposit(depositAmount);
		
		displayAccount(test1);
		displayAccount(test2);
		
		System.out.print("Quanto deseja depositar a account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("Foram adicionados %.2f ao saldo da account2%n%n ", depositAmount);
		test2.deposit(depositAmount);
		
		displayAccount(test1);
		displayAccount(test2);
		
	}
	public static void displayAccount(AccountValue accountToDisplay)
	{
		java.util.Scanner input = new java.util.Scanner (System.in);
		//Exibe o saldo inicial
		System.out.printf("%s possui %.2f $ de saldo %n",
		accountToDisplay.getName(), accountToDisplay.getBalance());	
	}
	
}
