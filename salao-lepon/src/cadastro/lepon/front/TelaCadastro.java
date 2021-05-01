package cadastro.lepon.front;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cadastro.lepon.Cliente;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TelaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2745955931256415347L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField nomeTextField;
	private JTextField cpfTextField;
	private JTextField enderecoTextField;
	private JTextField telefoneTextField;
	private JTextField emailTextFiled;
	private JTextField nascimentoTextField;
	private JButton concluirCadastroButton;
	private JTextField diaNascimentoTextField;
	private JTextField mesNascimentoTextField;
	private JTextField anoNascimentoTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setBackground(new Color(233,227,206)); //cor do background
		contentPane.setLayout(null);
		
		//text fields abaixo 
		
		nomeTextField = new JTextField("Nome");
		nomeTextField.setBounds(188, 80, 130, 26);
		contentPane.add(nomeTextField);
		nomeTextField.setColumns(10);
		
		cpfTextField = new JTextField("CPF");
		cpfTextField.setColumns(10);
		cpfTextField.setBounds(472, 80, 130, 26);
		contentPane.add(cpfTextField);
		
		enderecoTextField = new JTextField("Endereco");
		enderecoTextField.setColumns(10);
		enderecoTextField.setBounds(756, 80, 130, 26);
		contentPane.add(enderecoTextField);
		
		telefoneTextField = new JTextField("Telefone");
		telefoneTextField.setColumns(10);
		telefoneTextField.setBounds(330, 80, 130, 26);
		contentPane.add(telefoneTextField);
		
		emailTextFiled = new JTextField("Email");
		emailTextFiled.setColumns(10);
		emailTextFiled.setBounds(614, 80, 130, 26);
		contentPane.add(emailTextFiled);
		
		// Text fields para inserir dia, mes e ano 
		
		diaNascimentoTextField = new JTextField("Dia");
		diaNascimentoTextField.setBounds(188, 170, 39, 26);
		contentPane.add(diaNascimentoTextField);
		diaNascimentoTextField.setColumns(10);
		
		mesNascimentoTextField = new JTextField("Mes");
		mesNascimentoTextField.setColumns(10);
		mesNascimentoTextField.setBounds(239, 170, 39, 26);
		contentPane.add(mesNascimentoTextField);
		
		anoNascimentoTextField = new JTextField("Ano");
		anoNascimentoTextField.setColumns(10);
		anoNascimentoTextField.setBounds(290, 170, 39, 26);
		contentPane.add(anoNascimentoTextField);
		
		
		
		
		//button para concluir cadastro
		
		concluirCadastroButton = new JButton("Concluir Cadastro");
		concluirCadastroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				//transforma os text recebidos dos texfields para inteiros
				int diaNascimento = Integer.parseInt(diaNascimentoTextField.getText());
				int mesNascimento = Integer.parseInt(mesNascimentoTextField.getText());
				int anoNascimento = Integer.parseInt(anoNascimentoTextField.getText());
				
				
				// variavel que armazena os inteiros recebidos de dia mes e ano e cria um localdate
				LocalDate nascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
				
				Cliente cliente = new Cliente(nomeTextField.getText(),
						cpfTextField.getText(),
						enderecoTextField.getText(),
						telefoneTextField.getText(),
						emailTextFiled.getText(),
						nascimento);
				
				
				} catch (NumberFormatException ex) {
					System.out.println("O valor inserido eh invalido");
				}
				
			}
		});
		concluirCadastroButton.setBounds(716, 334, 170, 29);
		contentPane.add(concluirCadastroButton);
		
		
		
		
	}
}
