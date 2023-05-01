import java.util.Scanner;

public class Exercitiul11 {

	

	public static void main(String[] args) {
//		11.	Se da un vector de dimensiune n. Sa se verifice baza minima in care poate sa fie fiecare element din vector.
//		Ex: numarul 1236 poate sa fie in baza 10, dar poate sa fie si un numar in baza 9, sau 8, sau 7.


		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduceti dimensiunea vectorului: ");
		int n = sc.nextInt();
		
		int [] vector = new int[n];
		n =vector.length;
		
		//introducere elemente in vector
		System.out.println("Introduceti elementele vectorului: ");
		for(int i = 0 ;i<n;i++) {
			System.out.print("Elementul " + (i+1)  + ": ");
			vector[i] = sc.nextInt();
		}
		
		//afisare vector
		System.out.println(" ");
		System.out.print("Vectorul introdus este: ");
		for(int i =0 ;i<n;i++) {
			System.out.print(vector[i] + " ");
		}
		
		 
		 
		 //identificam cea mai mare cifra din numar;
		 
		
		 
	}
	

}
