package aula01;

public class Losango extends Poligono {

	public Losango(double lado) {
		super(lado, lado);
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	@Override
	public double perimetro() {
		return 4*this.base;
	}
	
}
