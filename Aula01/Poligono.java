package aula01;

public abstract class Poligono extends Figura {

	protected double base, altura;
	
	protected Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public abstract double perimetro();
		
}
