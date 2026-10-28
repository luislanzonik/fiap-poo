package br.com.fiapride.model;

public class Moto extends Veiculo implements Rastreavel {
    private boolean eletrica;

    public Moto(String placa, String modelo) {
        super(placa, modelo);
        this.eletrica = false;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    // O exemplo de autonomia em km/l é válido para a moto a combustão.
    @Override
    public String calcularAutonomia() {
        if (eletrica) {
            return "Autonomia elétrica não definida para esta moto.";
        }
        double kmRestantes = getNivelCombustivel() * 35.0;
        return "Autonomia: " + kmRestantes + " km (35 km/l).";
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou uma Moto");
    }

    @Override
    public String rastrear() {
        return "Moto monitorada por " + Rastreavel.TECNOLOGIA_PADRAO;
    }
}
