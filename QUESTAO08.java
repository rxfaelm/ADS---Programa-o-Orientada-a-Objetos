import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      int n;

      System.out.println("Insira um número inteiro: ");
      n = r.nextInt();

      int cubo=0;
      cubo = n*n*n;

      System.out.println("O cubo do número inserido é: "+cubo);
    }
}