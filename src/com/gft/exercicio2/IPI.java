package com.gft.exercicio2;

import java.text.DecimalFormat;

public class IPI implements Imposto{

    @Override
    public double calculaImposto(double valor) {
        DecimalFormat formato = new DecimalFormat("#.##");

        double valorImposto = 0;

        if (valor < 20000) {
            valorImposto = valor * 0.07;
        } else if ( valor >= 20000) {
            valorImposto = valor * 0.19;
        }

        valorImposto = Double.valueOf(formato.format(valorImposto));

        return valorImposto;
    }
}
