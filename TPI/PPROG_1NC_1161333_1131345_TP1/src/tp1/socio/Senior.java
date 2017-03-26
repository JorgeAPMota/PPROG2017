package tp1.socio;

/**
 * PPROG 0216/2017 Trabalho Prático nº1 - TP1
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 26/03/2017
 */
public class Senior extends Socio {

    private static int contSenior = 0;

    /**
     * Variáveis de instância
     */
    private boolean dirigente;
    private boolean DIRIGENTE_POR_OMISSAO = false;

    /**
     * Variáveis de classe
     */
    private static int REF_MENSALIDADE1 = 150;
    private static int REF_MENSALIDADE2 = 0;

    private static float REF_DESCONTO = 0.1f;
    private String identificador;
    private static String TAG = "SSenior-";

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
     * Método de acesso getMensalidade que retorna a constante de mensalidade apropriada caso o objecto Senior seja
     * ou não dirigente
     * @return 
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
     * Método de acesso getREF_DESCONTO que retorna a REF_DESCONTO
     * @return 
     */
    public float getREF_DESCONTO() {
        return REF_DESCONTO;
    }

     /**
     * Método de acesso getIdentificador que retorna o idi«entificador do objecto Senior
     * @return 
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Método de modificação setDirigente
     * @return
     */
    public void setDirigente(boolean dirigente) {
        this.dirigente = dirigente;
    }

    /**
     * Método de instância toString que retorna os dirigentes e imprime a informação refente
     * aos mesmos
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s; %s; dirigente: %s", getIdentificador(), super.toString(), isDirigente());
    }

    /**
     * Método de classe para cálculo da mensalidade final de cada sócio, sondirenado se é
     * ou não dirigente, desconto a que tem direito de acordo com a idade/nº de
     * décadas que tem
     * @return
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
     * Método de classe para cálculo do nº de décadas de cada sócio
     * @return
     */
    public int calcularDecada() {
        int decada = getIdade() % 10;
        return decada;
    }
    
     /**
     * Método isDirigente que retorna se o objecto Senior é ou não dirigente
     * @return
     */
    public boolean isDirigente() {
        return dirigente;
    }

}
