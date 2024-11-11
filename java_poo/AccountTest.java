//Cria e manipula um objeto Account
import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args){
	
	//Cria um objeto Scanner
	Scanner input = new Scanner(System.in);
	
	//Cria um objeto Account e o atribui a myAccount
	Account myAccount = new Account();
	
	//Exibe o valor inicial do nome (null)
	System.out.printf("Primeiro nome: %s%n%n", myAccount.getName());
	
	//Solicita e lê o nome
	
	System.out.println("Por favor digite seu nome ");
	String theName = input.nextLine();//lê uma linha de texto
	myAccount.setName(theName);// insere theName em myAccount
	System.out.println();
	
	//Exibe o nome armazenado no ojeto myAccount
	System.out.printf("Nome no objeto myAccount: %n%s%n",
	myAccount.getName());
	}
}