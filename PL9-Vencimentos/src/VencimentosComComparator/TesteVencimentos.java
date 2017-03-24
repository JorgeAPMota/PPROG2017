package VencimentosComComparator;

import vencimentos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class TesteVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        /**
         * ArrayList para objectos do tipo Trabalhador
         */
        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);

        /**
         * Utilizando o Comparable, organiza o array por ordem crescente
         */
        System.out.println("### Ordem crescente de trabalhadores de acordo com o vencimento: ###");
        Collections.sort(trabs);
        listar(trabs);

        /**
         * Utilizando o Comparable, organiza o array por ordem decrescente
         */
        System.out.println("### Ordem decrescente de trabalhadores de acordo com o vencimento: ###");
        Collections.sort(trabs, Collections.reverseOrder());
        listar(trabs);

        /**
         * Comparator para ordenar ordenados por ordem crescente (e decrescente)
         * de valor criterio1 = vencimentos criterio2 = Ordem Alfabética
         */
        Comparator<Trabalhador> criterioVencimento = new Comparator<Trabalhador>() {

            @Override
            public int compare() {
                float vencimento1 = this.calcularVencimento();
                float vencimento2 = outroTrabalhador.calcularVencimento();

                if (vencimento1 < vencimento2) {
                    return -1;
                } else if (vencimento1 > vencimento2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        Collections.sort(trabs, criterioVencimento);
        listar(trabs);

        Collections.sort(trabs, Collections.reverseOrder(criterioVencimento));
        /**
         * Método for para percorrer o array através de um ciclo ForEach...
         *
         * @param trabs
         */
    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }
}
