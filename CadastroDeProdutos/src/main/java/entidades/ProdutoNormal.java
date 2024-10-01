package entidades;

import static java.lang.String.format;

public class ProdutoNormal extends Produto {

    public ProdutoNormal() {

    }

    ;
    
    public ProdutoNormal(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String etiquetaPreco() {
        return "Produto: " + nome
                + "\nPreço: R$" + String.format("%.2f", preco) + "\n";
    }
}
