package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Celular celular = new Celular();
		
		celular.bateria = 50;

		celular.carregarBateria();

		System.out.println("Bateria: " + celular.bateria);

		celular.reduzirBateria();

		System.out.println("Bateria: " + celular.bateria);
		
		System.out.println("Celular criado!");
		
	}

}
