package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observe {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);

		JButton botao = new JButton("Clicar");
		janela.add(botao);
		/* o ActionListener é uma interface funcional(so tem uma funcao), por
		 ser uma interface, não era para ser possivel instanciar ela, mas o java
		 nos ajuda criando uma classe anonima, que nao tem nome mas que podemos usar
		 no caso esta sendo usada como paramentro para adicionar um evento ao botao,
		 e temos que dizer o que o metodo classe anonima ira fazer
		 botao.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
			 System.out.println("Ocorreu um evento");
			
		 }
		});*/

		botao.addActionListener(e -> System.out.println("ocorreu evento de " + e.getActionCommand()));

		janela.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}
		});

		janela.setVisible(true);
	}
}
