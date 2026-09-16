package br.com.fiapride.model;

public class Celular {

	public String marca;
	public int armazenamento;
	public int bateria;

	private Dono proprietario;

	public Celular(Dono proprietario) {
	    this.proprietario = proprietario;
	}

	public Dono getProprietario() {
	    return proprietario;
	}

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

	public void aumentarArmazenamento(int quantidade) {
	    if (quantidade > 0) {
	        armazenamento = armazenamento + quantidade;
	    }
	}

	public void diminuirArmazenamento(int quantidade) {
	    if (quantidade > 0 && armazenamento >= quantidade) {
	        armazenamento = armazenamento - quantidade;
	    }
	}
}