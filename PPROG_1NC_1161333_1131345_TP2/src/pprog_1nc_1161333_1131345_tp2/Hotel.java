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
public class Hotel extends Alojamento implements ServicoHotel {

    private String categoria;
    private boolean servicoGuia;
    private boolean servicoSPA;

    private static final boolean SERVICO_GUIA_POR_OMISSAO = false;
    private static final boolean SERVICO_SPA_POR_OMISSAO = false;

    /**
     * Constructor completo para instâncias de Hotel
     *
     * @param nome - Atributo nome de objectos de Hotel que é enviado para a
     * super classe Alojamento
     * @param endereco - Atributo endereço de objectos de Hotel que é enviado
     * para a super classe Alojamento
     * @param nif - Atributo nif de objectos de Hotel
     * @param servicoTransfer - True caso Hotel tenha serviço de transfer
     * @param categoria - Atributo de Hotel que revela o nº de estrelas que lhe
     * é atribuido
     * @param servicoGuia - True caso Hotel tenha serviço de guia
     * @param servicoSPA - True caso Hotel tenha serviço de SPA
     */
    public Hotel(String nome, String endereco, int nif, boolean servicoTransfer, String categoria, boolean servicoGuia, boolean servicoSPA) {
        super(nome, endereco, nif, servicoTransfer);
        this.categoria = categoria;
        this.servicoGuia = servicoGuia;
        this.servicoSPA = servicoSPA;
    }

    /**
     * Constructor vazio para Hotel
     */
    public Hotel() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
        this.servicoGuia = SERVICO_GUIA_POR_OMISSAO;
        this.servicoSPA = SERVICO_SPA_POR_OMISSAO;
    }

    /**
     * Método de acesso para obter a categoria de uma instância de Hotel
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método de modificação para serviço de Guia de Hotel
     */
    public void setServicoGuia(boolean servicoGuia) {
        this.servicoGuia = servicoGuia;
    }

    /**
     * Método de modificação para serviço de SPA de Hotel
     */
    public void setServicoSPA(boolean servicoSPA) {
        this.servicoSPA = servicoSPA;
    }

    /**
     * Método de modificação para a categoria de Hotel
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método toString para imprimir o conteúdo do objecto criado em Hotel
     *
     * @return - string com o conteudo do toString da super classe, categoria
     * correspondente do objecto hotel, e imprime ainda true/false quanto aos
     * serviços de Guia e SPA
     */
    @Override
    public String toString() {
        return "- Hotel" + super.toString() + "\n  categoria: " + getCategoria() + "\n  tem servico guia? " + validarServicoGuia() + "\n  tem servico SPA? " + validarServicoSPA() + "\n";
    }

    /**
     * Método que compara Hotel com o objecto (obj) recebido por parâmetro
     *
     * @param obj o objecto que se compara com o Hotel
     * @return true se o objecto recebido representar um Hotel (incluindo na
     * categoria, no caso de ter servico de SPA, e serviço de Guia) igual. Caso
     * contrário retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Hotel outroHotel = (Hotel) obj;
        return this.categoria.equals(outroHotel.categoria) && this.servicoGuia == outroHotel.servicoGuia && this.servicoSPA == outroHotel.servicoSPA;
    }

    /**
     * Método que verifica se tem serviço de guia
     *
     * @return true se tiver este serviço
     */
    @Override
    public boolean validarServicoGuia() {
        if (servicoGuia == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que verifica se tem serviço de SPA
     *
     * @return true se tiver este serviço
     */
    @Override
    public boolean validarServicoSPA() {
        if (servicoSPA == true) {
            return true;
        } else {
            return false;
        }
    }

}
