
package br.com.fiapride.model;

public class Android extends Celular {

    private boolean temDigital;

    public Android(Dono proprietario, boolean temDigital) {
        super(proprietario);
        this.temDigital = temDigital;
    }

    public boolean isTemDigital() {
        return temDigital;
    }

    // Aula 7 - Polimorfismo de Sobrescrita
    @Override
    public String calcularAutonomia() {
        double autonomia = this.bateria / 10.0;
        return "Autonomia do Android: " + autonomia + " horas.";
    }

    // Aula 8 - Implementação do método abstrato
    @Override
    public String exibirSistemaOperacional() {
        return "Sistema operacional: Android";
    }

}
