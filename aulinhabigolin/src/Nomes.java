import javax.swing.JOptionPane;

public class Nomes {
    public static void main(String[] args) {
        int qntNomes = 5;

        String dadoLido;
        String[] nomes = new String[qntNomes];

        for (int i = 0; i < 5; i++) {
            dadoLido = JOptionPane.showInputDialog("Digite o " + (i+1) + " nome");
            nomes[i] = dadoLido;
        }
        
        String temp;
        for (int i = 0; i < qntNomes; i++) {
            for (int j = i + 1; j < qntNomes; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }
        
        String nomesOrdenados = "";
        for (int i = 0; i < qntNomes; i++) {
            nomesOrdenados = nomesOrdenados + nomes[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, nomesOrdenados);
    }
}