import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      float salario, aumento=0.15f;

      System.out.println("Insira o seu salário: ");
      salario= r.nextFloat();

      float calculo = 0;
      calculo = (salario+(salario*aumento));

      System.out.println("Com o aumento de 15%, seu salário passa a ser R$"+calculo);

    }
}