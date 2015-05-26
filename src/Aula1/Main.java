package Aula1;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        Aluno a1 = new Aluno("Zezin", "0001");
        Aluno a2 = new Aluno("Zezão", "0002");

        lista.add(a1);
        lista.add(a2);
        lista.add(new Aluno("Zezovisk", "0003"));

        lista.add(new Professor("Zézito", 666));
        lista.add(new Professor("Alessandro", 1));

        JFrame layout = new JFrame("Layout Java");

        GridBagConstraints c = new GridBagConstraints();

        layout.setLayout(new GridBagLayout());

        c.weightx = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 10, 10, 10);

        for (int i = 0; i < lista.size(); i++) {
            
            c.gridy = i;
            
            if (lista.get(i) instanceof Aluno) {

                //layout.add(new JLabel("Nome do Aluno: " + ((Aluno) lista.get(i)).getNome()), c);
                //layout.add(new JLabel("Matricula do Aluno: " + ((Aluno) lista.get(i)).getMatricula()), c);
                System.out.println(((Aluno) lista.get(i)).toString());
            } else if (lista.get(i) instanceof Professor) {

                //layout.add(new JLabel("Nome do Professor: " + ((Professor) lista.get(i)).getNome()), c);
                //layout.add(new JLabel("CTPS do Professor: " + ((Professor) lista.get(i)).getCtps()), c);
                System.out.println(((Professor) lista.get(i)).toString());
            }

        }

        layout.setSize(600, 300);
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setVisible(true);
    }

}
