package com.gft.exercicio3;

public abstract class Transporte {
    Carga carga;
    Double valor = carga.getValor();
    Double peso = carga.getPeso();

    public Transporte(Carga carga) {
        this.carga = carga;
    }

    public Double calculaFrete(int distancia) {
        return 0.0;
    }
}
