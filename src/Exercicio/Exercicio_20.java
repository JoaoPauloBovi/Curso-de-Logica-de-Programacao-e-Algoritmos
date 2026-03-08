package Exercicio;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Tamanho do Vetor: ");
        int N = entrada.nextInt();

        int[] vetor = new int[N];
        for (int i = 0; i < N; i++) {
            vetor[i] = entrada.nextInt();

        }
        for (int i = 0; i < N; i++) {
            if (vetor[i] <= 0) {
                System.out.println(vetor[i]);
            }

        }

        entrada.close();
    }
}
