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
public class Restaurante extends EntidadeComNIF implements ServicoPrecoMedio, ServicoRestaurante {

    private float precoMedio;
    private int tipoComida;

    private static final int PRECO_MEDIO_POR_OMISSAO = 0;

    /**
     * Constructor completo para instâncias de Restaurante
     *
     * @param nome - Atributo nome de objectos de Restaurante que é enviado para
     * a super classe EntidadecomNif
     * @param endereco - Atributo endereço de objectos de Restaurante que é
     * enviado para a super classe EntidadecomNif
     * @param nif - Atributo de Restaurante com nº de contribuinte como String
     * @param precoMedio - Preço médio por pessoa de uma instãncia de
     * Restaurante
     * @param tipoComida - Tipo de comida/cozinha de uma instãncia de
     * Restaurante
     */
    public Restaurante(String nome, String endereco, int nif, float precoMedio, int tipoComida) {
        super(nome, endereco, nif);
        this.precoMedio = precoMedio;
        this.tipoComida = tipoComida;
    }

    /**
     * Constructor vazio de Restaurante
     */
    public Restaurante() {
        super();
        this.precoMedio = PRECO_MEDIO_POR_OMISSAO;
        this.tipoComida = COZINHA_TRADICIONAL_PORTUGUESA;
    }

    
    /**
     * Método de acesso que retorna o tipo de comida/cozinha de um restaurante
     * @return 
     */
    public int getTipoComida() {
        return tipoComida;
    }

    /**
     * Método de acesso que obtém o tipo de cozinha do restaurante escrito por extenso de
     * acardo com a selecção de um nª
     */
    private String getTipoComidaExtenso() {
        if (tipoComida == 1) {
            return "Cozinha tradicional Portuguesa";
        }
        if (tipoComida == 2) {
            return "Cozinha Italiana";
        }
        if (tipoComida == 3) {
            return "Cozinha Chinesa";
        }
        if (tipoComida == 4) {
            return "Outra";
        }
        return "categoria inválida!";
    }

    /**
     * Método de modificação que altera o preço médio por pessoa de uma
     * instância de Restaurante
     */
    public void setPrecoMedio(float precoMedio) {
        this.precoMedio = precoMedio;
    }

    /**
     * Método de modificação que altera o tipo de cozinha/comida de uma
     * instância de Restaurante
     */
    public void setTipoComida(int tipoComida) {
        this.tipoComida = tipoComida;
    }

    /**
     * Método toString para imprimir o conteúdo do objecto criado em
     * PontoInteresse
     *
     * @return - string com o conteudo (nome e endereço) do toString da super
     * classe (Entidade), categoria correspondente do objecto PontoInteresse, e
     * imprime ainda categoria de formaa textual
     */
    @Override
    public String toString() {
        return "- Restaurante" + super.toString() + "\n  preço médio por pessoa: " + obterPrecoMedioPorPessoa() + "\n  tipo de comida: " + getTipoComidaExtenso() + "\n";
    }

    /**
     * Método que compara Restaurante com o objecto (obj) recebido por parâmetro
     *
     * @param obj o objecto que se compara com o Restaurante
     * @return true se o objecto recebido representar um Restaurante (incluindo
     * no preço médio e tipo de comida/cozinha) igual. Caso contrário retorna
     * false.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Restaurante outroRest = (Restaurante) obj;
        return this.precoMedio == outroRest.precoMedio && this.tipoComida == outroRest.tipoComida;
    }

    /**
     * Método que obtém o preço médio por pessoa do restaurante
     */
    @Override
    public float obterPrecoMedioPorPessoa() {
        return precoMedio;
    }

}
