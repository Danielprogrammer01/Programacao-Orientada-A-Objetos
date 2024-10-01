package entidades;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {

    private LocalDate dataFabricacao;

    public ProdutoUsado() {

    }

    public ProdutoUsado(String nome, double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {

        return "Nome: " + nome
                + "\nPreço: R$" + String.format("%.2f", preco)
                + "\nData: " + String.format("%02d/%02d/%04d",
                        dataFabricacao.getDayOfMonth(),
                        dataFabricacao.getMonthValue(),
                        dataFabricacao.getYear()) + "\n";
    }

}
