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
public class Hostel extends Alojamento {

    private String horarioRecepcao;

    private int avaliacao = 0;
    private int contAvaliacoes = 0;
    
    private static final String HORARIO_RECEPCAO_POR_OMISSAO = "nenhum";

    public Hostel(String nome, String endereco, int nif, boolean servicoTransfer, String horarioRecepcao) {
        super(nome, endereco, nif, servicoTransfer);
        this.horarioRecepcao = horarioRecepcao;
    }

    public Hostel() {
        super();
        this.horarioRecepcao = HORARIO_RECEPCAO_POR_OMISSAO;
    }

    public String getHorarioRecepcao() {
        return horarioRecepcao;
    }

    public void setHorarioRecepcao(String horarioRecepcao) {
        this.horarioRecepcao = horarioRecepcao;
    }

    @Override
    public String toString() {
        return "Hostel{" +super.toString()+ "horarioRecepcao=" + getHorarioRecepcao() + ", avaliacao=" + obterAvaliacao() + '}';
    }

    /**
     * Metodo que obtem a media de avaliações de uma instância
     *
     * @return media - média das avaliações da instâmcia
     */
    @Override
    public float obterAvaliacao() {
         //opção num menu para percorrer todas as entidades e avaliar de 1 a 5??
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

}
