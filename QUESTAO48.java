import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o seu sexo:");
      String sexo = r.next();

      if(sexo.equals("M")){
        System.out.println("Masculino.");
      } else if(sexo.equals("F")){
        System.out.println("Feminino.");
      } else{
        System.out.println("Resposta inválida.");
      }
    }
}