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
import perguntas.quarta;
import perguntas.sexta;

public class acertoTres extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acertoTres frame = new acertoTres();
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
	public acertoTres() {
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
		
		JLabel lblNewLabel = new JLabel("<html>\r\n+ 1895<br>\r\nCr\u00E9ditos Flamenguistas\r\n</html>");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Rajdhani Medium", Font.BOLD, 40));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(21, 40, 466, 137);
		panel.add(lblNewLabel);
		
		JLabel duplafoda = new JLabel("");
		duplafoda.setHorizontalAlignment(SwingConstants.CENTER);
		duplafoda.setIcon(new ImageIcon(acertoTres.class.getResource("/img/gabi-bh.png")));
		duplafoda.setBounds(494, 4, 221, 234);
		panel.add(duplafoda);
		
		JLabel melhorqueeto = new JLabel("");
		melhorqueeto.setIcon(new ImageIcon(acertoTres.class.getResource("/img/obina.png")));
		melhorqueeto.setHorizontalAlignment(SwingConstants.CENTER);
		melhorqueeto.setBounds(49, 174, 221, 234);
		panel.add(melhorqueeto);
		
		JLabel brocador = new JLabel("");
		brocador.setIcon(new ImageIcon(acertoTres.class.getResource("/img/brocador.png")));
		brocador.setHorizontalAlignment(SwingConstants.CENTER);
		brocador.setBounds(298, 153, 221, 234);
		panel.add(brocador);
		
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
		home.setBounds(406, 401, 89, 23);
		panel.add(home);
		
		JButton avançar = new JButton("Continuar");
		avançar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quarta proxima = new quarta();
				dispose();
				proxima.setVisible(true);
			}
		});
		avançar.setForeground(new Color(194, 42, 30));
		avançar.setBackground(Color.BLACK);
		avançar.setBounds(595, 401, 89, 23);
		panel.add(avançar);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(acertoUm.class.getResource("/img/2019.jpeg")));
		lblNewLabel_1_1.setBounds(429, 160, 274, 171);
	}

}
