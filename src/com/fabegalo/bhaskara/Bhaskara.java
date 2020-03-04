package com.fabegalo.bhaskara;

public class Bhaskara {
	double valorA;
	double valorB;
	double valorC;
	
	public Bhaskara(double valorA, double valorB, double valorC) {
		this.valorA = valorA;
		this.valorB = valorB;
		this.valorC = valorC;
		
		double delta = this.calcDelta();
		
		System.out.println(this.classificacao(delta));
		
		this.calcX(delta);
		
		
	}
	
	public double calcDelta() {
		
		double delta = (this.valorB * this.valorB) - 4 * this.valorA * (this.valorC);
		
		System.out.println(delta);
		
		return delta;
	}
	
	public double calcX(double delta) {
		
		if(delta < 0) {
			return 0;
		}
		
		double x1 = ((-this.valorB) + (Math.sqrt(delta))) / (2 * this.valorA);
		
		double x2 = ((-this.valorB) - (Math.sqrt(delta))) / (2 * this.valorA);
		
		System.out.println(x1 + " | " + x2);
		
		return x1 + x2;
	}
	
	public String classificacao(double delta) {
		if(delta < 0) {
			return "Delta não tem raizes";
		}else if(delta == 0) {
			return "Delta tem 1 Raiz";
		}else if(delta > 0) {
			return "Delta tem 2 Raizes";
		}
		
		return "Indefinido";
	}
}
