
package gestoreventos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * PPROG 2016/2017 Trabalho Prático nº3 - TP3
 *
 * @author 1161333 - Joana Gusmao Guedes
 * @author 1131345 - Jorge Mota
 *
 * @since 27/05/2017
 */
public class Evento {
    


/**
 *
 * @author Nuno Silva
 */
public class Evento{

	private String m_strTitulo;
	private String m_strDescricao;
	private Local m_local;
	private String m_strDataInicio;
	private String m_strDataFim;
	private List<Organizador> m_listaOrganizadores;
	private List<Submissao> m_listaSubmissoes;
	private CP m_cp;
	private List<SessaoTematica> m_ListaSessaoTematica;

	public Evento() {
		m_local = new Local();
		m_listaOrganizadores = new ArrayList<>();
		m_listaSubmissoes = new ArrayList<>();
	}

	public CP novaCP() {
		m_cp = new CP();

		return m_cp;
	}

	public void setTitulo(String strTitulo) {
		this.m_strTitulo = strTitulo;
	}

	public void setDescricao(String strDescricao) {
		this.m_strDescricao = strDescricao;
	}

	public void setDataInicio(String strDataInicio) {
		this.m_strDataInicio = strDataInicio;
	}

	public void setDataFim(String strDataFim) {
		this.m_strDataFim = strDataFim;
	}

	public void setLocal(String strLocal) {
		this.m_local.setLocal(strLocal);
	}

	public List<Organizador> getListaOrganizadores() {
		List<Organizador> lOrg = new ArrayList<>();

		for (ListIterator<Organizador> it = m_listaOrganizadores.listIterator(); it.hasNext();) {
			lOrg.add(it.next());
		}

		return lOrg;
	}

	public boolean addOrganizador(String strId, Utilizador u) {
		Organizador o = new Organizador(strId, u);

		o.valida();

		return addOrganizador(o);
	}

	private boolean addOrganizador(Organizador o) {
		return m_listaOrganizadores.add(o);
	}

	public boolean valida() {
		return true;
	}

	public void setCP(CP cp) {
		m_cp = cp;
	}

	@Override
	public String toString() {
		return "Evento: " + this.m_strTitulo + " | Descricao do Evento: " + this.m_strDescricao;
	}

	public boolean aceitaSubmissoes() {
		return true;
	}

	@Override
	public Submissao novaSubmissao() {
		return new Submissao();
	}

	@Override
	public boolean addSubmissao(Submissao submissao) {
		if (validaSubmissao(submissao)) {
			return this.m_listaSubmissoes.add(submissao);
		} else {
			return false;
		}
	}

	private boolean validaSubmissao(Submissao submissao) {
		return submissao.valida();
	}

	public SessaoTematica novaST() {
		return new SessaoTematica();
	}

	public boolean registaSessaoTematica(SessaoTematica st) {
		if (st.valida() && validaST(st)) {
			return addSessaoTematica(st);
		} else {
			return false;
		}
	}

	private boolean validaST(SessaoTematica e) {
		return true;
	}

	private boolean addSessaoTematica(SessaoTematica st) {
		return m_ListaSessaoTematica.add(st);
	}

	public List<SessaoTematica> getSTProponente(String strId) {
		throw new UnsupportedOperationException("Não implementado");
	}

	@Override
	public void novoProcessoDistribuicao() {
		throw new UnsupportedOperationException("Não implementado");
	}

	@Override
	public void setProcessoDistribuicao(ProcessoDeDistribuicao pd) {
		throw new UnsupportedOperationException("Não implementado");
	}
        
        private void getSubmissoes(){
        
            System.out.println(this.m_listaSubmissoes.toString());
        
        }

}
    
    
    
}
