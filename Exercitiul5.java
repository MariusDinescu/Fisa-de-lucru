import java.util.Scanner;

public class Exercitiul5 {
	
	
	public static void Cea_mai_mare_mica_cifra(int nr) {
		
		
		
		String n = Integer.toString(nr); //123456
		String[] n1 = n.split(""); // 1 2 3 4 5 6 
		
		int[] n2 = new int[n1.length]; //
		
		for(int i = 0;i<n1.length;i++) {
			
			n2[i] = Integer.valueOf(n1[i]);
			
		}
		
		for(int i = 0;i<n2.length;i++)
		{
			for(int j  = i+1; j<n2.length;i++) {
				
				int aux;
				aux = i;
				i = j;
				j =aux;
				
			}
		}
		
		System.out.println("Cea mai mica cifra este : " + n2[0]);
		System.out.println("Ultima cifra a numarului este : " + n2[n2.length-1]);
		
	}
	public static void main(String[] args) {

		// 5. Sa se defineasca o functie care determina cea mica si cea mai mare cifra a
		// unui numar natural. ex: n=123 → cea mai mica cifra = 1, cea mai mare cifra =
		// 3
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduceti numarul:  ");
		int nr = sc.nextInt();
		
		Cea_mai_mare_mica_cifra(nr);
		

	}

}
