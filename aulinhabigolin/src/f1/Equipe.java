package f1;

public class Equipe {
    private int MAXPATROCINADORES;
    private String nome;
    private int ano;
    private Patrocinador[] patrocinadores = new Patrocinador[MAXPATROCINADORES];
    private int quantPatrocinador = 0;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano > 1900 && ano < 2023)
            this.ano = ano;
    }
    public Patrocinador[] getPatrocinadores() {
        return patrocinadores;
    }
    public Patrocinador getPatrocinador(int posicao) {
        if (posicao < 0 && posicao >= getQuantPatrocinador()) 
            return null;
        else
            return patrocinadores[posicao];
    }
    public void addPatrocinador(Patrocinador patrocinador) {
        this.patrocinadores[getQuantPatrocinador()] = patrocinador;
        addQuantPatrocinador();
    }
    public int getQuantPatrocinador() {
        return quantPatrocinador;
    }
    public void addQuantPatrocinador() {
        if (quantPatrocinador < MAXPATROCINADORES)
            this.quantPatrocinador++;
    }
    public void removeQuantPatrocinador() {
        if (quantPatrocinador > 0)
            this.quantPatrocinador--;
    }
}
