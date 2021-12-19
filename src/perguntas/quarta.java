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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import func.creditos;
import func.telaInicial;
import telasAcertosErros.acertoQuatro;
import telasAcertosErros.acertoUm;
import telasAcertosErros.errou;
import telasAcertosErros.errouQuatro;

public class quarta extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quarta frame = new quarta();
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
	public quarta() {
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
		
		JLabel comemoracao = new JLabel("");
		comemoracao.setIcon(new ImageIcon(quarta.class.getResource("/img/81.jpg")));
		comemoracao.setBounds(456, 80, 204, 308);
		panel.add(comemoracao);
		
		JRadioButton op4 = new JRadioButton("Nascimento do flam\u00EDdia\r\n");
		buttonGroup.add(op4);
		op4.setFocusPainted(false);
		op4.setFont(new Font("Verdana", Font.PLAIN, 20));
		op4.setForeground(Color.BLACK);
		op4.setBackground(vermelho);
		op4.setBounds(26, 263, 350, 71);
		panel.add(op4);
		
		JRadioButton op3 = new JRadioButton("<html><p>Ingleses colocaram o Mingau na roda</p></html>\r\n");
		buttonGroup.add(op3);
		
		op3.setFocusPainted(false);
		op3.setFont(new Font("Verdana", Font.PLAIN, 20));
		op3.setForeground(Color.BLACK);
		op3.setBackground(vermelho);
		op3.setBounds(26, 326, 356, 99);
		panel.add(op3);
		
		JRadioButton op2 = new JRadioButton("Meng\u00E3o colocou os ingleses na roda\r\n");
		buttonGroup.add(op2);
		op2.setFocusPainted(false);
		op2.setFont(new Font("Verdana", Font.PLAIN, 20));
		op2.setForeground(Color.BLACK);
		op2.setBackground(vermelho);
		op2.setBounds(26, 121, 424, 71);
		panel.add(op2);
		
		JLabel pergunta = new JLabel("O que aconteceu em dezembro de 81?\r\n");
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
		
		
		JRadioButton op1 = new JRadioButton("Natal e ano novo de 81");
		

		buttonGroup.add(op1);
		op1.setFocusPainted(false);
		op1.setFont(new Font("Verdana", Font.PLAIN, 20));
		op1.setForeground(Color.BLACK);
		op1.setBackground(vermelho);
		op1.setBounds(26, 189, 370, 71);
		panel.add(op1);
		
		JButton avançar = new JButton("Avan\u00E7ar");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean opcao1, opcao2, opcao3, opcao4;
				
				opcao1 = op1.isSelected();
				opcao2 = op2.isSelected();
				opcao3 = op3.isSelected();
				opcao4 = op4.isSelected();
				
				acertoQuatro acerto = new acertoQuatro();
				errouQuatro erro = new errouQuatro();
				creditos credito = new creditos();
				
				if(opcao1 == false && opcao2 == false && opcao3 == false && opcao4 == false) {
					JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.", "Aviso!", JOptionPane.WARNING_MESSAGE);
				}else {
					if(opcao2) {
						
						
						dispose();
						credito.acertou(81);
						acerto.setVisible(true);
						
					}else {
						credito.errou(81);
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
