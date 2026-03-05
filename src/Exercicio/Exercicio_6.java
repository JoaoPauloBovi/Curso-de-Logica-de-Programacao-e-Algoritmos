package Exercicio;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Que horas são ? ");
        double x = entrada.nextInt();


        if (x <= 11) {
            System.out.println("Bom dia !");

        } else if (x < 18) {
            System.out.println("Boa tarde");

        } else {
            System.out.println("Boa noite");
        }

    }
}
