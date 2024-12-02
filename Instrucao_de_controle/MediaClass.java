//Uma classe de dez alunos se submeteu a um questionário. As notas (inteiros no intervalo 0–100) para esse
//questionário estão disponíveis. Determine a média da classe no questionário.

public class MediaClass
{
	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		int total = 0;
		int cont = 1;
		
		while(cont<=10)
		{
			System.out.printf("Informe a nota do %d° aluno:", cont);
			int nota = input.nextInt();
			if(nota<0)
				nota = 0;
			else if(nota >100)
				nota = 100;
			
			total = total + nota;
			cont = cont + 1;
		}
		int media = total/10;
		
		System.out.printf("A soma das notas do 10 alunos:%d%n", total);
		System.out.printf("A media da turma: %d", media);
	}
}
