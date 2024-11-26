//Classe drive para testar a classe fatura

public class FaturaTest
{
	public static void main (String[] args){
	
	Fatura test1 = new Fatura("234T4","Bobeca de pano", 10, 12.50);
	
	System.out.printf("  O test1 recebeu esses dados abaixo.%n%n Codigo: %s%n Descrição: %s%n Quatidade de Venda: %d%n Preço unitario: %.2f",
	test1.getCodigo(), test1.getDescricao(), test1.getQuantItem(), test1.getPrecoItem());
	System.out.println();
	
	System.out.printf("O valor da fatura desse item ficou em: %.2f", test1.valorFatura());
	
	test1.setDescricao("Carrinho de controle remoto");
	test1.setPrecoItem(25.99);
	System.out.println();
	
	System.out.printf("  O test1 recebeu esses dados abaixo.%n%n Codigo: %s%n Descrição: %s%n Quatidade de Venda: %d%n Preço unitario: %.2f",
	test1.getCodigo(), test1.getDescricao(), test1.getQuantItem(), test1.getPrecoItem());
	System.out.println();
	System.out.printf("O valor da fatura desse item ficou em: %.2f", test1.valorFatura());
	}
}