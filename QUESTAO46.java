import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite a sua temperatura:");
      float temperatura = r.nextFloat();

      if(temperatura>36.5){
        System.out.println("Está com febre.");
      } else{
        System.out.println("Não está com febre.");
      }
    }
}