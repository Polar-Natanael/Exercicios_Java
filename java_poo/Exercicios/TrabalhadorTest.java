//TrabalhadorTest  essa classe é responsavel por testar a classe TrabalhadorTest

public class TrabalhadorTest
{
	public static void main(String[] args)
	{
	Trabalhador test2 = new Trabalhador("Ivanildo", "Soares", 1304.99);
	
	System.out.printf("O test1 tem em seu objeto os seguintes argumentos %n%n Nome:%s%n Sobrenome:%s%n Salario:%.2f%n",
	test2.getName(), test2.getSobrenome(), test2.getSalario());
	}
}