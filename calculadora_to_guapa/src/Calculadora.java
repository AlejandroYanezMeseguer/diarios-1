import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    public JTextField primerOperando;
    public JTextField segundoOperando;
    public JTextArea resultado;
    public JButton botonSuma;
    public JButton botonResta;

    public Calculadora() {
        super("Calculadora");
        setLayout(new FlowLayout());

        primerOperando = new JTextField(10);
        add(primerOperando);

        segundoOperando = new JTextField(10);
        add(segundoOperando);

        botonResta = new JButton("-");
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oprando1text = primerOperando.getText();
                float Operando1 = Float.parseFloat(oprando1text);
                String oprando2text = segundoOperando.getText();
                float Operando2 = Float.parseFloat(oprando2text);
                resultado.append((Operando1-Operando2) + "\n");
            }
        });
        add(botonResta);

        botonSuma = new JButton("+");
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oprando1text = primerOperando.getText();
                float Operando1 = Float.parseFloat(oprando1text);
                String oprando2text = segundoOperando.getText();
                float Operando2 = Float.parseFloat(oprando2text);
                resultado.append((Operando1+Operando2) + "\n");
            }
        });
        add(botonSuma);

        resultado = new JTextArea(5, 20);
        add(new JScrollPane(resultado));

        setSize(260, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculadora();
    }
}