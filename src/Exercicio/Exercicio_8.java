package Exercicio;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {

        //Bhaskara

        Scanner entrada = new Scanner(System.in);

        double A, B, C, Delta, r1, r2;

        System.out.println("Digite o valor 1: ");
        A = entrada.nextDouble();

        System.out.println("Digite o valor 2: ");
        B = entrada.nextDouble();

        System.out.println("Digite o valor 3: ");
        C = entrada.nextDouble();

        Delta = Math.pow(B, 2) - 4.0 * A * C;

        if (A == 0 || Delta < 0.0) {
            System.out.println("Impossivel Calcular !");
        } else {
            r1 = (-B + Math.sqrt(Delta)) / (2.0 * A);
            r2 = (-B - Math.sqrt(Delta)) / (2.0 * A);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        entrada.close();
    }
}
