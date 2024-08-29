public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;
    public boolean getCategoria;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates,
            int derrotas) {

        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setEmpates(empates);
        setDerrotas(derrotas);
        setCategoria();

    }


    public void apresentar(){

        System.out.println("-------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + nome);
        System.out.println("Diretamente de " + nacionalidade);
        System.out.println("com " + idade + " anos, com " + altura + " metros de altura, pesando " + peso + " Kg");
        System.out.println(vitorias + " vitórias");
        System.out.println(derrotas + " derrotas");
        System.out.println(empates + " empates");
        
    }

        
    public void status(){
        System.out.println(nome + " é um peso " + getCategoria());
        System.out.println("Ganhou " + vitorias + " vezes");
        System.out.println("Perdeu " + derrotas + " vezes");
        System.out.println("Empatou " + empates + " vezes");
    }


    public void ganharLuta(){

        setVitorias(getVitorias() + 1);
        
    }

    public void perderLuta(){

        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta(){

        setEmpates(getEmpates() + 1);

    }


    //Getters e Setters

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    private void setCategoria() {
        
        if (peso <= 57.5f) {

            categoria = "Galo";
            
        } else if (peso <= 64 ) {
            
            categoria = "Pluma";
            
        } else if (peso <= 70) {
            categoria = "Pena";
            
        } else if (peso <= 76) {
            categoria = "Leve";
            
        } else if (peso <= 82.3f) {
            categoria = "Médio";
            
        } else if (peso <= 88.3f) {
            
            categoria = "Meio-Pesado";
        } else{
            
            categoria = "Pesado";
            
        }
    }
    
    public String getCategoria() {
        return categoria;
    
    }


    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    

    



}
