package aula01;

public class Circulo extends Figura {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	
	@Override
	public double perimetro() {
		return 2 * Math.PI * this.raio;
	}
	
}
