import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Insira o seu peso: ");
      float peso = r.nextFloat();
      System.out.println("Insira a sua altura:");
      float altura = r.nextFloat();
      float IMC = (peso)/(altura*altura);
      
      if(IMC<18.5){
        System.out.println("Seu IMC é "+IMC+" e você está abaixo do peso.");
      }

      if(IMC>=18.5 && IMC < 25){
        System.out.println("Seu IMC é "+IMC+" e você está com o peso normal.");
      }

      if(IMC>=25 && IMC < 30){
        System.out.println("Seu IMC é "+IMC+" e você está com sobrepeso.");
      }

      if(IMC>=30 && IMC < 35){
        System.out.println("Seu IMC é "+IMC+" e você está obeso leve.");
      }

      if(IMC>=35 && IMC < 40){
        System.out.println("Seu IMC é "+IMC+" e você está obeso moderado.");
      }

      if(IMC>=40){
        System.out.println("Seu IMC é "+IMC+" e você está obeso mórbido.");
      }
}
}