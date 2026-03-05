package Exercicio;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos minutos foram utilizados? ");
        int min = entrada.nextInt();

        double conta = 50.00;

        if (min > 100) {
            // conta = conta + (min - 100) * 2;
            conta += (min - 100) * 2;
        }

        System.out.printf("Valor da conta R$ " + conta);

        entrada.close();
    }
}
