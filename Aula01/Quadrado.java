package aula01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado, lado);
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	@Override
	public double diagonal() {
		return this.base * Math.sqrt(2);
	}
	
	@Override
	public double perimetro() {
		return 4*this.base;
	}
	
}
