import java.util.Scanner;


public class Numere_Vectori_Functii {
	
	//1.	Se dau 2 numere intregi. 
	//Sa se verifice daca numerele sunt prime si daca sunt, atunci sa se afiseze sub forma (x,y,z,…) toate numerele dintre aceste doua numere (de la cel mai mic la cel mai mare, fara numerele date). 
	//Daca nu sunt prime, atunci sa se afiseze un mesaj corespunzator si sa se afiseze media aritmetica a celor doua numere date.


	public static boolean Numere_prime(int num) {
		
		if( num < 2)
		{
			return false;
		}
		
		for(int i= 2 ; i*i<= num;i++) {
			if( num % i == 0) {
				return false;
			}
			
			
		}
		return true;
	}
	
	public static int PrimesBetween(int start, int end) {
	

		
		
		for(int i = start +1 ;i<end;i++)
		{
			if(Numere_prime(i))
			{
				
			}
			
			
		}
		
		return 0;
		
		
		}
		
	
	
			
			
				
		
		
		
		
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti numerele" );
		
		int nr  = sc.nextInt();
		Numere_prime(nr);
		
		sc.close();
		
	
		
		
		
		

	}

}
