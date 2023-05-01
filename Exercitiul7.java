import java.util.Scanner;

public class Exercitiul7 {

	public static boolean isBetween(float toCheck, float from, float to) {

		return from <= toCheck && toCheck <= to;
	}

	public static void main(String[] args) {
		// 7. Se citeste un numar real n si doua valori numere reale a, b ce reprezinta
		// capetele unui interval [a, b]. Spunem ca numarul n este fidel intervalului
		// [a, b] daca atat jumatatea cat si dublul acestuia apartin intervalului [a,
		// b].
		// Ex: n = 2.4, a = 1.1, b = 5.0 → n este fidel intervalului [1.1, 5.0] pentru
		// ca valorile 1.2 si 4.8 apartin intervalului [1.1, 5.0] ex: n = 3.4, a = 1.1,
		// b = 5.0 → n NU este fidel intervalului [1.1, 5.0] pentru ca valorarea 6.8 NU
		// apartine intervalului [1.1, 5.0]

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduceti numarul : ");
		float n = sc.nextFloat();

		float[] n1 = new float[2];
		System.out.println("Introduceti capatul a: ");
		n1[0] = sc.nextFloat();
		System.out.println("Introduceti capatul b: ");
		n1[1] = sc.nextFloat();

		double jum = n/2;
		double dublu = n*2;
		
//		for(int i = 0;i<n1.length;i++) {
//			System.out.print(n1[i] + " " );
//			
//		}
		
		if (jum >= n1[0] && jum <= n1[1] && dublu >= n1[0] && dublu <= n1[1]) {
			System.out.println(n + " este fidel intervalului [" + n1[0] + ", " + n1[1] + "]");
        } else {
            System.out.println(n + " NU este fidel intervalului [" + n1[0] + ", " + n1[1] + "]");
        }
		

//		for (int j = 0; j < n1.length; j++) {
//			if (n1[j] <= n/2 && n/2 <= n1[j]) {
//				//if (n1[j] <= n * n && n * n <= n1[j])
//				System.out.println("este cuprins");
//			} else {
//				System.out.println("Nu este cuprins");
//			}
//		}

		
		
	}

}
