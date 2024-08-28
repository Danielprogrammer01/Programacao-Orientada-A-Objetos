public class Invoice {

    private int numeroItem;
    private String descricao;
    private int quantidade = 0;
    private float precoUnitario = 0.0f;

    public Invoice (int numeroItem, String descricao, int quantidade, float precoUnitario) {
       
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidade(quantidade);
        this.setDescricao(descricao);
        this.setNumeroItem(numeroItem);
       
    }

    public void setQuantidade( int quantidade) {
        if (quantidade < 0 ) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public void setPrecoUnitario(float precoUnitario) {

        if (precoUnitario < 0 ) {
            this.precoUnitario = 0.0f;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

    public void setDescricao( String descricao) {
    
        this.descricao = descricao;
    }

    public void setNumeroItem( int numeroItem) {
        this.numeroItem = numeroItem;
    }
    public double getInvoiceAmount (){

        return this.quantidade * this.precoUnitario;
    }

    
}
