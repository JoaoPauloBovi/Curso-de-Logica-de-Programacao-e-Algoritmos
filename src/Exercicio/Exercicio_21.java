package Exercicio;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tamanho do Vetor: ");
        int N = entrada.nextInt();

        int[] vetor = new int[N];
        for (int i = 0; i < N; i++) {
            vetor[i] = entrada.nextInt();

        }
        for (int i = 0; i < N; i++) {
            System.out.print(vetor[i] + " ");
        }
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma += vetor[i];
        }
        System.out.println(soma);

        double media = soma / N;
        System.out.println(media);

        entrada.close();
    }
}
