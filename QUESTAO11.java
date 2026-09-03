import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      float v1, v2, c1=0, c2=0;

      System.out.println("Insira o primeiro valor:");
      v1 = r.nextFloat();
      System.out.println("Insira o segundo valor:");
      v2 = r.nextFloat();

      c1=v1+(v1*0.30f);
      c2=v2-(v2*0.25f);

      System.out.println("O primeiro valor, com acréscimo de 30%:"+c1);
      System.out.println("O segundo valor, com desconto de 25%:"+c2);
    }
}