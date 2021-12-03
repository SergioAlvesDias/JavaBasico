package projetoinicialjava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Javaproject {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Geek University");
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Seja bem-vindo(a)");
		JButton button2 = new JButton("Programação para Leigos");
		JButton button3 = new JButton("Introdução a Linguagem Java");

		panel.setLayout(new BorderLayout(1, 0));

		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.CENTER);
		panel.add(button3, BorderLayout.SOUTH);

		frame.setContentPane(panel);
		frame.pack();
		frame.setSize(640, 480);
		frame.setVisible(true);

		System.out.println();

	}

}
