package OperadoresAritimedicos;

import java.util.Scanner;

public class AulaUm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, totalEmDias;
		
		System.out.print("Quantidade de dias vividos? ");
		anos = ler.nextInt();
		System.out.print("Informe os meses: ");
		meses = ler.nextInt();
		System.out.print("Informe os dias: ");
		dias = ler.nextInt();
		totalEmDias = (anos * 365) + (meses * 30) + (dias);
		ler.close();
		
		System.out.printf("O total da sua idade em dias � de %d", totalEmDias);
		
	}
}
/*
Fa�a um sistema que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa apenas em dias. 
*/