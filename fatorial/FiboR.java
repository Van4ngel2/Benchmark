
public class FiboR {
    public static void main(String[] args) {
        FiboR r = new FiboR();
        int resp = r.fibonacci(20);
        long resp2 = r.calculaTempo(20);
        long resp3 = r.calculaTempoNano(20);
        System.out.println(resp);
        System.out.println(resp2);
        System.out.println(resp3);
    }

    public Integer fibonacci(int x) {

        if (x <= 2)
            return 1;

        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public long calculaTempo(int x) {
        long comeco = System.currentTimeMillis();
        fibonacci(x);
        long fim = System.currentTimeMillis();
        return fim - comeco;
    }

    public long calculaTempoNano(int valor) {
        long inicio = System.nanoTime();
        fibonacci(valor);
        long termino = System.nanoTime();
        return termino - inicio;
    }

}