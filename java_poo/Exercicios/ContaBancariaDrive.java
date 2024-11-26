//Classe drive para testes da classe ContaBancaria

public class ContaBancariaDrive
{
	public static void main (String[] args)
	{
		ContaBancaria contaTest1 = new ContaBancaria("Emily Maia", 230);
		
		System.out.printf("A contaTest1 foi instaciada com esses argumentos %n Titular:%s %n Saldo:%.2f", contaTest1.getTitular(),contaTest1.getSaldo());
		System.out.println("");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Qual a quantia que deseja depositar:");
		double quantidadeValor = input.nextDouble(); 
		
		contaTest1.deposito(quantidadeValor);
		System.out.printf("A contaTest1  %n Titular:%s %n Saldo:%.2f", contaTest1.getTitular(),contaTest1.getSaldo());
		System.out.println("");
		
		System.out.print("Qual a quantia que deseja retirar: ");
		quantidadeValor = input.nextDouble();
		System.out.println("");
		
		contaTest1.saque(quantidadeValor);
		System.out.println("");
		System.out.printf("A contaTest1   %n Titular:%s %n Saldo:%.2f", contaTest1.getTitular(),contaTest1.getSaldo());
		
		
	}
}