package br.unipe.exercicio1;

public class Imposto implements ITributavel{
	
	protected double valorImposto;
	protected String tipoImposto;
	protected int anoImposto;
	protected int codImposto;
	
	public double calcularImposto(){
		return 0;
	}
	
	public double getValorImposto() {
		return valorImposto;
	}
	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}
	public String getTipoImposto() {
		return tipoImposto;
	}
	public void setTipoImposto(String tipoImposto) {
		this.tipoImposto = tipoImposto;
	}
	public int getAnoImposto() {
		return anoImposto;
	}
	public void setAnoImposto(int anoImposto) {
		this.anoImposto = anoImposto;
	}
	public int getCodImposto() {
		return codImposto;
	}
	public void setCodImposto(int codImposto) {
		this.codImposto = codImposto;
	}
	
	

}
