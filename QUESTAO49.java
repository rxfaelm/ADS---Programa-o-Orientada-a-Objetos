import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o primeiro número:");
      int n1 = r.nextInt();
      System.out.println("Digite o segundo número:");
      int n2 = r.nextInt();

      if(n1>n2){
        System.out.println(n1+" é maior que "+n2);
      }else{
        System.out.println(n2+" é maior que "+n1);
      }
    }
}