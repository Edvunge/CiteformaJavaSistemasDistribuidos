public class ExercicioCombinacoes {

    public class Combinacoes {
         double fact(int n) {
            int i;
            double f=1;
            for (i=1; i<=n; i++) {
                f *= i;
            }
            return f;
        }
        public void main(String[] args){

            int n=49, p=6;
            System.out.println("C"+n+","+p+"="+(fact(n)/(fact(p)*fact(n-p))));
        }
    }
}
