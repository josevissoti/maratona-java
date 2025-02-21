package academy.devdojo.maratonajava.javacore.Qstring.view;

public class StringPerformanceView01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        stringConcat(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para execução do método concat: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        stringBuilderConcat(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para execução do método concat: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        stringBufferConcat(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para execução do método concat: " + (fim - inicio) + "ms");
    }

    public static void stringConcat(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void stringBuilderConcat(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    public static void stringBufferConcat(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
