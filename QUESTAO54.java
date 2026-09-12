import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o primeiro número");
      int n1 = r.nextInt();
      System.out.println("Digite o segundo número");
      int n2 = r.nextInt();

      if(n1>n2){
        System.out.println("Maior número: "+n1);
      }else if(n2>n1){
        System.out.println("Maior número: "+n2);
      }else if(n1==n2){
        System.out.println("Números iguais! Insira dois números diferentes.");
      }
    }
}