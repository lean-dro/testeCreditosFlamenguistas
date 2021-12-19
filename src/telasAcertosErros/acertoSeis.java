package telasAcertosErros;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import func.creditos;
import func.telaInicial;

public class acertoSeis extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acertoSeis frame = new acertoSeis();
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
	public acertoSeis() {
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
		
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 724, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel pontos = new JLabel("<html>\r\n- 999999999<br>\r\nCr\u00E9ditos Flamenguistas\r\n</html>");
		pontos.setForeground(vermelho);
		pontos.setFont(new Font("Rajdhani Medium", Font.BOLD, 40));
		pontos.setVerticalAlignment(SwingConstants.TOP);
		pontos.setBounds(21, 40, 466, 137);
		panel.add(pontos);
		
		JLabel emojo = new JLabel("");
		emojo.setIcon(new ImageIcon(acertoSeis.class.getResource("/img/haha.png")));
		emojo.setBounds(520, 11, 245, 171);
		panel.add(emojo);
		
		JLabel emojo1 = new JLabel("");
		emojo1.setBounds(31, 151, 165, 171);
		panel.add(emojo1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(acertoSeis.class.getResource("/img/haha.png")));
		lblNewLabel_1_2.setBounds(31, 151, 245, 171);
		panel.add(lblNewLabel_1_2);
		
		JLabel deyvin = new JLabel("");
		deyvin.setIcon(new ImageIcon(acertoSeis.class.getResource("/img/deyverson.png")));
		deyvin.setBounds(206, 151, 165, 227);
		panel.add(deyvin);
		
		JLabel andreas = new JLabel("");
		andreas.setHorizontalAlignment(SwingConstants.CENTER);
		andreas.setIcon(new ImageIcon(acertoSeis.class.getResource("/img/arrombado.png")));
		andreas.setBounds(376, 151, 165, 227);
		panel.add(andreas);
		
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
		home.setForeground(new Color(194, 42, 30));
		home.setBackground(Color.BLACK);
		home.setBounds(421, 397, 89, 23);
		panel.add(home);
		
		JButton avançar = new JButton("Morrer");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				creditos desisto = new creditos();
				
				desisto.reset();
			}
		});
		
		avançar.setForeground(new Color(194, 42, 30));
		avançar.setBackground(Color.BLACK);
		avançar.setBounds(610, 397, 89, 23);
		panel.add(avançar);
	}

}
