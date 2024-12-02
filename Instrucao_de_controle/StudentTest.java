//StudentTest.java

public class StudentTest
{
	public static void main(String[] args)
	{
		Student test1 = new Student("Natanael", 75.0);
		Student test2 = new Student("Ricardo", 98.0);
		
		System.out.printf("O estudante %s recebeu um %s%n%n",test1.getName(),test1.getLetterGrade());
		System.out.printf("O estudante %s recebeu um %s%n%n",test2.getName(),test2.getLetterGrade());
	}
}
