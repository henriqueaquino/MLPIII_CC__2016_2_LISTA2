package br.unipe.exercicio2;

public class Quadrado implements CalculoFigura{
	
	private float lado;
	
	public Quadrado (float lado){
		this.lado = lado;
	}
	
	public float calPerimetro(){
		return this.lado * 6;
	}
	
	public float calArea(){
		return this.lado * this.lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	

}
