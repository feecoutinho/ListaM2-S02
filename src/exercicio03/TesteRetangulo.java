package exercicio03;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor para largura:");
        double largura = Double.parseDouble(scanner.nextLine());

        System.out.println("Informe um valor para comprimento:");
        double comprimento = Double.parseDouble(scanner.nextLine());

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Área: %.2f%n", retangulo.area());
    }
}