public class Exercicio02Vriaveis {
    public static void main(String[] args){

      byte b=3;
      short s;
      int i;
      long l;
      float f=3.0f;
      double d;
      char c='a';
      s=b;
      System.out.println("short=" + s);
      i=s;
      System.out.println("int=" + i);
      i=c;
      System.out.println("int=" + i);
      l=i;
      System.out.println("long=" + l);
      f=i;
      System.out.println("float=" + f);
      f=l;
      System.out.println("float=" + f);
      d=i;
      System.out.println("double=" + d);
      d=l;
      System.out.println("double=" + d);
      d=f;
      System.out.println("double=" + d);


      float x=f+i;
      System.out.println("f="+x);

      int y = (int)f+i;
      System.out.println("i="+y);


      i = 16777217;
      f = i;
      System.out.println(f);
    }
}
