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
import perguntas.segunda;
import perguntas.sexta;

public class acertoUm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acertoUm frame = new acertoUm();
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
	public acertoUm() {
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
		
		JLabel creditos = new JLabel("<html>\r\n+ 2019<br>\r\nCr\u00E9ditos Flamenguistas\r\n</html>");
		creditos.setForeground(Color.BLACK);
		creditos.setFont(new Font("Rajdhani Medium", Font.BOLD, 40));
		creditos.setVerticalAlignment(SwingConstants.TOP);
		creditos.setBounds(21, 40, 466, 137);
		panel.add(creditos);
		
		JLabel gabi = new JLabel("");
		gabi.setIcon(new ImageIcon(acertoUm.class.getResource("/img/gabiTorcida.jpeg")));
		gabi.setBounds(91, 212, 229, 172);
		panel.add(gabi);
		
		JLabel gol = new JLabel("");
		gol.setIcon(new ImageIcon(acertoUm.class.getResource("/img/2019.jpeg")));
		gol.setBounds(429, 160, 274, 171);
		panel.add(gol);
		
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
		home.setBounds(429, 397, 89, 23);
		panel.add(home);
		
		JButton avançar = new JButton("Continuar");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segunda proxima = new segunda();
				dispose();
				proxima.setVisible(true);
			}
		});
		avançar.setForeground(new Color(194, 42, 30));
		avançar.setBackground(Color.BLACK);
		avançar.setBounds(618, 397, 89, 23);
		panel.add(avançar);
	}
}
