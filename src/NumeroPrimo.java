public class NumeroPrimo {


    public class Primo {
        public void main(String[] args) {
            /*input de dados*/
            String s= javax.swing.JOptionPane.showInputDialog("Qual o numero?");
            /*converter string para  numero inteiro*/
            int i=Integer.parseInt(s);
            boolean primo;
            if (i<=3) {
                primo=true;
            } else {
                if (i%2==0) {
                    primo=false;
                    System.out.println("2 e' seu divisor!");
                } else {
                    primo=true;
                    int k=3;
                    int max=(int) (java.lang.Math.sqrt(i)+0.5); //arredondar
                    while (k<=max && primo) {
                        if (i%k==0) {
                            System.out.println(k+" e' seu divisor!");
                            primo=false;
                        }
                        k+=2;
                    }
                }
            }
            if (primo) {
                System.out.println("E' primo!!!");
            } else {
                System.out.println("Nao e' primo.");
            }
        }
    }

}
