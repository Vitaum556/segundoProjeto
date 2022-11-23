package segundoProjeto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("segundo projeto");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("escreva tres numeros");
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();
		
		System.out.println(a + " - " + b + " - " + c);
		

		
		
		sc.close();
		
		
	}

}
