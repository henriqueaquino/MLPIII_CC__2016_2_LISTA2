package br.unipe.exercicio2;

public class Circulo implements CalculoFigura{

	private float raio;
	
	public Circulo (float raio){
		this.raio = raio;
	}
	
	public float calPerimetro(){
		return this.raio * 2 * 3.14f;
	}
	
	public float calArea(){
		return 3.14f * (this.raio * this.raio);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	
}
