import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Insira o primeiro lado:");
      int a = r.nextInt();
      System.out.println("Insira o segundo lado:");
      int b = r.nextInt();
      System.out.println("Insira o terceiro lado:");
      int c = r.nextInt();

      if(a+b>c && a+c>b && b+c>a){
        if(a == b && b == c){
          System.out.println("Equilátero");
        }else if(a==b || b==c){
          System.out.println("Isósceles");
        }else if(a != b || b!=c){
          System.out.println("Escaleno");
        }
      }else{
        System.out.println("Triângulo inválido");
      }

}
}