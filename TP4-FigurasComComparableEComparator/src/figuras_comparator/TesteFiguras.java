package figuras_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteFiguras {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Constru�das ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);

        System.out.println("\n### Figuras Armazenadas no ArrayList (foreach) ###");
        listarForEach(figuras);

        System.out.println("\n###### Ordena��o de Objetos n�o Comparable ######");

        System.out.println("\n\t# Figuras por Ordem Crescente da �rea #");
        Comparator<Figura> criterio1 = new Comparator<Figura>() {

            @Override
            public int compare(Figura f1, Figura f2) {
                double area1 = f1.calcularArea();
                double area2 = f2.calcularArea();

                if (area1 < area2) {
                    return -1;
                } else if (area1 > area2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(figuras, criterio1);
        listarForEach(figuras);

        System.out.println("\n\t# Figuras por Ordem Decrescente da �rea #");
        Comparator<Figura> criterio2 = new Comparator<Figura>() {

            @Override
            public int compare(Figura f1, Figura f2) {
                double area1 = f1.calcularArea();
                double area2 = f2.calcularArea();

                if (area1 > area2) {
                    return -1;
                } else if (area1 < area2) {
                    return 1;
                } else {
                    return 0;
                }
            }

        };
        Collections.sort(figuras, criterio2);
        listarForEach(figuras);

        System.out.println("\n\t# Figuras por Ordem Decrescente da �rea #");
        Collections.sort(figuras, Collections.reverseOrder(criterio1));
        listarForEach(figuras); 
        
    }

    private static void listarForEach(List<Figura> lista) {
        for (Figura figura : lista) {
            System.out.printf("%s �rea: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }

}
