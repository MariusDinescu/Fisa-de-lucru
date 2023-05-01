
import java.util.Scanner;

public class Exercitiul1 {
	
	
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
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Introduceti primul numar: ");
        int numar1 = sc.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int numar2 = sc.nextInt();

        if (estePrim(numar1) && estePrim(numar2)) {
            int min = Math.min(numar1, numar2);
            int max = Math.max(numar1, numar2);

            System.out.print("Numerele prime dintre " + numar1 + " si " + numar2 + " sunt: ");

            for (int i = min + 1; i < max; i++) {
                if (estePrim(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Cel putin unul dintre numere nu este prim.");
            if(estePrim(numar1) == false || estePrim(numar2) == false ) {
            	double media = (numar1+numar2)/2.0;
            	System.out.println(media);
            
        }
       
    }

  
    
		
	}
   
}







