package br.app.mvictor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;

import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class Tela {

	private JFrame frmConverterValorEm;
	private JTextField txtIPA = new JTextField();
	private JTextField txtIPB = new JTextField();
	private JTextField txtIPC = new JTextField();
	private JTextField txtIPD = new JTextField();
	private final JTextField resA = new JTextField();
	private final JTextField resB = new JTextField();
	private final JTextField resC = new JTextField();
	private final JTextField resD = new JTextField();
	public Binary bin;
	public Utils utilidade;
	private final JButton btnDEC = new JButton("DECIMAL");
	private JTextField txtIP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmConverterValorEm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize(){
		bin = new Binary();
		utilidade = new Utils();
		frmConverterValorEm = new JFrame();
		frmConverterValorEm.setResizable(false);
		frmConverterValorEm.setTitle("CONVERTER VALOR EM BINARIO OU DECIMAL");
		frmConverterValorEm.setBounds(100, 100, 431, 166);
		frmConverterValorEm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConverterValorEm.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(123, 102, 1, 1);
		frmConverterValorEm.getContentPane().add(desktopPane);
		
		JLabel lblBinario = new JLabel("IP/BINARIO");
		lblBinario.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblBinario.setBounds(10, 38, 92, 25);
		frmConverterValorEm.getContentPane().add(lblBinario);
	
		
		try{
		}
		catch(Exception ex){
			ex.getMessage();
		}
		
		JButton btnToBinario = new JButton("BINARIO");
		btnToBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
				try{
					if(Verificador.isEmpty(resA.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(resA.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isEmpty(resB.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(resB.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isEmpty(resC.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(resC.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isEmpty(resD.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(resD.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else{
						
						String A = bin.DecimalToBinary(Integer.parseInt(resA.getText()));
						String B = bin.DecimalToBinary(Integer.parseInt(resB.getText()));
						String C = bin.DecimalToBinary(Integer.parseInt(resC.getText()));
						String D = bin.DecimalToBinary(Integer.parseInt(resD.getText()));
						
						
						int tamanhoA = A.length();
						int tamanhoB = B.length();
						int tamanhoC = C.length();
						int tamanhoD = D.length();
						
						String parteA = utilidade.toResultadoBinary(tamanhoA, A);
						String parteB = utilidade.toResultadoBinary(tamanhoB, B);
						String parteC = utilidade.toResultadoBinary(tamanhoC, C);
						String parteD = utilidade.toResultadoBinary(tamanhoD, D);
						
						txtIPA.setText(parteA);
						txtIPB.setText(parteB);
						txtIPC.setText(parteC);
						txtIPD.setText(parteD);
						
						System.out.println("IP EM BINÁRIO : "+parteA+"."+parteB+"."+parteC+"."+parteD);
						txtIP.setText(parteA+"."+parteB+"."+parteC+"."+parteD);
					}
				}
				catch(Exception ex){
					ex.getMessage();
				}
				
				
				
				
			}
		});
		
		btnToBinario.setBounds(308, 38, 89, 23);
		frmConverterValorEm.getContentPane().add(btnToBinario);
		
		txtIPA.setBounds(112, 39, 40, 20);
		frmConverterValorEm.getContentPane().add(txtIPA);
		txtIPA.setColumns(10);
		
		txtIPB.setColumns(10);
		txtIPB.setBounds(158, 39, 40, 20);
		frmConverterValorEm.getContentPane().add(txtIPB);
		
		txtIPC.setColumns(10);
		txtIPC.setBounds(208, 39, 40, 20);
		frmConverterValorEm.getContentPane().add(txtIPC);
		
		txtIPD.setColumns(10);
		txtIPD.setBounds(258, 39, 40, 20);
		frmConverterValorEm.getContentPane().add(txtIPD);
		resA.setColumns(10);
		resA.setBounds(112, 70, 40, 20);
		
		frmConverterValorEm.getContentPane().add(resA);
		resB.setColumns(10);
		resB.setBounds(158, 69, 40, 20);
		
		frmConverterValorEm.getContentPane().add(resB);
		resC.setColumns(10);
		resC.setBounds(208, 70, 40, 20);
		
		frmConverterValorEm.getContentPane().add(resC);
		resD.setColumns(10);
		resD.setBounds(258, 70, 40, 20);
		
		frmConverterValorEm.getContentPane().add(resD);
		btnDEC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					if(Verificador.isEmpty(txtIPA.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(txtIPA.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isEmpty(txtIPB.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(txtIPB.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isEmpty(txtIPC.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(txtIPC.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isEmpty(txtIPD.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else if(Verificador.isNull(txtIPD.getText().toString())){
						JOptionPane.showMessageDialog(frmConverterValorEm, "Campo vázio!");
					}
					else{
						
						resA.setText(String.valueOf(Integer.parseInt(txtIPA.getText(), 2)));
						resB.setText(String.valueOf(Integer.parseInt(txtIPB.getText(), 2)));
						resC.setText(String.valueOf(Integer.parseInt(txtIPC.getText(), 2)));
						resD.setText(String.valueOf(Integer.parseInt(txtIPD.getText(), 2)));
						
						String res = String.valueOf(Integer.parseInt(txtIPA.getText(), 2));
						res += "."+String.valueOf(Integer.parseInt(txtIPB.getText(), 2));
						res += "."+String.valueOf(Integer.parseInt(txtIPC.getText(), 2));
						res += "."+String.valueOf(Integer.parseInt(txtIPD.getText(), 2));
						
						txtIP.setText(res);
						System.out.println("IP EM DECIMAL: "+res);
					}
				}
				catch(Exception ex){
					ex.getMessage();
				}
			}
		});
		btnDEC.setBounds(308, 69, 89, 23);
		
		frmConverterValorEm.getContentPane().add(btnDEC);
		
		JButton btnClean = new JButton("Limpar");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtIPA.setText(null);
				txtIPB.setText(null);
				txtIPC.setText(null);
				txtIPD.setText(null);
				
				resA.setText(null);
				resB.setText(null);
				resC.setText(null);
				resD.setText(null);
			}
		});
		btnClean.setBounds(308, 102, 89, 23);
		frmConverterValorEm.getContentPane().add(btnClean);
		
		JLabel lblDecimal = new JLabel("IP/DECIMAL");
		lblDecimal.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblDecimal.setBounds(10, 70, 92, 25);
		frmConverterValorEm.getContentPane().add(lblDecimal);
		
		txtIP = new JTextField();
		txtIP.setBounds(112, 102, 186, 20);
		frmConverterValorEm.getContentPane().add(txtIP);
		txtIP.setColumns(10);
		
	}
}
