public class Exercicio02Ciclo {
    public static void main(String[] args){

                int i, n=17;
                int factI = 1;
                long factL = 1;
                for (i = 1; i<=n; i++) {
                    factI *= i;
                    factL *= i;
                    System.out.printf("%3d!=%15d | %15d%n",i,factI,factL);
                }

    }
}
