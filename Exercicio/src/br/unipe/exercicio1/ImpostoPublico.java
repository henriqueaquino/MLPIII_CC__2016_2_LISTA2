package br.unipe.exercicio1;

public class ImpostoPublico extends Imposto implements ITributavel{
	
	public ImpostoPublico(double valorImposto, String tipoImposto, int anoImposto, int codImposto){
		this.valorImposto = valorImposto;
		this.tipoImposto = tipoImposto;
		this.anoImposto = anoImposto;
		this.codImposto = codImposto;
	}

	
	public double calcularImposto(){
		return this.valorImposto + (this.valorImposto * 0.15);
	}

}