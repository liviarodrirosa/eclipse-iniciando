package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student student = new Student();
		
		
		student.aluno = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", student.notaFinal());
			if (student.notaFinal() < 60.0) {
				System.out.println("Reprovou");
				System.out.printf("Faltou: %.2f%n", student.pontosFaltantes());
			}    
			else {
				System.out.println("Passou");
			}
    
			sc.close();
	}
}



