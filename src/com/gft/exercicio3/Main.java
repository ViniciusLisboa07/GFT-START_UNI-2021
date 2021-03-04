package com.gft.exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o peso:\n");
        Double peso = ler.nextDouble();

        System.out.printf("Informe o distancia:\n");
        int distancia = ler.nextInt();

        System.out.printf("Informe o valor:\n");
        Double valor = ler.nextDouble();

        Carga cargaVagao = new Carga(peso, valor);
        Carga cargaCaminhao = new Carga(peso, valor);
        Vagao vagao = new Vagao(cargaVagao);
        Caminhao caminhao = new Caminhao(cargaCaminhao);

        System.out.println(vagao.calculaFrete(distancia));
        System.out.println(caminhao.calculaFrete(distancia));

    }
}
