package br.com.desafios;

import java.util.Scanner;

public class Positivos_e_Media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int cont = 0;
		double media = 0;
		double soma = 0;
		double x;
		
		for(int i = 0; i < 6; i++) {
			x = leia.nextDouble();
			if(x > 0) {
				cont++;
				soma += x;
			}
			
		}
		
		media = soma / cont;
		
		System.out.println(cont + " valores positivos");
		System.out.printf("\nMedia:%.1f", media);
	}

}
