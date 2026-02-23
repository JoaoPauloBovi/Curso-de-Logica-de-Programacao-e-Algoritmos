package Exercicio;

public class Exercicio_1 {
    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Mesa do Computador";

        int idade = 30;
        int codigo = 5290;
        char genero = 'M';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double decimais = 53.234567;

        System.out.println();
        System.out.printf("Produtos: " + "%n" + "%s com o preco de %.2f", produto1, preco1);
        System.out.printf("Produtos: " + "%n" + "%s com o preco de %.2f%n", produto2, preco2);
        System.out.println(" ");

        System.out.printf("Pessoa: " + "%n" + "Gênero: %s, codigo: %d, idade: %d anos%n", genero, codigo, idade);
        System.out.println(" ");

        System.out.println("Decimais:");

        System.out.println("Número decimais: " + decimais);
        System.out.printf("Número decimais: %.3f", decimais);

    }
}
