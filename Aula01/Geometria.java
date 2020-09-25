package aula01;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Circulo(4));
		figuras.add(new Triangulo(2, 4));
		figuras.add(new Losango(5));
		figuras.add(new Quadrado(2));
		figuras.add(new Retangulo(3, 7));
		
		for (Figura item: figuras) {
			System.out.println(item.getClass() + ":");
			System.out.println("Area: " + item.area());
			System.out.println("Perimetro: " + item.perimetro());
			
			if (item instanceof Diagonal) {
				Diagonal diagonal = (Diagonal) item;
				System.out.println("Diagonal: " + diagonal.diagonal());
			}
			
			System.out.println("");
		}
		
		ArrayList<Poliedro> poliedros = new ArrayList<Poliedro>();
		poliedros.add(new Esfera(4));
		poliedros.add(new Cilindro(4, 2));
		poliedros.add(new Cubo(2, 3, 4));
		poliedros.add(new Piramide(4, 1, 8));
		
		for (Poliedro item: poliedros) {
			System.out.println(item.getClass());
			System.out.println("Volume: " + item.volume());
			System.out.println("");
		}
	}

}
