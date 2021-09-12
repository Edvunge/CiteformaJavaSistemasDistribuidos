public class Exercicio01Ciclo {

        public static void main(String args[]) {
            long k;
            for (k=1; k<=5; k++)
                System.out.print(k+";");
            System.out.println(".");
            for (k=1; k++<=5; )
                System.out.print(k+";");
            System.out.println(".");
            k=1;
            for ( ; ++k<=5; )
                System.out.print(k+";");
            System.out.println(".");
        }

}
