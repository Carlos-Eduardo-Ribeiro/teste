package questao02;

import java.util.Scanner;

public class Letras
{
	
	 public boolean cString(String A, String B) {
		 
	        if (A.length() != B.length()) {return false;}
	        
	        char[] cA = A.toCharArray();
	        char[] cB = B.toCharArray();
	        int cont = 0;
	        
	        for (int i = 0; i < A.length(); i++) {
	            cA[A.charAt(i) - 'a']++;
	            cB[B.charAt(i) - 'a']++;
	        }
	        for (int i = 0; i < A.length(); i++) {
		        if (cA[i] != cB[i]){
		        	cont+=1;
		        if (cont > 2||cont==0){return false;}	        	
		        	
		        }
		    }
	        
		    return cont == 2;
		}
	 
	  public static void main(String[] args) {
		  
	    Scanner scanner = new Scanner(System.in);
	    Letras letras=new Letras();

	    System.out.printf("\ndigite as letras para A: ");
	    String A = scanner.next();

	    System.out.printf("digite as letras para B: ");
	    String B = scanner.next();

	    System.out.println(letras.cString(A, B));

	    System.out.println("A=" + A);
	    System.out.println("B=" + B);
	  }
	}
