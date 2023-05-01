import java.util.Scanner;

public class Exercitiul6 {

	

	public static boolean estePrim(int numar) {
		if (numar < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(numar); i++) {
			if (numar % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// 6. Se citesc 2 numere naturale, sa se verifice daca cele doua valori sunt
		// numere prime si daca sunt sa se calculeze suma tuturor cifrelor din
		// componenta celor 2 valori.
		// Ex: a=7, b=11 → ambele sunt valori numere prime si se va afisa valoarea 9 (9
		// = 7+1+1)

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduceti primul numar : ");
		int n = sc.nextInt();
		System.out.print("Introduceti al doilea numar: ");
		int n1 = sc.nextInt();

		System.out.println(estePrim(n));

		System.out.println(estePrim(n1));

		if (estePrim(n) && estePrim(n1)) {
			int min = Math.min(n, n1);
			int max = Math.max(n, n1);

			System.out.print("Numerele prime dintre " + n + " si " + n1 + " sunt: ");
			
			int sum = 0;
			for (int i = min; i < max; i++) {
				if (estePrim(i)) {
					System.out.println(i + " ");
					sum = sum + i + 2;

				}
				
		

			}
			System.out.println("Suma tutror cifrelor din componenta celor doua valori prime este: " + sum);
		}
		
	}
}
