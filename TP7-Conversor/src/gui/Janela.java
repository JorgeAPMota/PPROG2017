package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Janela extends JFrame {

    private JTextField txtCelsius;
    private JTextField txtFahrenheit;

    private static final int JANELA_LARGURA = 400;
    private static final int JANELA_ALTURA = 200;
    private static final int POSICAO_X = 200;
    private static final int POSICAO_Y = 200;
    private static final Dimension LABEL_TAMANHO
            = new JLabel("Fahrenheit:").getPreferredSize();

    public Janela(String titulo) {

        super(titulo);

        JPanel pCelsius = criarPainelCelsius();
        JPanel pFahrenheit = criarPainelFahrenheit();
        JPanel pBotoes = criarPainelBotoes();

        add(pCelsius, BorderLayout.NORTH);
        add(pFahrenheit, BorderLayout.CENTER);
        add(pBotoes, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(JANELA_LARGURA, JANELA_ALTURA);
        // Alternativa ao setSize()
        // pack();

        setMinimumSize(new Dimension(getWidth(), getHeight()));

        setLocation(POSICAO_X, POSICAO_Y);
        // Alternativa ao setLocation
//         setLocationRelativeTo(null);

        setVisible(true);
    }

    private JPanel criarPainelCelsius() {
        JLabel lbl = new JLabel("Celsius:", JLabel.RIGHT);
        lbl.setPreferredSize(LABEL_TAMANHO);

        final int LARGURA = 10;
        txtCelsius = new JTextField(LARGURA);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 40, MARGEM_DIREITA = 40;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(lbl);
        p.add(txtCelsius);

        return p;
    }

    private JPanel criarPainelFahrenheit() {
        JLabel lbl = new JLabel("Fahrenheit:");

        final int LARGURA = 10;
        txtFahrenheit = new JTextField(LARGURA);

        JPanel p = new JPanel();
        p.add(lbl);
        txtFahrenheit.setEditable(false);
        p.add(txtFahrenheit);

        return p;
    }

    private JPanel criarPainelBotoes() {

        JButton btnConverter = criarBotaoConverter();
        JButton btnLimpar = criarBotaoLimpar();
        JButton btnSair = criarBotaoSair();

        getRootPane().setDefaultButton(btnConverter);

        JPanel p = new JPanel();
        final int MARGEM_SUPERIOR = 0, MARGEM_INFERIOR = 10;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        p.setBorder(BorderFactory.createEmptyBorder(MARGEM_SUPERIOR,
                MARGEM_ESQUERDA, MARGEM_INFERIOR, MARGEM_DIREITA));
        p.add(btnConverter);
        p.add(btnLimpar);
        p.add(btnSair);

        return p;
    }

    private JButton criarBotaoConverter() {
        JButton btn = new JButton("Converter");
        btn.setToolTipText("Efetua a conversão celsius->fahrenheit");
        btn.setMnemonic(KeyEvent.VK_C);
        
        return btn;
    }

    private JButton criarBotaoLimpar() {
        JButton btn = new JButton("Limpar");
        btn.setToolTipText("Limpa o conteúdo dos campos de texto");
        btn.setMnemonic(KeyEvent.VK_L);
        
        return btn;
    }

    private JButton criarBotaoSair() {
        JButton btn = new JButton("Sair");
        btn.setToolTipText("Fecha o programa");
        btn.setMnemonic(KeyEvent.VK_S);

        return btn;
    }

}
