package func;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import perguntas.primeira;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class telaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	
	
	public telaInicial() {
		
		
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
		
		
		JLabel dica = new JLabel("<html>\r\n<p>Clique no escudo para come\u00E7ar</p>\r\n</html");
		dica.setFont(new Font("Segoe UI", Font.BOLD, 13));
		dica.setForeground(Color.WHITE);
		dica.setVerticalAlignment(SwingConstants.TOP);
		dica.setHorizontalAlignment(SwingConstants.LEFT);
		dica.setBounds(597, 309, 117, 78);
		panel.add(dica);
		
		JButton iniciar = new JButton("");
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				primeira uma = new primeira();
				uma.setVisible(true);
			
			}
		});
		iniciar.setIcon(new ImageIcon(telaInicial.class.getResource("/img/mengo.png")));
		iniciar.setSelectedIcon(new ImageIcon(telaInicial.class.getResource("/img/mengo.png")));
		iniciar.setBorder(null);
		iniciar.setFocusPainted(false);
		iniciar.setForeground(vermelho);
		iniciar.setBackground(vermelho);
		iniciar.setBounds(440, 273, 139, 152);
		panel.add(iniciar);
		
		JLabel titulo = new JLabel("<html>\r\nTeste de cr\u00E9ditos sociais <br>\r\nFlamenguistas\r\n</html>");
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("Rajdhani Medium", Font.BOLD, 60));
		titulo.setVerticalAlignment(SwingConstants.TOP);
		titulo.setBounds(10, 214, 724, 255);
		panel.add(titulo);
		
		JLabel zico = new JLabel("");
		zico.setIcon(new ImageIcon(telaInicial.class.getResource("/img/zico.png")));
		zico.setBounds(281, 11, 162, 223);
		panel.add(zico);
	}
}
