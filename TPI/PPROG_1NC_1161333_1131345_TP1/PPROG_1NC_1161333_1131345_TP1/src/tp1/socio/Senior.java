package tp1.socio;

/**
 * PPROG 2016/2017 Trabalho Prático nº1 - TP1
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 26/03/2017
 */
public class Senior extends Socio {

    private boolean dirigente;
    private String identificador;

    private static boolean DIRIGENTE_POR_OMISSAO = false;
    private static int contSenior = 0;
    private static int REF_MENSALIDADE1 = 150;
    private static float REF_DESCONTO = 0.1f;
    private static final int REF_MENSALIDADE2 = 0;
    private static final String TAG = "SSenior-";

    /**
     * Construtor completo para o objecto Senior que recebe os seguintes
     * parâmetros:
     *
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param dirigente (boolean, true ou false)
     */
    public Senior(String nome, int nContribuinte, int anoNascimento, boolean dirigente) {
        super(TAG + ++contSenior, nome, nContribuinte, anoNascimento);
        this.identificador = TAG + contSenior;
        this.dirigente = dirigente;
    }

    /**
     * Construtor vazio/por omissão
     */
    public Senior() {
        super();
        ++contSenior;
        this.identificador = TAG + contSenior;
        this.dirigente = DIRIGENTE_POR_OMISSAO;
    }

    /**
     * Método de acesso getIdentificador que retorna o idientificador do objecto
     * Senior
     *
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Método isDirigente que retorna se o objecto Senior é ou não dirigente
     *
     * @return dirigente
     */
    public boolean isDirigente() {
        return dirigente;
    }

    /**
     * Método de acesso que retorna o valor de desconto a aplicar aos sócios
     * séniores
     *
     * @return REF_DESCONTO
     */
    public float getREF_DESCONTO() {
        return REF_DESCONTO;
    }

    /**
     * Método de acesso que retorna o valor de referência da mensalidade a ser
     * paga pelos sócios séniores não dirigentes
     *
     * @return REF_MENSALIDADE1
     */
    public static int getREF_MENSALIDADE1() {
        return REF_MENSALIDADE1;
    }

    /**
     * Método de acesso que retorna o valor referência da mensalidade a pagar
     * consoante o estatuto de dirigente do sócio em questão
     *
     * @return REF_MENSALIDADE
     */
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
     * Método de modificação do estatuto de dirigente
     *
     * @param dirigente
     */
    public void setDirigente(boolean dirigente) {
        this.dirigente = dirigente;
    }

    /**
     * Método de modificação setREF_MENSALIDADE que permite alterar o valor de
     * referência para a mensalidade dos sócios Senior
     *
     * @param REF_MENSALIDADE1
     */
    public static void setREF_MENSALIDADE1(int REF_MENSALIDADE1) {
        Senior.REF_MENSALIDADE1 = REF_MENSALIDADE1;
    }

    /**
     * Método de modificação setREF_DESCONTO que permite alterar o valor de
     * desconto a aplicar aos sócios Senior
     *
     * @param REF_DESCONTO
     */
    public static void setREF_DESCONTO(float REF_DESCONTO) {
        Senior.REF_DESCONTO = REF_DESCONTO;
    }

    /**
     * Método de instância toString que retorna os sócios seniores e imprime a
     * informação refente aos mesmos
     *
     */
    @Override
    public String toString() {
        return String.format("%s; %s; dirigente: %s", getIdentificador(), super.toString(), isDirigente());
    }

    /**
     * Método de classe para cálculo da mensalidade final de cada sócio,
     * considerando se o sócio é ou não dirigente. No caso de não ser dirigente,
     * calcula a mensalidade tendo em conta o desconto a aplicar de acordo com a
     * idade/nº de décadas
     *
     * @return mensalidadeFinal
     */
    @Override
    public float calcularMensalidade() {
        float mensalidadeFinal = 0;
        if (getREF_MENSALIDADE() == 0) {
            mensalidadeFinal = 0;
        } else if (getREF_MENSALIDADE() != 0) {
            mensalidadeFinal = getREF_MENSALIDADE() - (getREF_MENSALIDADE() * REF_DESCONTO * calcularDecada());
        }
        return mensalidadeFinal;
    }

    /**
     * Método de classe para cálculo do nº de décadas de idade de cada sócio
     *
     * @return decada
     */
    public int calcularDecada() {
        int decada = Idade() % 10;
        return decada;
    }

}
