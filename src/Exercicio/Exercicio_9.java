package Exercicio;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A, B, C;

        System.out.println("Primeiro número: ");
        A = entrada.nextInt();

        System.out.println("Segundo número: ");
        B = entrada.nextInt();

        System.out.println("Terceiro número: ");
        C = entrada.nextInt();

        if (A < B && A < C) {
            System.out.println("Menor número " + A);

        } else if (B < A && B < C) {
            System.out.println("Menor número " + B);

        } else {
            System.out.println("Menor Número " + C);

        }

        entrada.close();

    }
}
