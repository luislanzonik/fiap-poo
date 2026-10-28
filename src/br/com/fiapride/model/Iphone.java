
package br.com.fiapride.model;

public class Iphone extends Celular {

    private boolean temFaceID;

    public Iphone(Dono proprietario, boolean temFaceID) {
        super(proprietario);
        this.temFaceID = temFaceID;
    }

    public boolean isTemFaceID() {
        return temFaceID;
    }

    // Aula 7 - Polimorfismo de Sobrescrita
    @Override
    public String calcularAutonomia() {
        double autonomia = this.bateria / 8.0;
        return "Autonomia do iPhone: " + autonomia + " horas.";
    }

    // Aula 8 - Implementação do método abstrato
    @Override
    public String exibirSistemaOperacional() {
        return "Sistema operacional: iOS";
    }

}
