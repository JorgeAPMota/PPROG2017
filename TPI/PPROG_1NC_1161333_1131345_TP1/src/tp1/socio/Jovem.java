package tp1.socio;

/**
 * PPROG 0216/2017
 * Trabalho Prático nº1 - TP1
 * 
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 * 
 * @since 26/03/2017
 */
public abstract class Jovem extends Socio {

    public static int getNAULAS_POR_OMISSAO() {
        return NAULAS_POR_OMISSAO;
    }

    public static void setNAULAS_POR_OMISSAO(int aNAULAS_POR_OMISSAO) {
        NAULAS_POR_OMISSAO = aNAULAS_POR_OMISSAO;
    }

     /**
     * Variáveis de instância
     */
    private int nAulas;

    /**
     * Constante de classe
     */
    private static int NAULAS_POR_OMISSAO = 0;
    

    /**
     * Construtor completo para o objecto Sócio Jovem que recebe os seguintes parâmetros:
     * @param identificador
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param nAulas 
     * sendo que envia para a super classe Socio os parâmetros identificador, nome, nContribuinte e anoNascimento
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
     * @return 
     */
    public int getnAulas() {
        return nAulas;
    }

    /**
     * Método de modificação setnAulas que modifica o nº de aulas do objecto
     */
    public void setnAulas(int nAulas) {
        this.nAulas = nAulas;
    }
    
    /**
     * Métodos get abstractos (dado virem a ser implementados nas subclasses) para obter REF_DESCONTO e REF_MENSALIDADE  
     * @return 
     */
    public abstract float getREF_DESCONTO();
    
    public abstract int getREF_MENSALIDADE();
    
    
    /**
     * Método para cálculo da mensalidade a pagar por cada sócio jovem, que tem em conta o facto 
     * de ser ou não dirigente (não paga), nr de aulas, o desconto a que têm direito (REF_DESCONTO),
     * e o valor máximo a pagar de 100€ (REF_MENSALIDADE)
     * @return 
     */
    @Override
    public float calcularMensalidade() {
        float mensalidadeFinal;
        float mensalidade = 25 * nAulas;
        if (getREF_MENSALIDADE()==0) {
            mensalidadeFinal=0;  
        } else if (getREF_MENSALIDADE() != 0 && mensalidade > getREF_MENSALIDADE()) {
            mensalidadeFinal = getREF_MENSALIDADE() - (getREF_MENSALIDADE() * getREF_DESCONTO());
        } else { 
            mensalidadeFinal = mensalidade;
        }
        return mensalidadeFinal;
    }

    /**
     * Método toString que imprime a informação quanto aoa objecto sócio jovem, sendo que
     * vai imprimir da superclasse socio os atributos do memso, e desta classe vai imprimir o nr de aulas 
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s; nºaulas: %d;", super.toString(), nAulas);
    }


    

}
