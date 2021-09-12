public class ExercicioSwitch {

        public static void main(String args[]) throws java.io.IOException {
            System.out.println("Quer acabar (S/N) ?");
            char c=(char) System.in.read();
            switch (c) {
                case 's':
                case 'S':
                    System.out.println("Respondeu SIM!");
                    break;
                case 'n':
                case 'N':
                    System.out.println("Respondeu NAO!");
                    break;
                default:
                    System.out.println("Resposta invalida!");
                    break;
            }
        }
}
