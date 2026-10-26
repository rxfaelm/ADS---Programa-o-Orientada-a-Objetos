import java.util.*;


class Forma {
    public double calcularArea() {
        return 0;
    }
}

class Esfera extends Forma {
    double raio;

    Esfera(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        } else {
            this.raio = 0;
        }
    }

    @Override
    public double calcularArea() {
        return 4 * 3.14 * raio * raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * 3.14 * raio * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {

        Forma[] formas = {
            new Esfera(2),
            new Esfera(3),
            new Esfera(5)
        };

        for (int i = 0; i < formas.length; i++) {
            System.out.println(
                "Area: " + formas[i].calcularArea()
            );
        }

        Esfera esfera = new Esfera(2);

        System.out.println(
            "Volume: " + esfera.calcularVolume()
        );
    }
}
