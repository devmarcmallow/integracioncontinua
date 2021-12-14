package com.poligran.calculadora;

public class Suma extends Operacion{
	
	double suma;
	
	public Suma(double numero1, double numero2) {
		super(numero1, numero2, '+');
		this.suma = numero1 + numero2;
		this.setResultado(suma);
	}
}
