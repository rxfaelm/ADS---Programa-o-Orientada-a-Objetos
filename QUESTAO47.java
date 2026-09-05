import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite a sua idade:");
      int idade = r.nextInt();

      if(idade>=18 && idade<=65){
        System.out.println("Compreendida entre 18 e 65 anos.");
      } else{
        System.out.println("Fora da estimativa.");
      }
    }
}