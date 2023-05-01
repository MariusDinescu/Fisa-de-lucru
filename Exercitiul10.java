import java.util.Scanner;

public class Exercitiul10 {

	public static boolean esteSortat(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] > n[i + 1]) {
				return false; // vectorul nu este sortat crescător
			}
		}
		return true; // vectorul este sortat crescător
	}

	public static boolean esteSortatDescrescator(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] < n[i + 1]) {
				return false; // vectorul nu este sortat descrescător
			}
		}
		return true; // vectorul este sortat descrescător
	}

	public static void main(String[] args) {
//		10.	Se dau 2 vectori de dimensiune diferita. 
//		a.	Sa se testeze daca vectorii sunt sortati (crescator sau descrescator). Sa se afiseze mesaje corespunzatoare.
//		b.	Sa se formeze un alt vector care contine toate elementele din cele doua in ordine crescatoare (inclusive duplicate, daca exista).
//		c.	Sa se comenteze complexitatea obtinuta la punctul b

		Scanner sc = new Scanner(System.in);

		// vector1
		System.out.print("Introduceti dimensiunea vectorului 1: ");
		int n = sc.nextInt();

		int[] vector = new int[n];
		n = vector.length;

		// vector2
		System.out.print("Introduceti dimensiunea vectorului 2: ");
		int n2 = sc.nextInt();

		int[] vector2 = new int[n2];
		n2 = vector2.length;

		System.out.println("Introduceti elementele vectorului 1:");

		// introducere elemente in vector 1
		for (int i = 0; i < n; i++) {
			System.out.print("Elementul " + (i + 1) + ": ");
			vector[i] = sc.nextInt();
		}

		System.out.println("Introduceti elementele vectorului 2: ");

		// introducere elemente in vector2
		for (int i = 0; i < n2; i++) {
			System.out.print("Elementul " + (i + 1) + ": ");
			vector2[i] = sc.nextInt();
		}

		// Afisare vector
		System.out.print("Vectorul 1 introdus este: ");
		for (int i = 0; i < n; i++) {
			System.out.print(vector[i] + " ");

		}
		System.out.println(" ");
		System.out.print("Vectorul 2 introdus este: ");
		// afisare vector2
		for (int i = 0; i < n2; i++) {
			System.out.print(vector2[i] + " ");
		}

		System.out.println("");

		
		// punctul a
		
		
		if (esteSortat(vector)) {
			System.out.println("Primul vector este sortat in ordine crescatoare.");
		} else if (esteSortatDescrescator(vector)) {
			System.out.println("Primul vector este sortat in ordine descrescatoare.");
		} else {
			System.out.println("Primul vector nu este sortat.");
		}
		
		if (esteSortat(vector2)) {
		    System.out.println("Al doilea vector este sortat in ordine crescatoare.");
		} else if (esteSortatDescrescator(vector2)) {
		    System.out.println("Al doilea vector este sortat in ordine descrescatoare.");
		} else {
		    System.out.println("Al doilea vector nu este sortat.");
		}

		
		//punctul b
		
		int[] vector3 = new int[vector.length + vector2.length];
		
		int pozitie = 0;
		
		for(int i = 0;i<vector.length;i++) {
			vector3[pozitie] = vector[i];
			pozitie++;
		}
		
		for(int i = 0;i<vector2.length;i++) {
			vector3[pozitie] = vector2[i];
			pozitie++;
		}
		System.out.println(" ");
		
		System.out.print("Vectorul 3 concatenat este: ");
		for (int i = 0; i < vector3.length; i++) {
			System.out.print(vector3[i] + " ");
		
		}
		
		for(int i = 0;i<vector3.length;i++) {
			for(int j = i+1;j<vector3.length;j++) {
				if(vector3[i]>vector3[j]) {
					int aux = vector3[i];
					vector3[i] = vector3[j];
					vector3[j] = aux;
				}
			}
		}
		
		
		System.out.println(" ");
		
		System.out.println("Vectorul 3 in ordine crescatoare este: ");
		
		
		for (int i = 0; i < vector3.length; i++) {
			System.out.print(vector3[i] + " ");
		
		}
		
		//punctul C
		// Complexitatea este patratica, deaorece tipul de sortare este insertion sort , ce face ca cele doua for-uri sa returneze o complexitate O n^2
	}

}
