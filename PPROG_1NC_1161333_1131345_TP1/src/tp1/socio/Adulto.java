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
public class Adulto extends Jovem {

    /**
     * Variáveis de classe
     */
    private static int contAdulto = 0;
    private static final String TAG = "SAdulto-";

    /**
     * Constantes de classe
     */
    private static final boolean DIRIGENTE_POR_OMISSAO = false;
    private static float REF_DESCONTO = 0f;
    private static int REF_MENSALIDADE1 = 100;
    private static int REF_MENSALIDADE2 = 0;

    
    /**
     * Variáveis de instância
     */
    private boolean dirigente;
    private String identificador;
    

    /**
     * Construtor completo que cria o objecto socio adulto
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param nAulas
     * @param dirigente - True se for dirigente, false se não for
     */
     public Adulto(String nome, int nContribuinte, int anoNascimento, int nAulas, boolean dirigente) {
        super (TAG+ ++contAdulto, nome, nContribuinte, anoNascimento, nAulas);
        this.dirigente = dirigente;
        this.identificador =  TAG + contAdulto;
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
     * Método "get" que vai retornar a mensalidade a pagar pelo sócio,
     * sendo que no caso do dirigente a mensalidade a pagar será REF_MENSALIDADE2 ( =0 ), 
     * caso contrário pagará o valor em REF_MENSALIDADE1
     * @return 
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
     * Método get que retorna REF_DESCONTO
     * @return REF_DESCONTO
     */
    @Override
    public float getREF_DESCONTO() {
        return REF_DESCONTO;
    }
    
     /**
     * Método get que retorna o identificador de cada sócio adulto
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
       }

    /**
     * Métodos set para alterar o objecto/sócio adulto no caso de ser dirigente
     */
    public void setDirigente(boolean dirigente) {
        this.dirigente = dirigente;
    }

    public static void setContAdulto(int aContAdulto) {
        contAdulto = aContAdulto;
    }

    public static void setREF_DESCONTO(float aREF_DESCONTO) {
        REF_DESCONTO = aREF_DESCONTO;
    }

    public static void setREF_MENSALIDADE1(int aREF_MENSALIDADE1) {
        REF_MENSALIDADE1 = aREF_MENSALIDADE1;
    }

    public static void setREF_MENSALIDADE2(int aREF_MENSALIDADE2) {
        REF_MENSALIDADE2 = aREF_MENSALIDADE2;
    }
   
    
    /**
     * Método toString que imprime a informação referente ao objecto socio adulto, indo 
     * inclusive buscar informação (toString) à super classe Jovem e imprimindo-a
     * @return 
     */
       @Override
    public String toString() {
        return String.format("%s; %s dirigente: %s",getIdentificador() ,super.toString(), isDirigente());
    }
        
     /**
     * Método get que retorna o identificador de cada sócio adulto
     * @return dirigente
     */
    public boolean isDirigente() {
        return dirigente;
    }
    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

   

   

}
