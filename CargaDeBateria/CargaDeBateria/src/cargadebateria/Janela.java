package cargadebateria;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Janela extends JFrame {

    private List<JTextField> listaCaixasTexto;
    private int indiceCarga;

    private final int NUMERO_CAIXAS_TEXTO = 11;

    public Janela() {
        super("Carga de Bateria");

        criarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(getWidth(), getHeight()));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarComponentes() {
        JPanel pCaixasTexto = criarPainelCaixasTexto();
        JPanel pBotoes = criarPainelBotoes();

        add(pCaixasTexto, BorderLayout.WEST);
        add(pBotoes, BorderLayout.CENTER);
    }

    private JPanel criarPainelCaixasTexto() {
        listaCaixasTexto = new ArrayList<>();
        for (int i = 0; i < NUMERO_CAIXAS_TEXTO; i++) {
            listaCaixasTexto.add(new JTextField(4));
        }
        JPanel p = new JPanel(new GridLayout(NUMERO_CAIXAS_TEXTO, 1, 0, 10));
        for (int i = NUMERO_CAIXAS_TEXTO - 1; i >= 0; i--) {
            p.add(listaCaixasTexto.get(i));
        }
        listaCaixasTexto.get(0).setText("0%");
        indiceCarga = 0;
        return p;
    }

    private JPanel criarPainelBotoes() {
        JPanel p = new JPanel(new BorderLayout());
        p.add(criarPainelBotao(criarBotaoCarregar()), BorderLayout.NORTH);
        p.add(criarPainelBotao(criarBotaoDescarregar()), BorderLayout.SOUTH);
        return p;
    }

    private JPanel criarPainelBotao(JButton b) {
        JPanel p = new JPanel();
        ((FlowLayout) p.getLayout()).setAlignment(FlowLayout.LEFT);
        p.add(b);
        return p;
    }

    private JButton criarBotaoCarregar() {
        JButton btn = new JButton("Carregar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indiceCarga != NUMERO_CAIXAS_TEXTO - 1) {
                    indiceCarga++;
                    listaCaixasTexto.get(indiceCarga).setText(indiceCarga * 10 + "%");
                }
            }
        });
        return btn;
    }

    private JButton criarBotaoDescarregar() {
        JButton btn = new JButton("Descarregar");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indiceCarga != 0) {
                    listaCaixasTexto.get(indiceCarga).setText(null);
                    indiceCarga--;
                }
            }
        });
        return btn;
    }

}
