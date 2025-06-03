package programacao.logica.estudo.exercicios;

public class ex02 {
    public static void main(String[] args) {
        /*
         Faça um algoritmo para receber um número qualquer e imprimir na tela
        se o número é par ou ímpar, positivo ou negativo.
        */

        int number = -52233;

        if (number % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        if (number < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é positivo");
        }


    }
}
