package view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Janela extends JFrame {

	JButton btPesquisar;
	JLabel lbAviso, lbPesquisar;
	JTextField txPesquisar;
	JPanel pnAviso, pnPesquisar, pnMostrar;

	
	
	public Janela() {
		super("Pesquisa");
		
		this.setLayout(new BorderLayout());
		
		iniciaComponentes();
		
		this.setSize(400, 300);
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
		
	}
	
	
	public class trataBotoes implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(btPesquisar)) {
				
				String dados;
				dados = txPesquisar.getText();
				
				try {
		            //Registra JDBC driver
		            Class.forName("org.postgresql.Driver");
		 
		            //Abrindo a conexão
		            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/publicidade_2","postgres","root");
		            
		            java.sql.Statement st = conn.createStatement();
		            
		            st.executeQuery("select usuario.nomeUsuario, post.titulo, post.descricao, cidade.nomeCidade "
		            		+ "from usuario, post, cidade "
		            		+ "where post.idCidade = cidade.idCidade and post.idUsuario = usuario.idUsuario and cidade.nomeCidade = '"+txPesquisar.getText() + "'");
		           
		            ResultSet rs = st.getResultSet();
		         
		            while (rs.next()) {
		                System.out.print(rs.getString("nomeUsuario") + ", ");
		                System.out.print(rs.getString("titulo") + ", ");
		                System.out.print(rs.getString("descricao") + ", ");
		                System.out.print(rs.getString("nomeCidade"));
		                System.out.println();    
		                
		            }
		           
		        } catch (SQLException | ClassNotFoundException e1) {
		            JOptionPane.showMessageDialog(rootPane, e1);
		        }//Fim try
				
			}
			
		}
		
	}
	
	
	
}// fim da classe