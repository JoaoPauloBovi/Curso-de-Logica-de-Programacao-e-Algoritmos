package Exercicio;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, notaf;

        System.out.println("Nota do primeiro semestre: ");
        nota1 = entrada.nextDouble();

        System.out.println("Nota do segundo semestre: ");
        nota2 = entrada.nextDouble();

        notaf = nota1 + nota2;

        if (notaf > 60) {
            System.out.println("Nota Final: " + notaf + " Aprovado !");
        } else {
            System.out.println("Nota Final: " + notaf + " Reprovado");
        }
    }
}
