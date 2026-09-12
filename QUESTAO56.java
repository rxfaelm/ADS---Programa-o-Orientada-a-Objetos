import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o seu sexo: ");
      String sexo = r.next();
      System.out.println("Digite a sua altura:");
      float altura = r.nextFloat();
      float pesoIdeal=0;
      
      if(sexo.equalsIgnoreCase("F")){
        pesoIdeal = (62.1f*altura) - 44.7f;
        System.out.println("Seu peso ideal é: "+pesoIdeal);
      }else if(sexo.equalsIgnoreCase("M")){
        pesoIdeal = (72.7f*altura) - 58f;
        System.out.println("Seu peso ideal é: "+pesoIdeal);
      } else{
        System.out.println("Sexo inválido");
      }
    }
}