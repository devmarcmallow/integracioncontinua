package com.poligran.calculadora;

public class Multiplicacion extends Operacion{
	
	double multiplicacion;
	
	public Multiplicacion(double numero1, double numero2) {
		super(numero1, numero2, '*');
		this.multiplicacion = numero1 * numero2;
		this.setResultado(this.multiplicacion);
	}
}
