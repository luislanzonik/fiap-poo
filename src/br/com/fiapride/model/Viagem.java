package br.com.fiapride.model;

/** Associação: uma Viagem TEM-UM Passageiro e TEM-UM Veiculo. */
public class Viagem {
    private final Passageiro solicitante;
    private final Veiculo veiculo;
    private final double distanciaKm;
    private final double precoPorKm;
    private boolean concluida;

    public Viagem(Passageiro solicitante, Veiculo veiculo, double distanciaKm) {
        if (solicitante == null || veiculo == null) {
            throw new IllegalArgumentException("Passageiro e veículo são obrigatórios.");
        }
        if (!Double.isFinite(distanciaKm) || distanciaKm <= 0) {
            throw new IllegalArgumentException("Distância inválida.");
        }
        this.solicitante = solicitante;
        this.veiculo = veiculo;
        this.distanciaKm = distanciaKm;
        this.precoPorKm = 2.50; // Tarifa simulada para fins didáticos.
    }

    public double calcularValor() {
        return distanciaKm * precoPorKm;
    }

    public boolean concluir() {
        if (concluida) {
            return false;
        }
        if (solicitante.descontarSaldo(calcularValor())) {
            concluida = true;
            return true;
        }
        return false;
    }

    public String resumo() {
        return solicitante.getNome() + " viajou " + distanciaKm + " km em "
                + veiculo.getModelo() + ". Valor: R$ " + String.format("%.2f", calcularValor());
    }
}
