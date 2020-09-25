package aula01;

public class Cubo extends Poliedro {

	private double base, altura, comprimento;
	
	public Cubo(double base, double altura, double comprimento) {
		this.base = base;
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public double volume() {
		return this.base * this.altura * this.comprimento;
	}
	
}
