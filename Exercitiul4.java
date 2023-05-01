import java.util.Scanner;

public class Exercitiul4 {

	public static void main(String[] args) {
		// 4. Sa se defineasca o functie care determina prima si ultima cifra unui numar
		// natural.
		// Ex: n=123 → prima cifra=1, ultima cifra=3 3.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti nr ");
		int n = sc.nextInt();
		
		
		
		int prima_cifra = n;

		while (prima_cifra >= 10) {
			prima_cifra /= 10;
		}
		int ultima_cifra = n % 10;
		
		System.out.println("Prima cifra a numarului este " + prima_cifra);
		System.out.println("Ultima cifra a numarului este " + ultima_cifra);

	}

}
