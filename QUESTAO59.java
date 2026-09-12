import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Insira o dia da semana: ");
      int dia = r.nextInt();
      System.out.println("Insira a sua idade:");
      int idade = r.nextInt();
      System.out.println("Insira o preço base do ingresso:");
      float precoBase = r.nextFloat();
      float valor = 0;

      if(idade<14){
        if(dia!=3){
          valor = precoBase/2;
          System.out.println("Valor a pagar: "+valor);
        } else if(dia == 3){
          valor = precoBase/4;
          System.out.println("Valor a pagar: "+valor);
        } else if(dia>7 || dia<0){
          System.out.println("Dia inválido");
        }
      }

      if(idade>=14){
        if(dia==3){
          valor = precoBase/2;
          System.out.println("Valor a pagar: "+valor);
        } else if(dia != 3){
          valor = precoBase;
          System.out.println("Valor a pagar: "+valor);
        } else if(dia>7 || dia<0){
          System.out.println("Dia inválido");
        }
      }
}
}