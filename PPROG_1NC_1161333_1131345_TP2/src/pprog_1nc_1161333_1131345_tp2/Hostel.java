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

    private static final String HORARIO_RECEPCAO_POR_OMISSAO = "nenhum";

    /**
     * Constructor completo para instâncias de Hostel
     * @param nome - Atributo nome de objectos de Hostel que é enviado para a super classe Alojamento
     * @param endereco - Atributo endereço de objectos de Hostel que é enviado para a super classe Alojamento
     * @param nif - Atributo nif de objectos de Hostel
     * @param servicoTransfer - Boolean logo será true se tiver este serviço, ou false se não tiver
     * @param horarioRecepcao - Atributo correspondente ao horário da recepção do objecto hostel
     */
    public Hostel(String nome, String endereco, int nif, boolean servicoTransfer, String horarioRecepcao) {
        super(nome, endereco, nif, servicoTransfer);
        this.horarioRecepcao = horarioRecepcao;
    }

    /**
     * Constructor vazio de Hostel
     */
    public Hostel() {
        super();
        this.horarioRecepcao = HORARIO_RECEPCAO_POR_OMISSAO;
    }

     /**
     * Método de acesso para obter o horario de recepçao de uma instância de Hostel
     * @return horario de recepcao de uma instância
     */
    public String getHorarioRecepcao() {
        return horarioRecepcao;
    }

     /**
     * Método de modificação do horario de recepcao de um objecto do tipo Hostel
     * @param horarioRecepcao - horario de recepcao de uma instância
     */
    public void setHorarioRecepcao(String horarioRecepcao) {
        this.horarioRecepcao = horarioRecepcao;
    }

    /**
     * Método toString para imprimir o conteúdo do objecto criado em Hostel
     * @return - string com o conteudo do toString da super classe, e horario da recepcao do hostel
     */
    @Override
    public String toString() {
        return "- Hostel" + super.toString() + "\n  horario da recepcao: " + getHorarioRecepcao() + "\n";
    }

     /**
     * Método que compara a Hostel com o objecto (obj) recebido por parâmetro
     *
     * @param obj o objecto que se compara com a EntidadecomNif
     * @return true se o objecto recebido representar uma entidade equivalente (incluindo no horario da recepcao) 
     * à EntidadecomNif. 
     * Caso contrário retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Hostel outroHostel = (Hostel) obj;
        return this.horarioRecepcao.equals(outroHostel.horarioRecepcao);
    }

}