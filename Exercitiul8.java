import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul8 {

	public static void main(String[] args) {
//		8.	Se da un vector de numere intregi de dimensiune n, plus un numar k. Sa se interschimbe primele k elemente cu ultimele k elemente.

		Scanner sc = new Scanner(System.in);
		
		int[] vector = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int k;
		
        System.out.println("Introduceti numarul: ");
        k = sc.nextInt();

        // afișăm vectorul inițial
        System.out.println("Vectorul initial: " + Arrays.toString(vector));

        // interschimbăm primele k elemente cu ultimele k elemente
        for (int i = 0; i < k; i++) {
            int temp = vector[i];
            vector[i] = vector[vector.length - k + i];
            vector[vector.length - k + i] = temp;
        }

        // afișăm vectorul după interschimbare
        System.out.println("Vectorul dupa interschimbare: " + Arrays.toString(vector));
    }

}
