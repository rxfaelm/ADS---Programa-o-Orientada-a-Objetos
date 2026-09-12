import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Insira o seu peso:");
      float peso = r.nextFloat();
      System.out.println("Insira a sua altura:");
      float altura = r.nextFloat();

      if(peso>=50 && peso<60 && altura<1.70){
        System.out.println("Novato");
      }else if(peso>=60 && peso<=80 && altura>=1.70 && altura<1.90){
        System.out.println("Profissional");
      }else{
        System.out.println("Amador");
      }
}
}