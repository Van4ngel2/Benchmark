
public class MainRecursivo {
    public static void main(String[] args) {
        MainRecursivo r = new MainRecursivo();
        int resp = r.fatorial(20);
        int respfibonacci = r.fibonacci(20);

        System.out.println("Fibonacci " + respfibonacci);
        System.out.println("Fatorial " + resp);
        System.out.println("");

        long resp2 = r.calculaTempoMili(20);
        System.out.println("");
        long resp3 = r.calculaTempoNano(20);

        System.out.println("Tempo de cálculo em MiliSegundos " + resp2);
        System.out.println("Tempo de cálculo em NanoSegundos " + resp3);
    }

    public Integer fatorial(int x) {

        if (x == 0)
            return 1;

        return x * fatorial(x - 1);
    }

    public Integer fibonacci(int x) {

        if (x <= 2)
            return 1;

        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public long calculaTempoMili(int x) {
        long comeco = System.currentTimeMillis();
        fatorial(x);
        fibonacci(x);
        long fim = System.currentTimeMillis();
        return fim - comeco;
    }

    public long calculaTempoNano(int valor) {
        long inicio = System.nanoTime();
        fatorial(valor);
        fibonacci(valor);
        long termino = System.nanoTime();
        return termino - inicio;
    }

}