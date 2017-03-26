package vencimentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TesteVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 
                                                          500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        
        /**
         * ArrayList para objectos do tipo Trabalhdor
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
    }

    
    /**
     * Método for para percorrer o array através de um ciclo forEach...
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
