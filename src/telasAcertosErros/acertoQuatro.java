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
import perguntas.quinta;
import perguntas.sexta;

public class acertoQuatro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acertoQuatro frame = new acertoQuatro();
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
	public acertoQuatro() {
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
		
		JLabel lblNewLabel = new JLabel("<html>\r\n+ 81<br>\r\nCr\u00E9ditos Flamenguistas\r\n</html>");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Rajdhani Medium", Font.BOLD, 40));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(21, 40, 466, 137);
		panel.add(lblNewLabel);
		
		JLabel nunes = new JLabel("");
		nunes.setIcon(new ImageIcon(acertoQuatro.class.getResource("/img/nunes.jpg")));
		nunes.setBounds(19, 186, 225, 248);
		panel.add(nunes);
		
		JLabel eu = new JLabel("");
		eu.setIcon(new ImageIcon(acertoQuatro.class.getResource("/img/leandro.png")));
		eu.setBounds(503, 6, 274, 171);
		panel.add(eu);
		
		JLabel lendas = new JLabel("");
		lendas.setIcon(new ImageIcon(acertoQuatro.class.getResource("/img/1981.jpeg")));
		lendas.setBounds(254, 152, 330, 248);
		panel.add(lendas);
		
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
		home.setBounds(417, 398, 89, 23);
		panel.add(home);
		
		JButton avançar = new JButton("Continuar");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quinta proxima = new quinta();
				dispose();
				proxima.setVisible(true);
			}
		});
		avançar.setForeground(new Color(194, 42, 30));
		avançar.setBackground(Color.BLACK);
		avançar.setBounds(606, 398, 89, 23);
		panel.add(avançar);
	}

}
