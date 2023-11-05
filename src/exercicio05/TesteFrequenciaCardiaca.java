package exercicio05;

import java.util.Scanner;

public class TesteFrequenciaCardiaca {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua data de nascimento no formato dd/MM/yyyy:");
        String dataNascimento = scanner.nextLine();

        FrequenciaCardiaca frequenciaCardiaca =
                new FrequenciaCardiaca("Fernanda", "Coutinho", dataNascimento);

        System.out.printf("Idade: %d %nFrequencia Card. Máx.:%d %nFreq. Card. Alvo:%.1f-%.1f",
                frequenciaCardiaca.calculaIdade(), frequenciaCardiaca.frequenciaCardiacaMaxima(),
                frequenciaCardiaca.frequenciaCardiacaAlvo()[0],
                frequenciaCardiaca.frequenciaCardiacaAlvo()[1]);
    }
}