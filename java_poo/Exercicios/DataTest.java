//DataTest para testar a classe Data

public class DataTest
{
	public static void main(String[] args)
	{
		int dia, mes, ano;
		
		
		Data test1 = new Data(28, 11, 2024);
		
		test1.dataDisplay();
		System.out.println();
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.println("Olá vamos \"guarda\" esse momento por favor me informe:");
		System.out.print("Qual é o dia do mes: ");
		dia = input.nextInt();
		
		
		System.out.print("Em que mes estamos(1-12):");
		mes = input.nextInt();
	
		System.out.print("Em que ano estamos");
		ano = input.nextInt();
		System.out.println();
		
		Data test2 = new Data(dia, mes, ano);
		test2.dataDisplay();
		
		
	}
}