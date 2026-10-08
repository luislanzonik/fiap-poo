
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
}
