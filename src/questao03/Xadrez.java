package questao03;

import java.util.Random;
import java.util.Scanner;

public class Xadrez {
		
	static int  mPossiveis[][]={{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
	
	 public static void main(String[] args) {
		 		 
     Scanner scannerx = new Scanner(System.in);
     Random rd = new Random();
     
     System.out.printf("Digite a quantidade de movimentos desejados:");
     int c =rd.nextInt(8);
     int l =rd.nextInt(8);
     int k = scannerx.nextInt();
     int m=k;

	 int[][] tabuleiro = new int[8][8];
	 tabuleiro[c][l] = 1;

	    while(k-->0) {
	      int[][] nTabuleiro = new int[8][8];
	      for (int a = 0; a < 8; a++) {
	        for (int b = 0; b < 8; b++) {
	          for (int[] movimento : mPossiveis) {
	            int mc = a + movimento[0];
	            int ml = b + movimento[1];
	            if (mc >= 0 && mc < 8 && ml >= 0 && ml < 8) {
	            
	              nTabuleiro[mc][ml] += tabuleiro[a][b];	             
	            }
	          }
	        }
	      }
	      tabuleiro = nTabuleiro;	      
	    }
	    int resultado = 0;
	    for (int a = 0; a < 8; a++) {
	      for (int b = 0; b < 8; b++) {
	    	resultado+= tabuleiro[a][b];
	      }
	    }
	    System.out.println("A probabilidade de o cavalo estar dentro do tabuleiro após "+m+" movimentos é de "+1.0 * resultado / (8.0 * 8.0));
	  }
	}

	
