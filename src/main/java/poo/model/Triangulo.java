package poo.model;

public class Triangulo implements AreaCalculavel {
	private double base;
	private double altura;

	public Triangulo() {

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {

		return (base * altura) / 2;
	}
}
