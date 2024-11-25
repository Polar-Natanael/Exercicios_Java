//AccountValue.java
//Classe Account com uma variavel de instancia de balaço do tipo double e um construtor 
//Método deposit que executa a validação

public class AccountValue
{
	private String name;//Variável de instância
	private double balance;//Variável de instância
	
	//Construtor de AccountV que recebe dois parâmetros 
	public AccountValue(String name, double balance)
	{
		this.name = name;
		
		//Valida que o balance é maior que 0.0; se não for 
		//a variável de instancia balance mantém seu valor inicial padrão de 0.0]
		if(balance > 0.0)
		this.balance = balance;
	}
	
	//Método que deposita apenas uma quantia valida no saldo.
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	//Método para retornar o saldo da conta 
	public double getBalance(){
		
		return balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		
		return name;
	}
}