import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      int n1, n2,soma=0;

      System.out.println("Insira o primeiro número: ");
      n1 = r.nextInt();
      System.out.println("Insira o segundo número: ");
      n2 = r.nextInt();
      soma = n1 + n2;

      System.out.println("Soma dos números digitados: "+soma);
    }
}