package tp1.socio;

import java.time.Year;

/**
 * PPROG 0216/2017
 * Trabalho Prático nº1 - TP1
 * 
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 * 
 * @since 26/03/2017
 */
public abstract class Socio {

    
    /**
     * Variáveis de instância por omissão
     */
    private String identificador;
    private String nome;
    private int nContribuinte;
    private int anoNascimento;

    /**
     * Constantes por omissão 
     */
    private static final String IDENTIFICADOR_POR_OMISSAO = "Xxxxx-0";
    private static final String NOME_POR_OMISSAO = "nenhum";
    private static final int NCONTRIBUINTE_POR_OMISSAO = 000000000;
    private static final int ANONASCIMENTO_POR_OMISSAO = 0;

    
    /**
     * Construtor completo para o objecto Sócio que recebe os seguintes parâmetros:
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
     * Método de acesso getNome que retorna o nome do objecto
     * @return 
     */
    public String getNome() {
        return nome;
    }

     /**
     * Método de acesso getnContribuinte que retorna o nº contribuinte do objecto
     * @return 
     */
    public int getnContribuinte() {
        return nContribuinte;
    }

    
     /**
     * Método de acesso getAnoNAscimento que retorna o ano de nascimento
     * @return 
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    
     /**
     * Método de acesso getIdade que retorna a idade do sócio.
     * Após determinação do anoCorrente através do método now(), da classe nativa do Java Year, pertencente ao package java.time, 
     * o método getIdade faz a diferença entre o anoCorrente e o ano de nascimento do sócio
     * @return 
     */
    public int getIdade() {
        int anoCorrente = Year.now().getValue();
        int idade = anoCorrente - anoNascimento;

        return idade;
    }

     /**
     * Método de modificação setnome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de modificação setnContribuinte
     */
    public void setnContribuinte(int nContribuinte) {
        this.nContribuinte = nContribuinte;
    }

    /**
     * Método de modificação setnAnoNascimento
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * Método toString que retorna a informação quanto ao objecto Sócio
     * @return 
     */
    @Override
    public String toString() {
        return String.format("nome: %s; NIF: %d; ano de nascimento: %d ", nome, nContribuinte, anoNascimento);
    }

    /**
     * Método abstracto (dado vir a ser implementado pelas subclasses) calcularMensalidade
     * @return 
     */
    public abstract float calcularMensalidade();

    
    /**
     * Método para percorrer a lista de sócios e apresnetar em consola
     * @param listaSocios 
     */
    public static void listarSocios(Socio[] listaSocios) {
        System.out.println("\n### Listagem de sócios ###");
        for (int i = 0; i < listaSocios.length; i++) {
            System.out.println(listaSocios[i]);
        }
    }
/**
 * Método que lista sócios que são encarregados e respectivos menores a cargo
 * @param listaSocios 
 */
    public static void listarEncarregados(Socio[] listaSocios) {
        System.out.println("\n### Listagem de encarregados e sócios menores a cargo ###");
        /**Arrays para armazenar os nomes dos encarregados e os Menores*/
        String[] encarregados = new String[listaSocios.length];
        Menor[] sociosMenores = new Menor[listaSocios.length];
        /**j=contador de menores*/
        int j = 0;
        /**percorre o array de sócios*/
        for (int i = 0; i < listaSocios.length; i++) {
            /**quando encontra um sócio que pertence à subclasse Menor*/
            if (listaSocios[i] instanceof Menor) {
                /**DOWNcast para novo vector de sócios menores*/
                sociosMenores[j] = (Menor) listaSocios[i];
                /**criação de vector só com os nomes dos encarregados, que vai ser preenchido até j=contador de menores*/
                encarregados[j] = sociosMenores[j].getNomeEncarregado();
                j++;
            }
        }
        /**Percorre o array de encarregados até j,para encontrar encarregados repetidos, remove os repetidos e conta quantas vezes aparece cada encarregado*/
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

    public static void listarSociosMensalidades(Socio[] listaSocios) {
        System.out.println("\n### Listagem de sócios e respectivas mensalidades ###");
        for (int i = 0; i < listaSocios.length; i++) {
            System.out.println(listaSocios[i].toString() + "; mensalidade = " + listaSocios[i].calcularMensalidade() + "€");

        }
    }

    /**
     * Método para contabilizar e listar as mensalidades das categorias de sócios
     * 
     * @param listaSocios 
     */
    public static void listarTotalMensalidades(Socio[] listaSocios) {
        float mensalidadesTotal = 0;
        float mensalidadesJovem = 0;
        float mensalidadesSenior = 0;
        /**percorre o array listaSocios*/
        for (int i = 0; i < listaSocios.length; i++) {
            /**quando encontra um sócio que pertence à subclasse Jovem adiciona a mensalidade a mensalidadesJovem*/
            if (listaSocios[i] instanceof Jovem) {
                mensalidadesJovem = mensalidadesJovem + listaSocios[i].calcularMensalidade();
                mensalidadesTotal = mensalidadesTotal + listaSocios[i].calcularMensalidade();
            /**caso contrário pertencerá à classe Senior*/
            } else if (listaSocios[i] instanceof Senior) {
                mensalidadesSenior = mensalidadesSenior + listaSocios[i].calcularMensalidade();
                mensalidadesTotal = mensalidadesTotal + listaSocios[i].calcularMensalidade();
            }
        }
        /**Calcula as percentagens das mensalidade de membros Jovens, e mensalidades de membros 
         * Senior face ao total das mensalidades*/
        float percentJovem = mensalidadesJovem / mensalidadesTotal;
        float percentSenior = mensalidadesSenior / mensalidadesTotal;
        
        System.out.println("\n### Total Mensalidades ###");
        System.out.format("Total mensalidades sócios jovens = %.1f € - representam %.1f%% do total das mensalidades.%n", mensalidadesJovem, percentJovem);
        System.out.format("Total mensalidades sócios seniores = %.1f € - representam %.1f%% do total das mensalidades.", mensalidadesSenior, percentSenior);

    }

//    /**
//     * Método para validar a idade do sócio,
//     * Após esclarecimento do enunciado verificou-se que este método é 
//     * para já desnecessário, e a validaç~seo seria apenas via a construção 
//     * de objectos de idade adequada ao tipo de objecto/sócio em questão
//     */
//    private void validaIdade() {
//        if (getIdade() < 18) {
//            System.out.println("Menor");
//        } else if (getIdade() > 60) {
//            System.out.println("Senior");
//        }
//            else System.out.println("Adulto");
//    }

}
