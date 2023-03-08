
import javax.swing.JOptionPane;

public class MainInterativo {
    public static void main(String[] args) {
        long terminoCurrent, termino, inicio, inicioCurrent;
        int num = Integer.valueOf(JOptionPane.showInputDialog("Informe o número"));
        inicio = System.nanoTime();
        inicioCurrent = System.currentTimeMillis();
        int i, fatorial = 1;
        String mensagem = "";
        String mensagem2 = "";
        int n1 = 0, n2 = 1;

        for (int qtd = num; qtd > 0; qtd--) {
            System.out.print(n1 + " ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            mensagem += n1 + (num > 1 ? " - " : " - ");
        }

        System.out.print(" x ");

        for (i = num; i >= 1; i--) {
            System.out.print(i + " ");
            fatorial *= i;

            mensagem2 += i + (i > 1 ? " x " : " = ");

        }
        termino = System.nanoTime();
        terminoCurrent = System.currentTimeMillis();
        // tempo de execução

        JOptionPane.showMessageDialog(null, mensagem + "Fibonacci do número " + num);
        System.out.println(" ");
        mensagem2 += fatorial;
        JOptionPane.showMessageDialog(null, mensagem2 + " Fatorial do número " + num);
        System.out.println(" ");

        // Mensagem de execução
        long result = termino - inicio;
        long resultCurrent = terminoCurrent - inicioCurrent;
        // Mensagem de execução
        System.out.print("Tempo em NanoSegundos: " + result + " ");
        System.out.println(" ");

        System.out.print("Tempo em MiliSegunos: " + resultCurrent);
    }
}
