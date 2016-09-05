package br.unipe.exercicio2;

public class Retangulo implements CalculoFigura {
	
	private float base;
	private float altura;
	
	public Retangulo(float base, float altura){
		this.base = base;
		this.altura = altura;
	}
	
	public float calPerimetro(){
		return (this.base * 2) + (this.altura * 4);
	}
	
	public float calArea(){
		return this.base * this.altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
}
