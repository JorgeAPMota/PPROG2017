package tp1.socio;

import java.time.Year;

/**
 * PPROG 2016/2017 Trabalho Prático nº1 - TP1
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 26/03/2017
 */
public abstract class Socio {

    private String identificador;
    private String nome;
    private int nContribuinte;
    private int anoNascimento;

    private static final String IDENTIFICADOR_POR_OMISSAO = "Xxxxx-0";
    private static final String NOME_POR_OMISSAO = "nenhum";
    private static final int NCONTRIBUINTE_POR_OMISSAO = 000000000;
    private static final int ANONASCIMENTO_POR_OMISSAO = 0;

    /**
     * Construtor completo para o objecto Sócio que recebe os seguintes
     * parâmetros:
     *
     * @param identificador
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     */
    public Socio(String identificador, String nome, int nContribuinte, int anoNascimento) {
        this.identificador = identificador;
        this.nome = nome;
        this.nContribuinte = nContribuinte;
        this.anoNascimento = anoNascimento;
    }

    /**
     * Construtor vazio
     */
    public Socio() {
        this.identificador = IDENTIFICADOR_POR_OMISSAO;
        this.nome = NOME_POR_OMISSAO;
        this.nContribuinte = NCONTRIBUINTE_POR_OMISSAO;
        this.anoNascimento = ANONASCIMENTO_POR_OMISSAO;

    }

    /**
     * Método de acesso que retorna o nome identificador do sócio
     *
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Método de acesso que retorna o nome do objecto
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso que retorna o nº contribuinte do objecto
     *
     * @return nContribuinte
     */
    public int getnContribuinte() {
        return nContribuinte;
    }

    /**
     * Método de acesso getAnoNAscimento que retorna o ano de nascimento
     *
     * @return anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * Método de modificação da variável nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de modificação da variável nContribuinte
     *
     * @param nContribuinte
     */
    public void setnContribuinte(int nContribuinte) {
        this.nContribuinte = nContribuinte;
    }

    /**
     * Método de modificação da variável anoNascimento
     *
     * @param anoNascimento
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * Método toString que retorna a informação do objecto Sócio
     */
    @Override
    public String toString() {
        return String.format("nome: %s; NIF: %d; ano de nascimento: %d ", nome, nContribuinte, anoNascimento);
    }

    /**
     * Método abstracto (dado vir a ser implementado pelas subclasses
     * calcularMensalidade
     *
     * @return
     */
    public abstract float calcularMensalidade();

    /**
     * Método de cálculo da idade do sócio. Após determinação
     * do anoCorrente através do método now(), da classe nativa Java Year,
     * pertencente ao package java.time, o método getIdade faz a diferença entre
     * o anoCorrente e o ano de nascimento do sócio
     *
     * @return idade
     */
    public int Idade() {
        int anoCorrente = Year.now().getValue();
        int idade = anoCorrente - anoNascimento;

        return idade;
    }
    
    /**
     * Método para percorrer a lista de sócios e apresentar em consola
     *
     * @param listaSocios
     */
    public static void listarSocios(Socio[] listaSocios) {
        System.out.println("\n### Listagem de sócios ###");
        for (int i = 0; i < listaSocios.length; i++) {
            System.out.println(listaSocios[i]);
        }
    }

    /**
     * Método que, a partir do array contendo todos os sócios, cria o array
     * "sociosMenores" contendo todas as instâncias da subclasse Menor. O nº de
     * instâncias de Menor é guardado na variável "j". A partir do array
     * "sociosMenores", é criado o array de Strings "encarregados", contendo os
     * nomes de todos os encarregados. O array "encarregados" é percorrido para
     * contar quantas vezes existe o mesmo encarregado, o nº de repetiçoes de
     * cada nome é guardado em "contEncarregado" e as repetiçoes são apagadas do
     * array. Para cada encarregado é listado o seu nome e nº de vezes que
     * aparece no array = nº de encarregados a seu cargo
     *
     * @param listaSocios
     */
    public static void listarEncarregados(Socio[] listaSocios) {
        System.out.println("\n### Listagem de encarregados e sócios menores a cargo ###");
        /**
         * Arrays para armazenar os nomes dos encarregados e os Menores
         */
        String[] encarregados = new String[listaSocios.length];
        Menor[] sociosMenores = new Menor[listaSocios.length];
        /**
         * j=contador de menores
         */
        int j = 0;
        /**
         * percorre o array de sócios
         */
        for (int i = 0; i < listaSocios.length; i++) {
            /**
             * quando encontra um sócio que pertence à subclasse Menor
             */
            if (listaSocios[i] instanceof Menor) {
                /**
                 * DOWNcast para novo vector de sócios menores
                 */
                sociosMenores[j] = (Menor) listaSocios[i];
                /**
                 * criação de vector só com os nomes dos encarregados, que vai
                 * ser preenchido até j=contador de menores
                 */
                encarregados[j] = sociosMenores[j].getNomeEncarregado();
                j++;
            }
        }
        /**
         * Percorre o array de encarregados até j,para encontrar encarregados
         * repetidos, remove os repetidos e conta quantas vezes aparece cada encarregado
         */
        for (int i = 0; i < j; i++) {
            int contEncarregado = 1;
            for (int k = i + 1; k < j; k++) {
                String encarregado1 = encarregados[i].toLowerCase();
                String encarregado2 = encarregados[k].toLowerCase();
                if (encarregado1.equals(encarregado2)) {
                    contEncarregado++;
                    encarregados[k] = encarregados[k + 1];
                    --k;
                    --j;
                }
            }
            System.out.println("Encarregado " + encarregados[i] + " tem " + contEncarregado + " sócios menores a seu cargo.");
        }
    }

    /**
     * Método que lista todos os sócios e respectivo valor da mensalidade
     *
     * @param listaSocios
     */
    public static void listarSociosMensalidades(Socio[] listaSocios) {
        System.out.println("\n### Listagem de sócios e respectivas mensalidades ###");
        for (int i = 0; i < listaSocios.length; i++) {
            System.out.println(listaSocios[i].toString() + "; mensalidade = " + listaSocios[i].calcularMensalidade() + "€");

        }
    }

    /**
     * Método para contabilizar e listar o total das mensalidades das categorias
     * de sócios Senior e Jovem), e respectivo peso (%) no total das
     * mensalidades
     *
     * @param listaSocios
     */
    public static void listarTotalMensalidades(Socio[] listaSocios) {
        float mensalidadesTotal = 0;
        float mensalidadesJovem = 0;
        float mensalidadesSenior = 0;
        /**
         * percorre o array listaSocios
         */
        for (int i = 0; i < listaSocios.length; i++) {
            /**
             * quando encontra um sócio que pertence à subclasse Jovem adiciona
             * a mensalidade a mensalidadesJovem
             */
            if (listaSocios[i] instanceof Jovem) {
                mensalidadesJovem = mensalidadesJovem + listaSocios[i].calcularMensalidade();
                mensalidadesTotal = mensalidadesTotal + listaSocios[i].calcularMensalidade();
                /**
                 * caso contrário pertencerá à classe Senior
                 */
            } else if (listaSocios[i] instanceof Senior) {
                mensalidadesSenior = mensalidadesSenior + listaSocios[i].calcularMensalidade();
                mensalidadesTotal = mensalidadesTotal + listaSocios[i].calcularMensalidade();
            }
        }
        /**
         * Calcula as percentagens das mensalidade de membros Jovens, e
         * mensalidades de membros Senior face ao total das mensalidades
         */
        float percentJovem = mensalidadesJovem / mensalidadesTotal;
        float percentSenior = mensalidadesSenior / mensalidadesTotal;

        System.out.println("\n### Total Mensalidades ###");
        System.out.format("Total mensalidades sócios jovens = %.1f € - representam %.1f%% do total das mensalidades.%n", mensalidadesJovem, percentJovem);
        System.out.format("Total mensalidades sócios seniores = %.1f € - representam %.1f%% do total das mensalidades.%n", mensalidadesSenior, percentSenior);

    }

}
