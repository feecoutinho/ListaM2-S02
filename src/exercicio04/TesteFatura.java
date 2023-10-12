package exercicio04;

public class TesteFatura {
    public static void main(String[] args){
        Fatura fatura = new Fatura("123", "Venda de 5 itens",
                5, 21.0);

        System.out.println(fatura.getValorFatura());
    }
}

