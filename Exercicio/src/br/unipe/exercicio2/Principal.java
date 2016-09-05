package br.unipe.exercicio2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Quadrado[] vetor = new Quadrado[10];
		Retangulo[] vetor2 = new Retangulo[10];
		Circulo[] vetor3 = new Circulo[10];
		
		int controle = 0;
		int controle2 = 0;
		int controle3 = 0;
		int lop = 0;
		int lop2 = 0;
		int valor = 0;
		float aux = 0;
		float aux2 = 0;
		
		System.out.println("Quantas formas deseja criar: ");
		lop = ler.nextInt();
		ler.nextLine();
		
		while(lop2 < lop){
			
			System.out.println("Dseja criar um: [1] Quadrado  [2] Retangulo  [3] Circulo");
			valor = ler.nextInt();
			
			switch(valor){
			case 1 : if(controle > 9) break;
					 System.out.println("Digite o lado: ");
			         aux = ler.nextFloat();
			         Quadrado q = new Quadrado(aux);
			         vetor[controle] = q;
			         controle++;
			         break;
			case 2 : if(controle2 > 9) break;
					 System.out.println("Digite a base: ");
					 aux = ler.nextFloat();
					 ler.nextLine();
					 System.out.println("Digite a altura: ");
					 aux2 = ler.nextFloat();
					 ler.nextLine();
					 Retangulo w = new Retangulo(aux, aux2);
					 vetor2[controle2] = w;
					 controle2++;
					 break;
			case 3 : if(controle3 > 9) break;
					 System.out.println("Digire o raio: ");
			         aux = ler.nextFloat();
			         ler.nextLine();
			         Circulo c = new Circulo(aux);
			         vetor3[controle3] = c;
			         controle3++;
			         break;
			}
			lop2++;
		}
			
			valor = 0;
			
			while(valor < controle){
				System.out.println("Quadrado "+valor);
				System.out.println("Lado: "+vetor[valor].getLado());
				System.out.println("Perimetro: "+vetor[valor].calPerimetro());
				System.out.println("Area: "+vetor[valor].calArea());
				valor++;
			}
			
			valor = 0;
			
			while(valor < controle2){
				System.out.println("Retangulo "+valor);
				System.out.println("Base: "+vetor2[valor].getBase());
				System.out.println("Altura: "+vetor2[valor].getAltura());
				System.out.println("Perimetro: "+vetor2[valor].calPerimetro());
				System.out.println("Area: "+vetor2[valor].calArea());
				valor++;
			}
			
			valor = 0;
			
			while(valor < controle3){
				System.out.println("Circulo "+valor);
				System.out.println("Raio: "+vetor3[valor].getRaio());
				System.out.println("Perimetro: "+vetor3[valor].calPerimetro());
				System.out.println("Area: "+vetor3[valor].calArea());
				valor++;
			}
		 
	}

}
