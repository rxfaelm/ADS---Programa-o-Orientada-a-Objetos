import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner r = new Scanner(System.in);
      System.out.println("Digite a idade de Marquinhos: ");
      int i1= r.nextInt();
      System.out.println("Digite a idade de Zezinho: ");
      int i2 = r.nextInt();
      System.out.println("Digite a idade de Luluzinha:");
      int i3 = r.nextInt();

      int auxIdade=i1;

      if(i2>auxIdade){
        auxIdade = i2;
      }

      if(i3>auxIdade){
        auxIdade = i3;
      }

      System.out.println("Maior idade: "+auxIdade);
}
}