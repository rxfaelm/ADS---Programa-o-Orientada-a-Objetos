import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      float valor;
      float dolar=5.50f;

      System.out.println("Insira um valor em real: ");
      valor = r.nextFloat();

      float conversao=0;
      conversao = valor*dolar;

      System.out.println("Valor em dolar: $"+conversao);
    }
}