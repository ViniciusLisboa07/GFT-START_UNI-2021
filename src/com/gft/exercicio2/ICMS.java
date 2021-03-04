package com.gft.exercicio2;

import java.text.DecimalFormat;

public class ICMS implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        DecimalFormat formato = new DecimalFormat("#.##");
        double valorImposto;
        valorImposto = valor * 0.27;

        valorImposto = Double.valueOf(formato.format(valorImposto));
        return valorImposto;
    }
}
