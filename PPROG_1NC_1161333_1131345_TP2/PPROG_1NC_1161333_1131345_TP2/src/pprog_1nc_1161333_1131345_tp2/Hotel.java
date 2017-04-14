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

    private int avaliacao = 0;
    private int contAvaliacoes = 0;
    
    private static final boolean SERVICO_GUIA_POR_OMISSAO = false;
    private static final boolean SERVICO_SPA_POR_OMISSAO = false;
    
    public Hotel(String nome, String endereco, int nif, boolean servicoTransfer, String categoria ,boolean servicoGuia, boolean servicoSPA) {
        super(nome, endereco, nif, servicoTransfer);
        this.categoria = categoria;
        this.servicoGuia = servicoGuia;
        this.servicoSPA = servicoSPA;
    }

    public Hotel() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
        this.servicoGuia = SERVICO_GUIA_POR_OMISSAO;
        this.servicoSPA = SERVICO_SPA_POR_OMISSAO;
    }

    public boolean isServicoGuia() {
        return servicoGuia;
    }

    public boolean isServicoSPA() {
        return servicoSPA;
    }

    public String getCategoria() {
        return categoria;
    }

    
    public void setServicoGuia(boolean servicoGuia) {
        this.servicoGuia = servicoGuia;
    }

    public void setServicoSPA(boolean servicoSPA) {
        this.servicoSPA = servicoSPA;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    @Override
    public String toString() {
        return "Hotel{" + super.toString()+ "categoria="+ getCategoria() + "servicoGuia=" + isServicoGuia() + ", servicoSPA=" + isServicoSPA() + ", avaliacao=" + obterAvaliacao() + '}';
    }


    
    /**
     * Metodo que obtem a media de avaliações de uma instância
     *
     * @return media - média das avaliações da instâmcia
     */
    @Override
    public float obterAvaliacao() {
        float media = avaliacao / contAvaliacoes;
        return media;
    }

    /**
     * Metodo que recebe um inteiro e actualiza a avaliação da instancia
     * contAvaliacoes conta o total de avaliacoes obtida para cada instancia
     *
     * @param val - inteiro atribuido por utilizador que reflecte a avaliacao da
     * entidade
     */
    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao = avaliacao + val;
        ++contAvaliacoes;
    }

    @Override
    public boolean validarServicoTransfer() {
       if(isServicoTransfer()){
               return true;
       } else return false;
       } 

    @Override
    public boolean validarServicoGuia() {
          if(isServicoGuia()){
               return true;
       } else return false;     
    }

    @Override
    public boolean validarServicoSPA() {
          if(isServicoSPA()){
               return true;
       } else return false;  
    }
}
