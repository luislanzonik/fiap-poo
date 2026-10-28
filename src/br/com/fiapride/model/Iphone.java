
package br.com.fiapride.model;

public class Iphone extends Celular implements Conectavel {

    private boolean temFaceID;

    // Aula 4 - Construtor padrão
    public Iphone() {
        this(new Dono("Não informado", 0), false);
    }

    // Aula 4 - Construtor personalizado
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
        double autonomia = this.getBateria() / 8.0;
        return "Autonomia do iPhone: " + autonomia + " horas.";
    }

    // Aula 8 - Implementação do método abstrato
    @Override
    public String exibirSistemaOperacional() {
        return "Sistema operacional: iOS";
    }

    // Aula 9 - Implementação da interface Conectavel
    @Override
    public String conectar() {
        return "iPhone conectado à rede " + Conectavel.REDE_PADRAO;
    }

}
