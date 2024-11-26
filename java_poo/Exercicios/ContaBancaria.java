//Exercìcios de fixação
//Criar uma metodo de saque para a classe que simula uma conta bancaria

public class ContaBancaria
{
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo)
	{
		this.titular = titular;
		
		if( saldo > 0.0)
			this.saldo = saldo;
	}	
	
	public void deposito(double quantidadeValor)
	{
		if(quantidadeValor > 0.0)
			saldo = saldo + quantidadeValor;
	}
	
	public void saque(double quantidadeValor)
	{
		if(quantidadeValor > saldo)
			System.out.printf("O valor %.2f ultrapaça o saldo existente", quantidadeValor);
		
		if(quantidadeValor >0.0)
			if(quantidadeValor <= saldo)
				saldo= saldo - quantidadeValor;
			
		
			
	}
	public double getSaldo()
	{
		return saldo;
	}
	public void setTitular(String titular)
	{
		this.titular = titular;
	}
	public String getTitular()
	{
		return titular;
	}
}
