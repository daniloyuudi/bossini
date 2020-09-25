package aula01;

public class Cilindro extends Poliedro {

	private double altura, raio;
	
	public Cilindro(double altura, double raio) {
		this.altura = altura;
		this.raio = raio;
	}
	
	public double volume() {
		return Math.PI * Math.pow(this.raio, 3) * this.altura;
	}
	
}
