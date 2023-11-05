package exercicio06;

import java.util.Scanner;

public class TestePerfilDeSaude {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg:");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite sua altura em m:");
        double altura = Double.parseDouble(scanner.nextLine());

        PerfilDeSaude perfilDeSaude = new PerfilDeSaude("Fernanda", "Coutinho", "25/12/1992",
                "", altura, peso);

        System.out.println(perfilDeSaude.imc());
    }
}