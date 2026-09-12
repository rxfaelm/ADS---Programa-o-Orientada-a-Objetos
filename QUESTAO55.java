import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o primeiro número");
      int n1 = r.nextInt();
      System.out.println("Digite o segundo número");
      int n2 = r.nextInt();
      System.out.println("Digite o terceiro número");
      int n3 = r.nextInt();

      if(n1+n2>n3 && n1+n3>n2 && n2+n3>n1){
        System.out.println("Os três números formam um triângulo!");
      } else{
        System.out.println("Os números não formam um triângulo.");
      }
    }
}