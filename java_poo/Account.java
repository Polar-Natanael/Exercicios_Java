//Classe Conta Que contém uma variável de instância name

public class Account
{
	private String name;//variavel de instância
	
	//O construtor inicilaliza name com nome do pârametro
	public Account(String name)// o nome do construtor é  o nome da classe
	{
		this.name= name
	}
	
	//método para definir  o nome no objeto 
	public void setName(String name)
	{
		this.name = name;//armazena o nome
	}
	//método para recuperar o nome do objeto
	public String getName()
	{
		return name; //retorna valor do nome para o chamador 
	}
}