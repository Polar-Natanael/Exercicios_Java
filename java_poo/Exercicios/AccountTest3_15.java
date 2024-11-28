//Classe ContaTest removendo codigos duplicados
//Esse codigo é uma Atualização Da classe AccountValueTest

public class AccountTest3_15 {
	
	public static void main(String args)
	{
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		Account test1 = new Account("Natanael Santos", 50.49);
		Account test2 = new Account("Erick Roberto", -90.80);
		
		//Exibe o saldo inicial
		System.out.printf("%s possui %.2f $ de saldo %n",
		test1.getName(), test1.getBalance());
		System.out.printf("%s possui %.2f $ de saldo %n",
		test2.getName(), test2.getBalance());
		
	}
	
}
