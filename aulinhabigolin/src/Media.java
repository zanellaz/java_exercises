import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        String dadoLido;
        float[] numbers = new float[5];
        float total = 0;
        float media;
        for (int i = 0; i < 5; i++) {
            dadoLido = JOptionPane.showInputDialog("Digite o número " + (i+1));
            numbers[i] = Float.parseFloat(dadoLido);
        }
        for (int i = 0; i < 5; i++) {
            total = total + numbers[i];
        }
        media = total / 5;
        JOptionPane.showMessageDialog(null, "A media é " + media);
    }
}