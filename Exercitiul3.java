import java.util.Scanner;

public class Exercitiul3 {
	
	public static void Diviziori(int n , int k) {
		
		if(n % k == 0 ) {
			System.out.println(" Numarul de divizori ai lui " + n + " este mai mare decat " + k );
		}
		else
		{
			System.out.println(" NU!");
		}
	}

	public static void main(String[] args) {

		// 3. Sa se implementeze o functie care primeste prin intermediul a doi
		// parametri n si k: doua numere naturale si verifica daca un numarul n are cel
		// putin k divizori.
		// Ex: n=12, k=4 → DA pentru ca numarul de divizori ai numarului 12 este mai
		// mare decat 4

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti primul numar: ");
		int n = sc.nextInt();
		System.out.println("Introduceti al doilea  numar: ");
		int k = sc.nextInt();
		
		
		Diviziori(n,k);
		
	}
}
