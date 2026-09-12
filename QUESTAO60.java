import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Insira a temperatura da manhã: ");
      float manha = r.nextFloat();
      System.out.println("Insira a temperatura da tarde:");
      float tarde = r.nextFloat();
      System.out.println("Insira a temperatura da noite:");
      float noite = r.nextFloat();
      float maior=manha, menor=manha;

      if(tarde>maior){
        maior = tarde;
      }
      if(noite>maior){
        maior = noite;
      }

      if(tarde<menor){
        menor = tarde;
      }
      
      if(noite<menor){
        menor = noite;
      }

      System.out.println("Maior temperatura: "+maior);
      System.out.println("Menor temperatura: "+menor);

}
}