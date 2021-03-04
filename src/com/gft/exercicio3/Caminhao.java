package com.gft.exercicio3;

public class Caminhao extends Transporte{
    public Caminhao(Carga carga) {
        super(carga);
    }

    @Override
    public Double calculaFrete(int distancia) {
        Double valorFrete = 0.0;


        valorFrete = carga.getPeso() * 0.02;
        valorFrete += carga.getValor() * 0.03;
        valorFrete += 2 * distancia;

        if(carga.getValor() > 40000){
            valorFrete = valorFrete - (valorFrete * 0.25);
        }

        return valorFrete;
    }
}
