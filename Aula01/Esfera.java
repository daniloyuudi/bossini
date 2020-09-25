package aula01;

public class Esfera extends Poliedro {
	
	private double raio;
	
	public Esfera(double raio) {
		this.raio = raio;
	}
	
	public double volume() {
		return (4d/3d) * Math.PI * Math.pow(this.raio, 3);
	}

}
