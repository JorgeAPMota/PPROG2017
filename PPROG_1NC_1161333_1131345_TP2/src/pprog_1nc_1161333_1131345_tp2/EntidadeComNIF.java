/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_1nc_1161333_1131345_tp2;

/**
 * PPROG 2016/2017 Trabalho Prático nº2 - TP2
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 17/04/2017
 */
public abstract class EntidadeComNIF extends Entidade {

    private int nif;

    private static final int NIF_POR_DEFEITO = 0;

    /**
     * inicializa o nome, endereço e nif da EntidadeComNif, recebidos por parâmetro
     *
     * @param nome - Atributo nome de objectos de EntidadeComNif que é enviado
     * para a super classe Entidade
     * @param endereco - Atributo endereço de objectos de EntidadeComNif que é
     * enviado para a super classe Entidade
     * @param nif - Atributo nif de objectos de EntidadeComNif
     */
    public EntidadeComNIF(String nome, String endereco, int nif) {
        super(nome, endereco);
        this.nif = nif;
    }

    /**
     * inicializa o nome, endereço e nif da EntidadeComNif, com os valores por omissão
     */
    public EntidadeComNIF() {
        super();
        this.nif = NIF_POR_DEFEITO;
    }

    /**
     * Método de acesso para obter NIF de uma instância
     *
     * @return NIF/nº de contribuinte de uma instância
     */
    public int getNif() {
        return nif;
    }

    /**
     * Método de modificação do NIF de um objecto
     *
     * @param nif - NIF/nº de contribuinte de uma instância
     */
    public void setNif(int nif) {
        this.nif = nif;
    }

    /**
     * Método toString para imprimir o conteúdo do objecto criado em
     * EntidadeComNif
     *
     * @return - string com o conteudo do toString da super classe, e nif
     */
    @Override
    public String toString() {
        return super.toString() + "\n  nif: " + nif;
    }

    /**
     * Método que compara a EntidadecomNif com o objecto (obj) recebido por
     * parâmetro
     *
     * @param obj o objecto que se compara com a EntidadecomNif
     * @return true se o objecto recebido representar uma entidade equivalente à
     * EntidadecomNif. Caso contrário retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        EntidadeComNIF outroEntNIF = (EntidadeComNIF) obj;
        return this.nif == outroEntNIF.nif;
    }
}
