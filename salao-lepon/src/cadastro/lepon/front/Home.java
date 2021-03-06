package cadastro.lepon.front;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inserirPesquisCliente;
	private JButton buttonTodosOsCadastros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		
		//titulo da barra de cima
		super("lepon");
		
		//nao sei copiei do tutorial
		getContentPane().setLayout(new FlowLayout());
		
		
		// logo lepon
		ImageIcon logo = new ImageIcon("lepon-logo.png");
		
		// faz a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setBackground(new Color(233,227,206)); //cor do background
		contentPane.setLayout(null);
		setIconImage(logo.getImage());
	
		
		//botao de novo cliente, vai para tela novo cliente
		JButton buttonCadastrarCliente = new JButton("Cliente Novo");
		buttonCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaCadastro telaCadastro = new TelaCadastro();
				telaCadastro.setVisible(true);
			}
		});
		buttonCadastrarCliente.setBounds(22, 41, 125, 41);
		contentPane.add(buttonCadastrarCliente);
		
		
		// botao de cliente que ja eh cadastrado, vai para a tela de selecionar qual eh o cliente ja cadastrado
		JButton buttonCienteJaTemLogin = new JButton("Cliente Login");
		buttonCienteJaTemLogin.setBounds(22, 136, 125, 41);
		contentPane.add(buttonCienteJaTemLogin);
		
		
		// botao de pesquisa de cliente, mostra os dados se o cliente ja estiver cadastrado, se nao fala que n ta cadastrado
		inserirPesquisCliente = new JTextField("Pesquisar Clientes");
		inserirPesquisCliente.setBounds(244, 47, 174, 26);
		contentPane.add(inserirPesquisCliente);
		inserirPesquisCliente.setColumns(10);
		
		
		// botao para aparecer todos os cadastros, vai ser a logo lepon
		
		buttonTodosOsCadastros = new JButton("Ver Todos Cadastros");
		buttonTodosOsCadastros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonTodosOsCadastros.setBounds(244, 120, 174, 72);
		contentPane.add(buttonTodosOsCadastros);
		
	}
}
