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
        return "- Hostel" + super.toString() + "\n  horario da recepcao: " + getHorarioRecepcao() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Hostel outroHostel = (Hostel) obj;
        return this.horarioRecepcao.equals(outroHostel.horarioRecepcao);
    }

}
