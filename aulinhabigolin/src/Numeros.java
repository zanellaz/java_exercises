import javax.swing.JOptionPane;

public class Numeros {
    public static void main(String[] args) {
        String dadoLido = JOptionPane.showInputDialog("Digite um número");
        int num = Integer.parseInt(dadoLido);
        int antecessor =  num - 1;
        int sucessor =  num + 1;
        JOptionPane.showMessageDialog(null, "Antecessor " + antecessor + ", Sucessor " + sucessor);
    }
}