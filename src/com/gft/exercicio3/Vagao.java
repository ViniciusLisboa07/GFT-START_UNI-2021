package com.gft.exercicio3;

public class Vagao extends Transporte{
    public Vagao(Carga carga) {
        super(carga);
    }


    @Override
    public Double calculaFrete(int distancia) {
        Double valorFrete = 0.0;


        valorFrete = carga.getPeso() * 0.07;
        valorFrete += carga.getValor() * 0.01;
        valorFrete += 0.5 * distancia;

        if(carga.getPeso() < 15.000) {
            valorFrete += 5000;
        }

        return valorFrete;
    }
}
