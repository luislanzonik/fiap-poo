
package br.com.fiapride.model;

public abstract class Celular {

    // Aula 3 - Encapsulamento
    private String marca;
    private int armazenamento;
    private int bateria;

    private Dono proprietario;

    public Celular(Dono proprietario) {
        this.proprietario = proprietario;
    }

    public Dono getProprietario() {
        return proprietario;
    }

    // Getter e Setter da marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        }
    }

    // Getter e Setter da bateria
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        }
    }

    // Getter e Setter do armazenamento
    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        if (armazenamento >= 0) {
            this.armazenamento = armazenamento;
        }
    }

    public void carregarBateria() {
        if (bateria < 100) {
            this.setBateria(100);
        }
    }

    public void reduzirBateria() {
        if (bateria > 0) {
            this.setBateria(Math.max(0, bateria - 10));
        }
    }

    public void aumentarArmazenamento(int quantidade) {
        if (quantidade > 0) {
            this.setArmazenamento(
                this.armazenamento + quantidade
            );
        }
    }

    public void diminuirArmazenamento(int quantidade) {
        if (quantidade > 0 && armazenamento >= quantidade) {
            this.setArmazenamento(
                this.armazenamento - quantidade
            );
        }
    }

    // Aula 7 - Polimorfismo de Sobrescrita
    public String calcularAutonomia() {
        return "Autonomia não definida para este celular.";
    }

    // Aula 8 - Classes Abstratas
    public abstract String exibirSistemaOperacional();

}
