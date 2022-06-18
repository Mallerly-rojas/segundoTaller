import javax.swing.*;

public class PesosAbolibares {
    public static void main(String[] args) {
        double pesos= 0;
        double bolivares= 0.0014;
        double total=0;

        pesos=Double.parseDouble(JOptionPane.showInputDialog(" ingrese una cantidad en pesos"));

        total= pesos * bolivares;

        JOptionPane.showMessageDialog(null, pesos  +" pesos en bolivares son: " + total);

    }

}
