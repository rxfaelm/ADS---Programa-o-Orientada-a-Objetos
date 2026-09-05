import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite uma letra:");
      String letra = r.next();

      if(letra.equals("A") || letra.equals("E") || letra.equals("I")|| letra.equals("O") || letra.equals("U")){
        System.out.println("É uma vogal.");
      }else{
        System.out.println("É uma consoante.");
      }
    }
}