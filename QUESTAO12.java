import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      float l, c, area=0;

      System.out.println("Insira a largura:");
      l = r.nextFloat();
      System.out.println("Insira o comprimento:");
      c = r.nextFloat();

      area = l*c;

      System.out.println("Área do terreno: "+area);
    }
}