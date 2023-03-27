package enquanto;

import java.util.*;

public class Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("digite dois numeros");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			
			while(n1 != n2) {
				System.out.println("digite outros dois numeros");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				if(n1<n2) {
					System.out.println("Cresente");
				}else {
					System.out.println("Decresente");
	
			}		
		}	
			sc.close();
	}
}


