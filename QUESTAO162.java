
class Paralelepipedo {
    double altura;
    double largura;
    double comprimento;

    Paralelepipedo(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularVolume() {
        return altura * comprimento * largura;
    }

    public double calcularArea() {
        return 2 * (altura * largura
                  + altura * comprimento
                  + largura * comprimento);
    }
}

public class Main {
    public static void main(String[] args) {
        Paralelepipedo objeto = new Paralelepipedo(3, 4, 5);

        System.out.println("Volume: " + objeto.calcularVolume());
        System.out.println("Area: " + objeto.calcularArea());
    }
}
