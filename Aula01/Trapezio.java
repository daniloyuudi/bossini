package aula01;

public class Trapezio extends Poligono {

	protected double base2;
	
	public Trapezio(double base1, double base2, double altura) {
		super(base1, altura);
		this.base2 = base2;
	}
	
	public double area() {
		return (this.base + this.base2) * this.altura / 2;
	}
	
	public double perimetro() {
		double L = Math.abs(this.base - this.base2) / 2;
		double D = Math.sqrt(Math.pow(L, 2) + Math.pow(this.altura, 2));
		return this.base + this.base2 + 2*D;
	}
	
}
