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
public class Menor extends Jovem {
    private String nomeEncarregado;
    private String identificador;
    
    private static int contMenor = 0;
    private static String NOMEENCARREGADO_POR_OMISSAO = "nenhum";
    private static float REF_DESCONTO = 0.2f;
    private static int REF_MENSALIDADE = 100;
    private static String TAG = "SMenor-";
 
  
    
     /**
     * Construtor completo para o objecto Menor que recebe os seguintes
     * parâmetros:
     * @param nome
     * @param nContribuinte
     * @param anoNascimento
     * @param nomeEncarregado 
     */
    public Menor (String nome, int nContribuinte, int anoNascimento, int nAulas, String nomeEncarregado) {
        super (TAG+ ++contMenor,nome, nContribuinte, anoNascimento, nAulas);
        this.nomeEncarregado = nomeEncarregado;
        this.identificador= TAG + contMenor;       
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
    
     @Override
    public int getREF_MENSALIDADE() {
        return REF_MENSALIDADE;
    }
    
     @Override
    public float getREF_DESCONTO() {
        return REF_DESCONTO;
    }
    
    /**
     * Método de acesso getNomeEncarregado que retorna o nome do encarregado do Menor
     * @return 
     */
    public String getNomeEncarregado() {
        return nomeEncarregado;
    }
    
    
     /**
     * Método de acesso getIdentificador que retorna o identificador do Menor
     * @return 
     */ 
   public String getIdentificador() {
        return identificador;
       }

     /**
     * Método de modificação setNomeEncarregado
     * @return
     */
    public void setNomeEncarregado(String nomeEncarregado) {
        this.nomeEncarregado = nomeEncarregado;
    }

       
     /**
     * Método de instância toString que retorna e imprime para consola a informação referente ao objecto Menor
     * @return
     */   
    @Override
    public String toString() {
        return String.format("%s; %s encarregado: %s",getIdentificador(),super.toString(), getNomeEncarregado());
    }

   

  
}
