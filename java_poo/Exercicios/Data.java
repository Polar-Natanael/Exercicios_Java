//  Criando uma classe Data 

public class Data
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes,int ano)// Vou supor por enquanto que os valores colocados são validos
	{
		if(dia > 0 || dia < 31)
			this. dia= dia;
		
		if(mes > 0 & mes <= 12)
			this.mes = mes;
		
		if(ano > 0)
			this.ano = ano;
	}
	
	public void setDia(int dia){
		if(dia > 0 || dia < 31)
			this. dia= dia;
	public int getDia()
	{
		return dia;
	}
	
	public void setMes(int mes){
		if(dia > 0 || dia < 31)
			this. dia= dia;
	}
	public int getMes(){
		return mes;
	}
	public void setAno(int ano){
		
	}
	public int getAno()
	{
		if(ano > 0)
			this.ano = ano;
	}
}