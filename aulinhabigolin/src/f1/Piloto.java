package f1;

public class Piloto {
    private String nome;
    private int idade;
    private boolean sexo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade > 18 && idade < 100)
            this.idade = idade;
    }
    public boolean isSexo() {
        return sexo;
    }
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}