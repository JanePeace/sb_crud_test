package com.tapir.app.objetos;

import com.tapir.app.jpa.model.Tapir;

public class ParejaTapires {

    private Tapir tapirPrimero;
    private Tapir tapirSegundo;
    private int anos;

    public Tapir getTapirPrimero() {
        return tapirPrimero;
    }

    public void setTapirPrimero(Tapir tapirPrimero) {
        this.tapirPrimero = tapirPrimero;
    }

    public Tapir getTapirSegundo() {
        return tapirSegundo;
    }

    public void setTapirSegundo(Tapir tapirSegundo) {
        this.tapirSegundo = tapirSegundo;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }
}
