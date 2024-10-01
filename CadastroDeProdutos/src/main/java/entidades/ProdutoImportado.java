package entidades;

public class ProdutoImportado extends Produto {

    private double taxaAlfandega;

    public ProdutoImportado() {
 
    }

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;

    }

    @Override
    public String etiquetaPreco() {
        double precoFinal = preco + taxaAlfandega;
        return "Produto Importado: " + nome
                + "\nPreço: R$" + String.format("%.2f", precoFinal)
                + "\nTaxa da Alfândega: R$" + String.format("%.2f", taxaAlfandega) + "\n";
    }
}
