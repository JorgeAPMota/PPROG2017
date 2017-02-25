package ex_cumprimentar;

/**
 *
 * @author Jorge Mota
 */

/**Alínea 2*/
public class Pessoa {
    
    private String nome; 
    private int idade;
    
    private static final String NOME_POR_OMISSAO = "Sem nome";
    
    /**Constructor vazio*/
    public Pessoa (){
        nome = NOME_POR_OMISSAO;
    }
    
    /**Constructor com o parâmetro nome*/
    public Pessoa(String nome){
        this.nome = nome;    
    }

    /**Constructor com os parâmetros nome e idade
     * @param nome
     * @param idade*/
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade; 
    }
    
    /**Método de consulta/get do nom
     * @return e*/
    public String getNome(){
        return nome;
    }
    
    /**Método de consulta/get da idad
     * @return e*/
    public int getIdade(){
        return idade;
    }
    
    /**Método de modificação/set do nom
     * @param nome*/
    public void setNome(String nome){
        this.nome=nome;       
    }
    
    /**Método de modificação/set da idad
     * @param idade*/
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    /**Método toString que devolve a representação interna do objecto pesso
     * @return a*/
    public String toString(){
    return "O/A" + nome + "tem" +idade+ "anos."; 
    
    }
    
}
