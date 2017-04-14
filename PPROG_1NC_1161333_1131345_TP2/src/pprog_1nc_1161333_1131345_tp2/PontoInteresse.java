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

    public PontoInteresse(String nome, String endereco, int categoria) {
        super(nome, endereco);
        this.categoria = categoria;
    }

    public PontoInteresse() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }

    public int getCategoria() {
        return categoria;
    }

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

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "- PontoInteresse" + super.toString() + "\n  categoria: " + getCategoriaExtenso() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        PontoInteresse outroPontoInteresse = (PontoInteresse) obj;
        return this.categoria == outroPontoInteresse.categoria;
    }
}
