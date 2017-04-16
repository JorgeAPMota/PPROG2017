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
public class PontoInteresse extends Entidade implements ServicoPontoInteresse {

    private int categoria;

    /**
     * Constructor completo para instâncias de PontoInteresse
     *
     * @param nome - Atributo nome de objectos de PontoInteresse que é enviado para a
     * super classe Entidade
     * @param endereco - Atributo endereço de objectos de PontoInteresse que é enviado
     * para a super classe Entidade
     * @param categoria - Atributo de PontoInteresse que revela o nº de estrelas que lhe
     * é atribuido
     */
    public PontoInteresse(String nome, String endereco, int categoria) {
        super(nome, endereco);
        this.categoria = categoria;
    }

    /**
     * Constructor vazio de PontoInteresse
     */
    public PontoInteresse() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }

    /**
     * Método de acesso para obter a categoria de uma instância de PontoInteresse
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Método de acesso para obter a categoria de uma instância de PontoInteresse, de forma textual
     */
    private String getCategoriaExtenso() {
        if (categoria == 1) {
            return "outro";
        }
        if (categoria == 2) {
            return "Monumento Clássico";
        }
        if (categoria == 3) {
            return "Monumento Contemporâneo";
        }
        if (categoria == 4) {
            return "Praça";
        }
        return "categoria inválida!";
    }

    /**
     * Método de modificação para a categoria de Hotel
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
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
        return "- PontoInteresse" + super.toString() + "\n  categoria: " + getCategoriaExtenso() + "\n";
    }

    /**
     * Método que compara PontoInteresse com o objecto (obj) recebido por parâmetro
     * 
     * @param obj o objecto que se compara com o PontoInteresse
     * @return true se o objecto recebido representar um PontoInteresse (incluindo na
     * categoria) igual. Caso contrário retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        PontoInteresse outroPontoInteresse = (PontoInteresse) obj;
        return this.categoria == outroPontoInteresse.categoria;
    }
}
