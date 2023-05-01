import java.util.Collections;
import java.util.Scanner;

public class Exercitiul9 {

	

	
	public static void main(String[] args) {
//		9.	Se da un vector de numere intregi de dimensiune n. Sa se sorteze toate numerele pare din vector (cele impare raman pe pozitii). Sa se afiseze un mesaj corespunzator daca vectorul ramane neschimbat.

		Scanner input = new Scanner(System.in);

		System.out.print("Introduceti dimensiunea vectorului: ");
		int n = input.nextInt();

		
		int[] vector = new int[n];
		n = vector.length;

		System.out.println("Introduceti elementele vectorului:");

		for (int i = 0; i < n; i++) {
			System.out.print("Elementul " + (i + 1) + ": ");
			vector[i] = input.nextInt();
		}

		// Afisare vector
		System.out.print("Vectorul introdus este: ");
		for (int i = 0; i < n; i++) {
			System.out.print(vector[i] + " ");
		}
		
	
		
		
		for(int i = 0 ;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(vector[i] %2 ==0 && vector[j] %2 ==0) {
					if(vector[i] > vector[j]) {
						int aux ;
						aux = vector[i];
						vector[i] = vector[j];
						vector[j] = aux;
					} 
					
				}
			}
		}

		System.out.println(" ");
		
		System.out.print("Vectorul sortat este: ");
		for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
    
		
		
		

			
			
				
				
				
				
				
			
			

		

	}

}
