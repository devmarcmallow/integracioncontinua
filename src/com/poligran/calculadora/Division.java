package com.poligran.calculadora;

public class Division extends Operacion{
	
	double division = 0;
	
	public Division(double numero1, double numero2) {
		super(numero1, numero2, '/');
		
		if(numero1 == 0 || numero2 == 0) {
			System.out.println("Imposible dividir entre cero");
		} else {
			this.division = numero1 / numero2;
			this.setResultado(this.division);
		}
	}
}
