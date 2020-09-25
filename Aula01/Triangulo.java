package aula01;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return this.base * this.altura / 2;
	}
	
	@Override
	public double perimetro() {
		double D = Math.sqrt(Math.pow(this.base/2, 2) + Math.pow(this.altura, 2));
		return this.base + 2*D;
	}
	
}
