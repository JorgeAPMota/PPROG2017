package tp1.socio;

/**
 * PPROG 2016/2017 Trabalho Prático nº1 - TP1
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 26/03/2017
 */
public class Menor extends Jovem {

    private String nomeEncarregado;
    private String identificador;

    private static final String NOMEENCARREGADO_POR_OMISSAO = "nenhum";
    private static final String TAG = "SMenor-";
    private static float REF_DESCONTO = 0.2f;
    private static int REF_MENSALIDADE = 100;
    private static int contMenor = 0;

    /**
     * Construtor completo para o objecto Menor que recebe os seguintes
     * parâmetros:
     *
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param nomeEncarregado
     */
    public Menor(String nome, int nContribuinte, int anoNascimento, int nAulas, String nomeEncarregado) {
        super(TAG + ++contMenor, nome, nContribuinte, anoNascimento, nAulas);
        this.nomeEncarregado = nomeEncarregado;
        this.identificador = TAG + contMenor;
    }

    /**
     * Construtor vazio/por omissão
     */
    public Menor() {
        super();
        this.nomeEncarregado = NOMEENCARREGADO_POR_OMISSAO;
        ++contMenor;
        this.identificador = TAG + contMenor;
    }

    /**
     * Método de acesso getNomeEncarregado que retorna o nome do encarregado do
     * Menor
     *
     * @return nomeEncarregado
     */
    public String getNomeEncarregado() {
        return nomeEncarregado;
    }

    /**
     * Método de acesso getIdentificador que retorna o identificador do Menor
     *
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
    }
    
    /**
     * implementação do método de acesso getREF_DESCONTO na subclasse
     * retorna o valor de desconto a ser aplicado aos sócios menores
     * 
     * @return REF_DESCONTO
     */
     @Override
    public float getREF_DESCONTO() {
        return REF_DESCONTO;
    }
    
    /**
     * implementação do método de acesso getREF_MENSALIDADE na subclasse
     * retorna o valor de referência da mensalidade a ser aplicado aos sócios menores
     * 
     * @return 
     */
    @Override
    public int getREF_MENSALIDADE() {
        return REF_MENSALIDADE;
    }

    /**
     * Método de modificação setNomeEncarregado que permite a modificação do
     * nome do encarregado
     *
     * @param nomeEncarregado
     */
    public void setNomeEncarregado(String nomeEncarregado) {
        this.nomeEncarregado = nomeEncarregado;
    }

    /**
     * método de modificação que permite modificar o desconto a
     * aplicar os sócios menores
     *
     * @param REF_DESCONTO
     */
    public static void setREF_DESCONTO(float REF_DESCONTO) {
        Menor.REF_DESCONTO = REF_DESCONTO;
    }

    /**
     * método de modificação que permite modificar o valor de
     * referência da mensalidade a ser paga pelos sócios menores
     *
     * @param REF_MENSALIDADE
     */
    public static void setREF_MENSALIDADE(int REF_MENSALIDADE) {
        Menor.REF_MENSALIDADE = REF_MENSALIDADE;
    }

    /**
     * Método de instância toString que retorna e imprime para consola a
     * informação referente ao objecto Menor
     *
     */
    @Override
    public String toString() {
        return String.format("%s; %s encarregado: %s", getIdentificador(), super.toString(), getNomeEncarregado());
    }

}
