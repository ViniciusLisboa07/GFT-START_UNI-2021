package com.gft.exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Double[] preco = new Double[5];
        Double maior = Double.MIN_VALUE;;
        Double menor = Double.MAX_VALUE;;
        int igual = 0;

        for (int i = 0; i < 5; i++) {
            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe o numero:\n");
            preco[i] = ler.nextDouble();
        }
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++){
                if (preco[i] > maior){
                    maior = preco[i];
                } else if(preco[i] < menor) {
                    menor = preco[i];
                }
            }
        }

        if (maior.equals(menor)){
            System.out.println("Todos os números dados são iguais!");
        } else {
            System.out.println("O maior numero é: " + maior);
            System.out.println("O menor numero é: " + menor);
        }


    }
}
