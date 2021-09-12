public class Exercicio01Variaveis {
    public static void main(String[] args){


      int a, b, h, o;
      String s;
      a = 2;
      b = 2;
      h = 0x000D;
      o = 011;
      System.out.println("h="+h+"   o="+o);

      System.out.println("h (em binario)=" + Integer.toBinaryString(h));

      s="Total=";
      System.out.println(s + (a + b));

      float f=2.14f;
      double d=3e10;
      char c='a';
      System.out.println("float="+f);
      System.out.println("double="+d);
      System.out.println("char="+c);


    }
}
