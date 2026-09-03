import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      int cavalos, f=4, total=0;

      System.out.println("Insira a quantidade de cavalos:");
      cavalos = r.nextInt();

      total = cavalos*f;

      System.out.println("Quantidade de ferraduras: "+total);
    }
}