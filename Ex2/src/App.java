public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Invoice inv = new Invoice( 1, "Computador", 1, 5000.50f);
    
        System.out.println("Preço a pagar: R$ " + inv.getInvoiceAmount());
    }


}
