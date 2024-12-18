//Classe Student que armazena o nome e a média de um aluno. 

public class Student{

	private String name;
	private double average;
	
	//Costrutor da classe Student que inicia as variaveis de instancia
	public Student(String name, double average){
		this.name = name;
		if(average > 0.0)
			if(average < 100.0)
				this.average = average;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAverage(double studentAverage)
	{
		if(average > 0.0)
			if(average < 100.0)
				this.average = average;
	}
	
	public double getAverage()
	{
		return average;
	}
	
	public String getLetterGrade()
	{
		String letterGrade = "";//inicializando a variavel 
		
		if(average >= 90.0)
			letterGrade = "A";
		else if(average >= 80.0)
			letterGrade = "B";
		else if(average >= 70.0)
			letterGrade = "C";
		else if(average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
}