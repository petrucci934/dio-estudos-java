package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		
		int a,b;
		System.out.println("Digite um número:");
		a = scan.nextInt();
		
		System.out.println("Digite outro número");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma" + soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
	}
	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subtracao (int a, int b) {
		return a - b;
	}
	public static int divisao (int a, int b) {
		return a / b;
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
}
