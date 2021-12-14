package com.poligran.main;

import com.poligran.calculadora.Division;
import com.poligran.calculadora.Multiplicacion;
import com.poligran.calculadora.Resta;
import com.poligran.calculadora.Suma;

public class MainApplication {

	public static void main(String[] args) {
		double numero1 = 10;
		double numero2 = 5;
		
		Suma suma = new Suma(numero1,numero2);
		suma.resultadoEnPantalla();
		
		Resta res = new Resta(numero1,numero2);
		res.resultadoEnPantalla();
		        
		Multiplicacion mul = new Multiplicacion(numero1,numero2);
		mul.resultadoEnPantalla();
		        
		Division div = new Division(numero1,numero2);
		div.resultadoEnPantalla();
	}

}
