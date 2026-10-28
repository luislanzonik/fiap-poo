package br.com.fiapride.model;

public class Carro extends Veiculo implements Rastreavel {
    private final int capacidadePassageiros;

    public Carro(String placa, String modelo) {
        super(placa, modelo);
        this.capacidadePassageiros = 4;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou um Carro");
    }

    @Override
    public String calcularAutonomia() {
        double kmRestantes = getNivelCombustivel() * 10.0;
        return "Autonomia: " + kmRestantes + " km (10 km/l).";
    }

    @Override
    public String rastrear() {
        return "Carro monitorado por " + Rastreavel.TECNOLOGIA_PADRAO;
    }
}
