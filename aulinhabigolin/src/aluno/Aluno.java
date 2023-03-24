package aluno;

public class Aluno {
    private int QUANTNOTAS = 5; 
    private String nomeCompleto;
    private int matricula;
    private double[] notas = new double[QUANTNOTAS];
    private int contNotas = 0;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void alteraNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getMatricula() {
        return matricula;
    }
    public void alteraMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void addNota(double nota) {
        if (contNotas < QUANTNOTAS) {
            notas[contNotas] = nota; 
            addContNota();
        }
        else 
            System.out.println("erro");

    }
    public void addContNota() {
        contNotas++;
    }
    public double calculaMedia() {
        double total = 0;
        for (int i = 0; i < contNotas; i++) {
            total += notas[i];
        }
        return total / contNotas;
    }
}