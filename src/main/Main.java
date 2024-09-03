package main;

import entities.Secretaria;

public class Main {

	public static void main(String[] args) {
		
		
		Secretaria secretaria = new Secretaria();
		
		secretaria.matricularAluno();
		System.out.println();
		
		secretaria.analiseEscolar();
		System.out.println();

		secretaria.reMatricularAluno(2);

	}

}
