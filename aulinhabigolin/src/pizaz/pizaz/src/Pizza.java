package pizaz.pizaz.src;

public class Pizza {
    private int MAXINGREDIENTES = 10;
    private Borda borda;
    private Ingrediente[] ingredientes = new Ingrediente[MAXINGREDIENTES];
    private int quantIngredientes = 0;
    private int pesoBase;
    private String nome;
    private double valorBase;
    private char tamanho;

    public Borda getBorda() {
        return borda;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] == null) {
                this.ingredientes[quantIngredientes] = ingrediente;
                return
            }
        }
    }

    public void remove(Ingrediente ingrediente) {
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] == ingrediente) {
                this.ingredientes[i] = null;
            }
        }
    }
    
    public double pesoDosIngredientes() {
        double total = 0;
        for (int i = 0; i < ingredientes.length; i++) {
            total += this.ingredientes[i].getQuantidade();
        }
        return total;
    }

    public double pesoTotal() {
        return pesoDosIngredientes() + this.pesoBase;
    }

    public int getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(int pesoBase) {
        this.pesoBase = pesoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    public double calculaPreco() {
        return valorBase + borda.getValor();
    }

    public int getTotalDeIngredientes() {
        return ingredientes.length;
    }
}
