package perguntas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Dialog.ModalExclusionType;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import func.creditos;
import func.telaInicial;
import telasAcertosErros.acertoUm;
import telasAcertosErros.errou;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class primeira extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primeira frame = new primeira();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public primeira() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		Font mengo = null;
		
	    
		try{
	        mengo = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("font/Rajdhani-Medium.ttf"));
	    }
	    catch(IOException|FontFormatException e){
	         System.out.println("Merda " + e);
	    }
	        mengo = mengo.deriveFont(Font.PLAIN, 20);
	        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	        ge.registerFont(mengo);  
	        this.setFont(mengo); 
	        
	        
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Color vermelho = new Color(194, 42, 30);
		JPanel panel = new JPanel();
		
		panel.setBackground(vermelho);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 724, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JRadioButton op4 = new JRadioButton("Não sei informar");
		buttonGroup.add(op4);
		op4.setFont(new Font("Verdana", Font.PLAIN, 20));
		op4.setForeground(Color.BLACK);
		op4.setBackground(vermelho);
		op4.setBounds(26, 263, 350, 71);
		op4.setFocusPainted(false);
		panel.add(op4);
		
		JRadioButton op1 = new JRadioButton("<html><p>Gabriel Barbosa Gabigol Camisa 9</p></html>\r\n\r\n");
		buttonGroup.add(op1);
		op1.setFont(new Font("Verdana", Font.PLAIN, 20));
		op1.setForeground(Color.BLACK);
		op1.setBackground(vermelho);
		op1.setFocusPainted(false);
		op1.setBounds(26, 189, 463, 71);
		panel.add(op1);
		
		JRadioButton op3 = new JRadioButton("Fracassado na Europa");
		buttonGroup.add(op3);
		op3.setFont(new Font("Verdana", Font.PLAIN, 20));
		op3.setForeground(Color.BLACK);
		op3.setBackground(vermelho);
		op3.setBounds(26, 337, 362, 71);
		op3.setFocusPainted(false);
		panel.add(op3);
		
		JRadioButton op2 = new JRadioButton("Lil' Gabi");
		buttonGroup.add(op2);
		op2.setFont(new Font("Verdana", Font.PLAIN, 20));
		op2.setForeground(Color.BLACK);
		op2.setBackground(vermelho);
		op2.setBounds(26, 121, 210, 71);
		op2.setFocusPainted(false);
		panel.add(op2);
		
		JLabel pergunta = new JLabel("Quem \u00E9 esse rapaz?");
		pergunta.setHorizontalAlignment(SwingConstants.CENTER);
		pergunta.setForeground(Color.BLACK);
		pergunta.setBackground(Color.BLACK);
		pergunta.setFont(new Font("Rajdhani Medium", Font.BOLD, 35));
		pergunta.setBounds(0, 0, 724, 141);
		panel.add(pergunta);
		
		JLabel lilgabi = new JLabel("");
		lilgabi.setIcon(new ImageIcon(primeira.class.getResource("/img/gabigol-nova.png")));
		lilgabi.setBounds(451, 121, 167, 227);
		panel.add(lilgabi);
		
		JButton home = new JButton("Desistir");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				creditos desisto = new creditos();
				desisto.reset();
				
				dispose();
				telaInicial home = new telaInicial();
				home.setVisible(true);
				}
		});
		home.setForeground(vermelho);
		home.setBackground(Color.BLACK);
		home.setBounds(400, 389, 89, 23);
		panel.add(home);
		
		JButton avançar = new JButton("Avan\u00E7ar");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean opcao1, opcao2, opcao3, opcao4;
				
				opcao1 = op1.isSelected();
				opcao2 = op2.isSelected();
				opcao3 = op3.isSelected();
				opcao4 = op4.isSelected();
				
				acertoUm acerto = new acertoUm();
				errou erro = new errou();
				creditos credito = new creditos();
				
				if(opcao1 == false && opcao2 == false && opcao3 == false && opcao4 == false) {
					JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.", "Aviso!", JOptionPane.WARNING_MESSAGE);
				}else {
					if(opcao1) {
						
						
						dispose();
						credito.acertou(2019);
						acerto.setVisible(true);
						
					}else {
						credito.errou(2019);
						dispose();
						erro.setVisible(true);
					}
				}
			}
		});
		avançar.setForeground(vermelho);
		avançar.setBackground(Color.BLACK);
		avançar.setBounds(589, 389, 89, 23);
		panel.add(avançar);
	}
}
