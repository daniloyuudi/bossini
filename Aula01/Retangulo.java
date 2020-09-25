package aula01;

public class Retangulo extends Poligono implements Diagonal {
	
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
	}
	
	@Override
	public double perimetro() {
		return 2*this.base + 2*this.altura;
	}

}
