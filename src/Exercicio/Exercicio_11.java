package Exercicio;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int x = entrada.nextInt();
        int soma = 0;

        while (x != 0) {
            // soma = soma + x;
            soma += x;
            x = entrada.nextInt();

        }
        System.out.println(soma);

        entrada.close();
    }
}
