package programacao.logica.estudo.exercicios;

public class ex05 {
    public static void main(String[] args) {
//        Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//        calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
//        (Base para o Salário mínimo R$ 1.293,20).

        double salario = 3586.4;
        double salarioMinimo = 1293.20;



        if (salario >= salarioMinimo) {
            double dindin = Math.floor( salario / salarioMinimo);
            System.out.println("Você ganha " + dindin + " salario(s) minimos");
        } else
            System.out.println("Você ganha menos que um salario minimo");
    }
}
