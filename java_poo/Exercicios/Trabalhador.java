//Classe Trabalhador respossavel por guardar informações sobre o salario dos trabalhadores 

public class Trabalhador
{
	private String name;
	private String sobrenome;
	private double salario;
	
	public Trabalhador(String name, String sobrenome, double salario)
	{
		this.name = name;
		this.sobrenome = sobrenome;
		
		if(salario> 0.0)
			this.salario = salario;
	}

	public double salarioAnual()
	{
		return salario*12;
	}
	public double aumento(double porcentagem){
		return salario = salario + salario*(porcentagem/100);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	
	public void setSalario(double salario)
	{
		if(salario > 0.0)
			this.salario = salario;
	}
	public double getSalario()
	{
		return salario;
	}
}