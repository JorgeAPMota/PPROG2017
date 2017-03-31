/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

import java.util.Calendar;
import utilitarios.Data;
import utilitarios.Tempo;

/**
 *
 * @author Jorge Mota
 */
public class Empregado {

    String primeiroNome;
    String ultimoNome;
    Data dataContrato;
    Tempo horaEntrada;
    Tempo horaSaida;

    private static final String PRIMEIRO_NOME_POR_OMISSAO = "Sem nome";
    private static final String ULTIMO_NOME_POR_OMISSAO = "sem ultimo nome";

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
        
    /**
    * Contrutor vazio
    */
    public Empregado(){
        primeiroNome = PRIMEIRO_NOME_POR_OMISSAO;
        ultimoNome = ULTIMO_NOME_POR_OMISSAO;
        dataContrato = new Data(dataContrato);
        horaEntrada = new Tempo(horaEntrada);
        horaSaida = new Tempo(horaSaida);
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     *
     * @return dataContrato
     */
    public Data getDataContrato() {
        return dataContrato;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }


    @Override
    public String toString() {
        return String.format(
                "Empregado:%n Nome:%s;%n Sobrenome:%s;%n Data de contrato:%s;%n Hora de entrada:%s;%n Hora de saída:%s;%n",
                primeiroNome, ultimoNome, dataContrato.toAnoMesDiaString(), horaEntrada, horaSaida);
    }

    /**
     * Calcular o número de horas de trabalho semanal de um empregado,
     * considerando que todos os empregados trabalham 5 dias por semana;
     *
     * @return
     */
    public float calcularHorasTrabalho() {
        float numeroHorasTrabalhoSemanal;
        numeroHorasTrabalhoSemanal = (horaEntrada.diferencaEmSegundos(horaSaida)) * 60 * 60 * 5;
        return numeroHorasTrabalhoSemanal;
    }

    /**
     * Determinar há quanto tempo o empregado foi contratado.
     *
     * @return tempoDecontrato - Nº de dias de contrato
     */
    public int calcularTempoContrato() {
        int tempoDeContrato;
        tempoDeContrato = (dataContrato.diferenca(Data.dataAtual()));
        return tempoDeContrato;
    }

}
