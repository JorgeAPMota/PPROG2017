package tp1.socio;

/**
 * PPROG 2016/2017 Trabalho Prático nº1 - TP1
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 26/03/2017
 */
public class Adulto extends Jovem {

    private boolean dirigente;
    private String identificador;

    private static final String TAG = "SAdulto-";
    private static final boolean DIRIGENTE_POR_OMISSAO = false;
    private static final float REF_DESCONTO = 0f;
    private static final int REF_MENSALIDADE2 = 0;
    private static int REF_MENSALIDADE1 = 100;
    private static int contAdulto = 0;

    /**
     * Construtor completo que cria o objecto socio adulto
     *
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param nAulas
     * @param dirigente - True se for dirigente, false se não for
     */
    public Adulto(String nome, int nContribuinte, int anoNascimento, int nAulas, boolean dirigente) {
        super(TAG + ++contAdulto, nome, nContribuinte, anoNascimento, nAulas);
        this.dirigente = dirigente;
        this.identificador = TAG + contAdulto;
    }

    /**
     * Construtor vazio
     */
    public Adulto() {
        super();
        this.dirigente = DIRIGENTE_POR_OMISSAO;
        ++contAdulto;
        this.identificador = TAG + contAdulto;
    }

    /**
     * Método de acesso que retorna o estatuto de dirigente do sócio adulto
     *
     * @return dirigente
     */
    public boolean isDirigente() {
        return dirigente;
    }

    /**
     * Método de acesso que retorna o identificador do sócio adulto
     *
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * método de acesso para consulta do valor referência da mensalidade a ser
     * paga pelos sócios Adultos não dirigentes
     *
     * @return REF_MENSALIDADE1
     */
    public static int getREF_MENSALIDADE1() {
        return REF_MENSALIDADE1;
    }

    /**
     * Método que retorna a mensalidade a ser paga pelo sócio, sendo que no caso
     * do dirigente a mensalidade a pagar será REF_MENSALIDADE2 ( =0 ), caso
     * contrário pagará o valor contido em REF_MENSALIDADE1
     *
     * @return REF_MENSALIDADE
     */
    @Override
    public int getREF_MENSALIDADE() {
        int REF_MENSALIDADE;
        if (dirigente) {
            REF_MENSALIDADE = REF_MENSALIDADE2;
        } else {
            REF_MENSALIDADE = REF_MENSALIDADE1;
        }
        return REF_MENSALIDADE;
    }

    /**
     * Método get que retorna o desconto a ser aplicado aos sócios Adultos (=0)
     *
     * @return REF_DESCONTO
     */
    @Override
    public float getREF_DESCONTO() {
        return REF_DESCONTO;
    }

    /**
     * Método set para alterar o estatuto de dirigente do sócio Adulto
     *
     * @param dirigente
     */
    public void setDirigente(boolean dirigente) {
        this.dirigente = dirigente;
    }

    /**
     * Método set que permite alterar o valor da mensalidade a ser paga pelos
     * sócios Adultos não dirigentes
     *
     * @param REF_MENSALIDADE1
     */
    public static void setREF_MENSALIDADE1(int REF_MENSALIDADE1) {
        REF_MENSALIDADE1 = REF_MENSALIDADE1;
    }

    /**
     * Método toString que imprime a informação referente ao objecto socio
     * adulto, indo inclusive buscar informação à super classe Jovem e
     * imprimindo-a
     */
    @Override
    public String toString() {
        return String.format("%s; %s dirigente: %s", getIdentificador(), super.toString(), isDirigente());
    }
}
