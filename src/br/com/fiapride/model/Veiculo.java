package br.com.fiapride.model;

/** Modelo abstrato para os veículos do FiapRide (aulas 4, 6, 7 e 8). */
public abstract class Veiculo {
    private String placa;
    private final String modelo;
    private double nivelCombustivel;

    protected Veiculo(String placa, String modelo) {
        validarPlaca(placa);
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo inválido.");
        }
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void atualizarPlaca(String novaPlaca) {
        validarPlaca(novaPlaca);
        this.placa = novaPlaca;
    }

    private void validarPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa inválida.");
        }
    }

    public void abastecer(double litros) {
        if (!Double.isFinite(litros) || litros <= 0) {
            throw new IllegalArgumentException("Quantidade de combustível inválida.");
        }
        nivelCombustivel += litros;
    }

    // Comportamento-base da Aula 7: subclasses sobrescrevem a regra.
    public String calcularAutonomia() {
        return "Autonomia não definida para um veículo genérico.";
    }

    // Contrato abstrato da Aula 8: subclasses concretas precisam implementar.
    public abstract void exibirTipo();
}
