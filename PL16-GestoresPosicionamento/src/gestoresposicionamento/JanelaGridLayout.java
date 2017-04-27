package gestoresposicionamento;

import java.awt.*;
import javax.swing.*;

/**
 * Representa uma janela cujo ContentPane tem um gestor de posicionamento
 * GridLayout.
 *
 * @author ISEP-DEI-PPROG
 */
public class JanelaGridLayout extends JFrame {

    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 400;

    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;

    /**
     * Constrói uma instância de JanelaGridLayout.
     *
     * @param titulo o título da janela
     */
    public JanelaGridLayout(String titulo) {

        super(titulo);

        getContentPane().setBackground(Color.CYAN);

        final int NUMERO_LINHAS = 3, NUMERO_COLUNAS = 3;
        GridLayout gl = new GridLayout(NUMERO_LINHAS, NUMERO_COLUNAS);
        setLayout(gl);

//        /*
//         * Adiciona e invoca o método que vai criar um Painel Cinza:
//         */
//        add("PainelVazioCinza", criarPainelVazioCinza());

//        /*
//        * Cria uma nova JLabel de nome teste, mas vazia, de forma a aparecer o background
//        */
//        JLabel teste = new JLabel();
        
//        /*
//        * Adiciona a JLabel ao painel
//        */
//        add(teste);
        
        /*
         * Invoca um método que vai criar todos os outros componentes (botôes):
         */
        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);

    }

    /**
     * Cria e adiciona componentes à janela.
     */
    private void criarComponentes() {

        String[] titulos = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete"};

        for (String titulo : titulos) {
            add(new JButton(titulo));
        }

    }

    /*
     *Cria painel vazio cinza...
     */
    private JPanel criarPainelVazioCinza() {
        JPanel pVazioCinza = new JPanel();

        pVazioCinza.setBackground(Color.GRAY);

        return pVazioCinza;
    }

    /*
     *Cria painel vazio...
     */
    private JPanel criarPainelVazioCiano() {
        JPanel pVazioCiano = new JPanel();

        pVazioCiano.setBackground(Color.CYAN);

        return pVazioCiano;
    }

    /**
     * Para testar a janela JanelaGridLayout.
     *
     * @param args as opções de execução
     */
    public static void main(String args[]) {

        JanelaGridLayout janela = new JanelaGridLayout("Gestor de Posicionamento: GridLayout");

    }
}
