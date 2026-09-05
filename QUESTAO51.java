import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite o ano que você nasceu:");
      int ano = r.nextInt();
      int idade = 2022 - ano;

      if(idade>=16){
        System.out.println("Você poderá votar nas eleições municipais de 2022.");
      }else{
        System.out.println("Você não poderá votar nas eleições municipais de 2022.");
      }
    }
}