package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Janela extends JFrame {

	JButton btPesquisar;
	JLabel lbAviso, lbPesquisar;
	JTextField txPesquisar;
	JPanel pnAviso, pnPesquisar, pnMostrar;
	JTextArea txaMostrar;
	
	
	public Janela() {
		super("Pesquisa de Cidades");
		
		this.setLayout(new BorderLayout());
		
		iniciaComponentes();
		
		this.setSize(600, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	
	public void iniciaComponentes() {
		
		pnAviso = new JPanel();
		lbAviso = new JLabel("Digite o nome da cidade que deseja pesquisar :");
		pnAviso.add(lbAviso);
		this.add(pnAviso, BorderLayout.NORTH);
		
		pnPesquisar = new JPanel(new FlowLayout());		
		lbPesquisar = new JLabel("Cidade :");
		pnPesquisar.add(lbPesquisar);
		txPesquisar = new JTextField(20);
		pnPesquisar.add(txPesquisar);
		btPesquisar = new JButton("Pesquisar");
		pnPesquisar.add(btPesquisar);
		btPesquisar.addActionListener(new trataBotoes());
		this.add(pnPesquisar, BorderLayout.CENTER);
		
		pnMostrar = new JPanel();
		txaMostrar = new JTextArea(25, 35);
		pnMostrar.add(txaMostrar);
		this.add(pnMostrar, BorderLayout.SOUTH);
		
	}
	
	
	public class trataBotoes implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			txaMostrar.setText(txPesquisar.getText());
			
			
		}
		
	}
	
	
	
}// fim da classe