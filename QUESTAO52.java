import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o seu nome:");
      String nome = r.next();
      System.out.println("Digite o seu sexo:");
      String sexo = r.next();
      System.out.println("Digite a sua idade:");
      int idade = r.nextInt();

      if(sexo.equalsIgnoreCase("F") && idade<25){
        System.out.println(nome+" ACEITA.");
      }else{
        System.out.println(nome+" NÃO ACEITA.");
      }
    }
}