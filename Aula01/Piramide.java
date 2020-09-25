package aula01;

public class Piramide extends Poliedro {

	private double base, altura, comprimento;
	
	public Piramide(double base, double altura, double comprimento) {
		this.base = base;
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public double volume() {
		return (1d/3d) * this.base * this.altura * this.comprimento;
	}
	
}
