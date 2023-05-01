import java.util.Scanner;

public class Exercitiul2 {
	
	public static int Subprogram(int n) {
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti dimensiunea: ");
		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] >= 100 && a[i] <= 1000) {
				int radacina = (int) Math.sqrt(a[i]);
				if (radacina * radacina == a[i]) {
					System.out.println("Nr perfecte sunt: " + a[i] + " ");

				} else {
					System.out.println( a[i] + " Nu este numar perfect");
				}

			}

			else {
				System.out.println("Numarul " + a[i] + " nu este in interval");
			}

			sc.close();

		}
		
		
	}
}
