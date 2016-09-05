package br.unipe.exercicio1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valorImposto = 0;
		String tipoImposto;
		int anoImposto = 0;
		int codImposto = 0;
		
		System.out.println("Valor imposto: ");
		valorImposto = ler.nextDouble();
		ler.nextLine();
		System.out.println("Tipo imposto: ");
		tipoImposto = ler.nextLine();
		System.out.println("Ano imposto: ");
		anoImposto = ler.nextInt();
		ler.nextLine();
		System.out.println("Codigo Imposto: ");
		codImposto = ler.nextInt();
				
		ImpostoDeRenda i1 = new ImpostoDeRenda(valorImposto, tipoImposto, anoImposto, codImposto);
		ImpostoPrivado i2 = new ImpostoPrivado(valorImposto, tipoImposto, anoImposto, codImposto);
		ImpostoPublico i3 = new ImpostoPublico(valorImposto, tipoImposto, anoImposto, codImposto);
		
		System.out.println("Imposto de Renda: "+i1.calcularImposto());
		System.out.println("Imposto Privado: "+i2.calcularImposto());
		System.out.println("Imposto Publico: "+i3.calcularImposto());
		
	}

}
