
package br.com.fiapride.model;

public class Android extends Celular implements Conectavel {

    private boolean temDigital;

    // Aula 4 - Construtor padrão
    public Android() {
        this(new Dono("Não informado", 0), false);
    }

    // Aula 4 - Construtor personalizado
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
        double autonomia = this.getBateria() / 10.0;
        return "Autonomia do Android: " + autonomia + " horas.";
    }

    // Aula 8 - Implementação do método abstrato
    @Override
    public String exibirSistemaOperacional() {
        return "Sistema operacional: Android";
    }

    // Aula 9 - Implementação da interface Conectavel
    @Override
    public String conectar() {
        return "Android conectado à rede " + Conectavel.REDE_PADRAO;
    }

}
