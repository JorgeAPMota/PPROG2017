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

    public Hotel(String nome, String endereco, int nif, boolean servicoTransfer, String categoria, boolean servicoGuia, boolean servicoSPA) {
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
        return "- Hotel" + super.toString() + "\n  categoria: " + getCategoria() + "\n  tem servico guia? " + validarServicoGuia() + "\n  tem servico SPA? " + validarServicoSPA() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Hotel outroHotel = (Hotel) obj;
        return this.categoria.equals(outroHotel.categoria) && this.servicoGuia == outroHotel.servicoGuia && this.servicoSPA == outroHotel.servicoSPA;
    }
    
    @Override
    public boolean validarServicoGuia() {
        if (servicoGuia == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validarServicoSPA() {
        if (servicoSPA == true) {
            return true;
        } else {
            return false;
        }
    }

}
