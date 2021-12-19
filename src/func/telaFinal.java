package func;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class telaFinal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaFinal frame = new telaFinal();
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
	public telaFinal() {
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
		
		JLabel fim = new JLabel("");
		fim.setForeground(Color.BLACK);
		fim.setBounds(10, 0, 540, 200);
		fim.setFont(new Font("Rajdhani Medium", Font.BOLD, 35));
		panel.add(fim);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(telaFinal.class.getResource("/img/adiano.png")));
		lblNewLabel_1.setBounds(29, 193, 228, 200);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1.setIcon(new ImageIcon(telaFinal.class.getResource("/img/romario.png")));
		lblNewLabel_1_1.setBounds(488, 201, 228, 200);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(telaFinal.class.getResource("/img/vinijr.png")));
		lblNewLabel_1_1_1.setBounds(285, 194, 154, 200);
		panel.add(lblNewLabel_1_1_1);
		
		creditos resultado = new creditos();
		fim.setText("<html><p>Fim.<br>Você conseguiu "+Integer.toString(resultado.verCreditos())+" Créditos Flamenguistas, meus parabéns!</p></html>");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(telaFinal.class.getResource("/img/rasca.png")));
		lblNewLabel_1_1_1_1.setBounds(548, 9, 154, 200);
		panel.add(lblNewLabel_1_1_1_1);
		
		JButton home = new JButton("Refazer");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				creditos desisto = new creditos();
				desisto.reset();
				
				dispose();
				telaInicial home = new telaInicial();
				home.setVisible(true);
				}
		});
		home.setForeground(new Color(194, 42, 30));
		home.setBackground(Color.BLACK);
		home.setBounds(317, 15, 89, 23);
		panel.add(home);

	}
}
