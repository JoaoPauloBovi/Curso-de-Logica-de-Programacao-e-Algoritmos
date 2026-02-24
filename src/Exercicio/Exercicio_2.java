package Exercicio;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Largura: ");
        double largura = entrada.nextDouble();

        System.out.println("Comprimento: ");
        double comprimento = entrada.nextDouble();

        System.out.println("Valor do m2: ");
        double valorm2 = entrada.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorm2;
        System.out.println("Área do terreno: " + area + "m2");
        System.out.printf("Valor do m2: %.2f ", preco);

        entrada.close();
    }
}
