package f1;

public class Equipe {
    private String nome;
    private int ano;
    private Patrocinador[] patrocinadores;
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
        this.ano = ano;
    }
    public Patrocinador[] getPatrocinadores() {
        return patrocinadores;
    }
    public void setPatrocinadores(Patrocinador[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }
}
