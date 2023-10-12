package exercicio02;

import java.util.Scanner;

public class TesteCadastro {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite seu cpf:");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu e-mail:");
        String email = scanner.nextLine();


        System.out.printf("O nome do usuário é %s %s %n", nome, sobrenome);

    }
}
