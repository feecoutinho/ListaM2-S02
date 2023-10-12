package exercicio04;

public class TesteFatura {
    public static void main(String[] args){
        Fatura fatura = new Fatura("123", "Venda de 3 itens",
                3, 36.0);

        System.out.println(fatura.getValorFatura());
    }
}

