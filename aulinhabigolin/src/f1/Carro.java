package f1;

public class Carro {
    Equipe equipe = new Equipe();
    private Piloto piloto = new Piloto();
    private int numero;
    private int posicao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Piloto getPiloto() {
        return this.piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }
    public String getResumo() {
        return "\nPiloto: " + piloto.getNome() + 
        "\nPosição atual: " + getPosicao() +
        "\nPatrocínio 1: " + equipe.getPatrocinadores()[0].getNome() + ", valor: " + equipe.getPatrocinador(0).getValor() +
        "\nPatrocínio 2: " + equipe.getPatrocinadores()[1].getNome() + ", valor: " + equipe.getPatrocinador(1).getValor();
    }
}