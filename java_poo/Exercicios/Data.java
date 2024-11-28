//  Criando uma classe Data 

public class Data
{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes,int ano)// Vou supor por enquanto que os valores colocados são validos
	{
		if(dia > 0 && dia < 31)
			this.dia= dia;
		
		if(mes > 0 && mes <= 12)
			this.mes = mes;
		
		if(ano > 0)
			this.ano = ano;
	}
	
	public void dataDisplay()
	{
		System.out.printf("Segundo os dados disponiveis temos que a data correspondente a instancia é : %d/%d/%d%n%n",
		dia, mes, ano);
	}
	
	public void setDia(int dia){
		if(dia > 0 && dia < 31)
			this.dia= dia;
	}
	public int getDia()
	{
		return dia;
	}
	
	public void setMes(int mes){
		if(dia > 0 && dia < 31)
			this.dia= dia;
	}
	public int getMes(){
		return mes;
	}
	public void setAno(int ano){
		if(ano > 0)
			this.ano = ano;
	}
	public int getAno()
	{
		return ano;
	}
}