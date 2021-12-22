package poo.main;

import java.util.ArrayList;
import java.util.List;

import poo.model.Circulo;
import poo.model.Retangulo;
import poo.model.Triangulo;

public class ProgramaFormas {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(4, 3);
		System.out.println("Area tri�ngulo: " + t1.calcularArea());

		Circulo c1 = new Circulo(4);
		System.out.println("Area c�rculo: " + c1.calcularArea());
		System.out.println("Per�metro do c�rculo: " + c1.calcularPerimetro());

		Retangulo r1 = new Retangulo(5, 4);
		System.out.println("Area ret�ngulo: " + r1.calcularArea());
		System.out.println("Per�metro tri�ngulo: " + r1.calcularPerimetro());

		List<Double> listaArea = new ArrayList<>();

		double areaTotal = 0.0;
		listaArea.add(t1.calcularArea());
		listaArea.add(c1.calcularArea());
		listaArea.add(r1.calcularArea());

		for (double valor : listaArea) {
			areaTotal += valor;
		}

		System.out.println("Area total: " + areaTotal);
	}

}
