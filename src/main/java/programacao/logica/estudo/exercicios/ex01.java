package programacao.logica.estudo.exercicios;

public class ex01 {
    public static void main(String[] args) {
      /*
      Faça um algoritmo que leia os valores de A, B, C e em seguida
      imprima na tela a soma entre A e B é mostre se a soma é menor que C.
       */

        int valorA = 30;
        int valorB = 20;
        int valorC = 60;
        int result = valorA + valorB;

        if (result < valorC) {
            System.out.println("O valor de A e B é: " + result + ". " + result + " é menor que: " + valorC);
        } else {
            System.out.println(result);
        }

    }
}