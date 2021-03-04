package com.gft.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Imposto ICMS = new ICMS();
        Imposto IPI = new IPI();
        Imposto COFINS = new COFINS();
        Double quantidade = 0.0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe a quantidade a ser calculada:\n");
        quantidade = ler.nextDouble();

        Double valorICMS = ICMS.calculaImposto(quantidade);
        Double valorIPI = IPI.calculaImposto(quantidade);
        Double valorCOFINS = COFINS.calculaImposto(quantidade);
        Double soma = valorCOFINS + valorIPI+ valorICMS;

        System.out.println("Você pagará em ICMS: R$" + ICMS.calculaImposto(quantidade));
        System.out.println("Você pagará em IPI: R$" + IPI.calculaImposto(quantidade));
        System.out.println("Você pagará em COFINS: R$" + COFINS.calculaImposto(quantidade));

        System.out.println("Você pagará um total de : R$" + soma);
    }
}
