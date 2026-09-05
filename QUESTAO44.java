import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite sua idade:");
      int idade = r.nextInt();

      if(idade>=18){
        System.out.println("Você é maior de idade.");
      } else{
        System.out.println("Você é menor de idade.");
      }
    }
}