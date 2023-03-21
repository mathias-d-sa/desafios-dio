package br.com.desafios;

import java.util.Scanner;

public class FabricaCarros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica;
		double porcentagemDistribuidor;
		double porcentagemImpostos;
		
		System.out.print("Informe o valor do custo de fábrica: ");
		custoFabrica = leia.nextInt();
		System.out.print("Informe o valor do percentual do distribuidor: ");
		porcentagemDistribuidor = leia.nextInt();
		System.out.print("Informe o valor do percentual dos impostos: ");
		porcentagemImpostos = leia.nextInt();
		
		
		FabricaCarros.calculoFinal(custoFabrica, porcentagemDistribuidor, porcentagemImpostos);
		
		leia.close();
	}
	
	public static void calculoFinal(double custoFabrica, double porcentagemDistribuidor, double porcentagemImpostos) {
		double custoCliente = custoFabrica + (porcentagemDistribuidor/100*custoFabrica) + (porcentagemImpostos/100*custoFabrica);
		
		System.out.printf("%.0f",custoCliente);
	}

}


