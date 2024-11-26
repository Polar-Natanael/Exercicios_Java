//Exercicio que cria uma classe para calcular a fatura de umma loja

public class Fatura
{
	private String codigo;
	private String descricao;
	private int quantItem;
	private double precoItem;
	
	public Fatura(String codigo, String descricao, int quantItem, double precoItem)
	{
		this.codigo = codigo;
		this.descricao = descricao;
		
		if(quantItem > 0)
			this.quantItem = quantItem;
		
		if(precoItem > 0.0)
			this.precoItem = precoItem;
	}	
	
	public double valorFatura(){
		
		return quantItem * precoItem;
	}
	
	public void setCodigo(String codigo){
	    this.codigo = codigo;
	}
	public String getCodigo()
	{
		return codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setQuantItem(int quantItem){
		this.quantItem = quantItem;
	}
	public int getQuantItem(){
		return quantItem; 
	}
	
	public void setPrecoItem(double precoItem){
		this.precoItem = precoItem;
	}
	public double getPrecoItem(){
		return precoItem;
	}
	
} 