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
}
