package programacao.logica.estudo.exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
        deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos
        deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o valor de (A): ");
        int valorA = scanner.nextInt();
        System.out.println("Insira o valor de (B): ");
        int valorB = scanner.nextInt();
        int valorC;

        if (valorA == valorB) {
            valorC = valorA + valorB;
        } else {
            valorC = valorA * valorB;
        }
        System.out.println("O valor de C é: " + valorC);
        scanner.close();
    }
}
