package poo.model;

public class Circulo implements AreaCalculavel, PerimetroCalculavel {
	private double raio;

	public Circulo() {

	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularPerimetro() {
		return Math.PI * raio * 2;
	}

	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
