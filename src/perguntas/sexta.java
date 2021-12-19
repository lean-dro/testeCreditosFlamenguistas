package perguntas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import func.creditos;
import func.telaFinal;
import func.telaInicial;
import telasAcertosErros.acertoSeis;
import telasAcertosErros.errou;

public class sexta extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sexta frame = new sexta();
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
	public sexta() {
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
		
		JRadioButton op4 = new JRadioButton("DIA QUALQUER ");
		buttonGroup.add(op4);
		op4.setFocusPainted(false);
		op4.setFont(new Font("Verdana", Font.PLAIN, 20));
		op4.setForeground(Color.BLACK);
		op4.setBackground(vermelho);
		op4.setBounds(26, 270, 424, 71);
		panel.add(op4);
		
		JRadioButton op3 = new JRadioButton("Uma coisa terr\u00EDvel...\r\n");
		buttonGroup.add(op3);
		op3.setFocusPainted(false);
		op3.setFont(new Font("Verdana", Font.PLAIN, 20));
		op3.setForeground(Color.BLACK);
		op3.setBackground(vermelho);
		op3.setBounds(26, 326, 356, 99);
		panel.add(op3);
		
		JRadioButton op2 = new JRadioButton("NADA HAHAHAHHAHAHAHAHAHAHA\r\n");
		buttonGroup.add(op2);
		op2.setFocusPainted(false);
		op2.setFont(new Font("Verdana", Font.PLAIN, 20));
		op2.setForeground(Color.BLACK);
		op2.setBackground(vermelho);
		op2.setBounds(26, 121, 424, 71);
		panel.add(op2);
		
		JLabel pergunta = new JLabel("O que ocorreu no dia 27/11/2021?\r\n");
		pergunta.setHorizontalAlignment(SwingConstants.CENTER);
		pergunta.setForeground(Color.BLACK);
		pergunta.setBackground(Color.BLACK);
		pergunta.setFont(new Font("Rajdhani Medium", Font.BOLD, 35));
		pergunta.setBounds(0, 0, 724, 141);
		panel.add(pergunta);
		
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
		
		JRadioButton op1 = new JRadioButton("NADICA DE NADA");
		

		buttonGroup.add(op1);
		op1.setFocusPainted(false);
		op1.setFont(new Font("Verdana", Font.PLAIN, 20));
		op1.setForeground(Color.BLACK);
		op1.setBackground(vermelho);
		op1.setBounds(26, 182, 424, 99);
		panel.add(op1);
		
		JButton avançar = new JButton("Avan\u00E7ar");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean opcao1, opcao2, opcao3, opcao4;
				
				opcao1 = op1.isSelected();
				opcao2 = op2.isSelected();
				opcao3 = op3.isSelected();
				opcao4 = op4.isSelected();
				
				acertoSeis acerto = new acertoSeis();
				errou erro = new errou();
				creditos credito = new creditos();
				telaFinal fim = new telaFinal();
				
				if(opcao1 == false && opcao2 == false && opcao3 == false && opcao4 == false) {
					JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.", "Aviso!", JOptionPane.WARNING_MESSAGE);
				}else {
					if(opcao3) {
						
						
						dispose();
						credito.errou(999999999);
						acerto.setVisible(true);
						
					}else {
						dispose();
						fim.setVisible(true);
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
