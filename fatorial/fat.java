import javax.swing.JOptionPane;

public class fat {
    public static void main(String[] args) {
        int num, i, fatorial = 1;
        String mensagem = "";

        num = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero"));

        long inicio = System.nanoTime();
        long inicioCurrent = System.currentTimeMillis();

        for (i = num; i >= 1; i--) {
            fatorial *= i;

            mensagem += i + (i > 1 ? " x " : " = ");

        }
        long termino = System.nanoTime();
        long terminoCurrent = System.currentTimeMillis();
        mensagem += fatorial;
        JOptionPane.showMessageDialog(null, mensagem);
        long result = termino - inicio;
        long resultCurrent = terminoCurrent - inicioCurrent;
        System.out.print("Tempo em NanoSegundos " + result + " ");

        System.out.print("Tempo em MiliSegundos " + resultCurrent);
    }

}