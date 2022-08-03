package Sessao2;
import javax.swing.JOptionPane;

public class OutrasOperacoes {
    public static void main (String args[]) {
    int a = 17, b = 3;
    JOptionPane.showMessageDialog(null, "a = " + a);
    JOptionPane.showMessageDialog(null, "subtracao: " + (a-b) + "\ndivisao: " + a/b +
    "\nresto: " + a%b);

    double x = 17, y = 3;
    JOptionPane.showMessageDialog(null, "subtracao: " + (x-y) + "\ndivisao: " + String.format("%.3f", x/y) + "\nresto: " + x%y);

    JOptionPane.showMessageDialog(null, "brincando com a caixinha", "titulo da caixinha", JOptionPane.WARNING_MESSAGE);

    


}
}
