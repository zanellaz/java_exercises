package f1;

public class Patrocinador {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if(valor > 0)
            this.valor = valor;
    }
}