import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite a distância:");
      float distancia = r.nextFloat();
      System.out.println("Digite o tempo de viagem (horas):");
      float tempo = r.nextFloat();
      float media = distancia/tempo;
      
      if(media>110){
        System.out.println("Velocidade média acima de 110 km/h");
      }else{
        System.out.println("Velocidade média não ultrapassou os 110 km/h");
      }
    }
}