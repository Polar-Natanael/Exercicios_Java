//Usando construtor de Account para inicializar a instância name
//variável no momento em cada objeto Account é criado. 

public class AccountTest2
{
	public static void main(String[] args)
	{
	//cria dois objetos Account
	Account account1 = new Account("Natanael Santos");
	Account account2 = new Account("Josefa Rodrigres");
	
	//exibir o valor inicial de nome para os Account criados 
	System.out.printf("O Nome guardado em Account1 é:%s%n%n", account1.getName());
	System.out.printf("O Nome guardado em Account2 é:%s%n", account2.getName());
	}
}