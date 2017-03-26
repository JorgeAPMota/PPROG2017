package tp1.socio;

/**
 * PPROG 2016/2017 Trabalho Prático nº1 - TP1
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 26/03/2017
 */
public abstract class Jovem extends Socio {

    private int nAulas;

    private static int NAULAS_POR_OMISSAO = 0;
    private static int valorAula = 25;

    /**
     * Construtor completo para o objecto Sócio Jovem que recebe os seguintes
     * parâmetros:
     *
     * @param identificador
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param nAulas sendo que envia para a super classe Socio os parâmetros
     * identificador, nome, nContribuinte e anoNascimento
     */
    public Jovem(String identificador, String nome, int nContribuinte, int anoNascimento, int nAulas) {
        super(identificador, nome, nContribuinte, anoNascimento);
        this.nAulas = nAulas;
    }

    /**
     * Construtor vazio para o objecto Sócio Jovem
     */
    public Jovem() {
        super();
        this.nAulas = NAULAS_POR_OMISSAO;
    }

    /**
     * Método de acesso getnAulas que retorna o nº de aulas do objecto
     *
     * @return nAulas
     */
    public int getnAulas() {
        return nAulas;
    }

    /**
     * Método de acesso getValorAula que retorna o valor a ser pago por cada
     * aula/mês
     *
     * @return valorAula
     */
    public static int getValorAula() {
        return valorAula;
    }

    /**
     * Método de modificação setnAulas que modifica o nº de aulas do objecto
     *
     * @param nAulas
     */
    public void setnAulas(int nAulas) {
        this.nAulas = nAulas;
    }

    /**
     * Método de modificação setValorAula permite modificar o valor a pagar por
     * cada aula/mês
     *
     * @param valorAula
     */
    public static void setValorAula(int valorAula) {
        Jovem.valorAula = valorAula;
    }

    /**
     * Método get abstracto, que será implementado nas subclasses, para obter
     * REF_DESCONTO
     *
     */
    public abstract float getREF_DESCONTO();

    /**
     * Método get abstracto, que será implementado nas subclasses, para obter
     * REF_MENSALIDADE
     *
     */
    public abstract int getREF_MENSALIDADE();

    /**
     * Método toString que imprime a informação quanto ao objecto sócio jovem,
     * sendo que vai imprimir da superclasse socio os atributos do memso, e
     * desta classe vai imprimir o nr de aulas
     */
    @Override
    public String toString() {
        return String.format("%s; nºaulas: %d;", super.toString(), nAulas);
    }
    
    /**
     * Método para cálculo da mensalidade a pagar por cada sócio jovem, que tem
     * em conta o facto de ser ou não dirigente (não paga), nr de aulas, o
     * desconto a que têm direito (REF_DESCONTO), e o valor máximo a pagar de
     * 100€ (REF_MENSALIDADE)
     *
     * @return mensalidadeFinal
     */
    @Override
    public float calcularMensalidade() {
        float mensalidadeFinal;
        float mensalidade = valorAula * nAulas;
        if (getREF_MENSALIDADE() == 0) {
            mensalidadeFinal = 0;
        } else if (getREF_MENSALIDADE() != 0 && mensalidade > getREF_MENSALIDADE()) {
            mensalidadeFinal = getREF_MENSALIDADE() - (getREF_MENSALIDADE() * getREF_DESCONTO());
        } else {
            mensalidadeFinal = mensalidade;
        }
        return mensalidadeFinal;
    }

    

}
