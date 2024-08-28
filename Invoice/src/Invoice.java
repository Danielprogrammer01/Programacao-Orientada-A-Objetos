public class Invoice {

    private String idItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private float precoUnitario;

    public Invoice(String idItem, String descricaoItem, int quantidadeComprada, float precoUnitario) {

        setIdItem(idItem);
        setDescricaoItem(descricaoItem);

        if (quantidadeComprada > 0) {
            setQuantidadeComprada(quantidadeComprada);
        } else {
            setQuantidadeComprada(0);
        }

        if (precoUnitario > 0) {
            setPrecoUnitario(precoUnitario);
        } else {
            setPrecoUnitario(0.0f);
        }

    }

    public double getInvoiceAmount(float precoUnitario, int quantidadeComprada) {

        return precoUnitario * quantidadeComprada;

    }

    public void imprimirFatura() {
        System.out.println("ITEM: " + descricaoItem);
        System.out.println("ID: " + idItem);
        System.out.println("PREÇO UNITÁRIO: " + precoUnitario);
        System.out.println("QUANTIDADE: " + quantidadeComprada);
        System.out.printf("TOTAL: R$%.2f", getInvoiceAmount(precoUnitario, quantidadeComprada));
    }

    public void setIdItem(String idItem) {

        this.idItem = idItem;

    }

    public String getIdItem() {
        return idItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

}
