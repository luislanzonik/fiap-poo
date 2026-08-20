package br.com.fiapride.model;

public class Celular {
	
	public String marca;
	public int armazenamento;
	public int bateria;
	
	public void carregarBateria() {
		if (bateria < 100) {
			bateria = 100;
		}
	}
	
	public void reduzirBateria() {
		if (bateria > 0) {
			bateria = bateria - 10; 
		}
	}

}
