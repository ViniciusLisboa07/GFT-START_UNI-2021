package com.gft.exercicio2;

import java.text.DecimalFormat;

public class COFINS implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        DecimalFormat formato = new DecimalFormat("#.##");
        double valorImposto = 0;

        if (valor > 12000) {
            valorImposto = valor * 0.04;
        } else if ( valor <= 12000) {
            valorImposto = 0;
        }

        valorImposto = Double.valueOf(formato.format(valorImposto));
        return valorImposto;
    }
}
