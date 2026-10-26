
class Retangulo {
    double comprimento;
    double largura;

    Retangulo(double comprimento, double largura) {
        if (comprimento >= 0 && largura >= 0) {
            this.comprimento = comprimento;
            this.largura = largura;
        } else {
            this.comprimento = 0;
            this.largura = 0;
        }
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);

        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
    }
}
