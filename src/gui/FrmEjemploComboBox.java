package gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmEjemploComboBox extends JFrame	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables globales
	JLabel lblGrado, lblAuspiciador;
	private JComboBox<String> cboGrado;
	private JComboBox<String> cboAuspiciador;
	
	//Constructor
	public FrmEjemploComboBox(){
		setBounds(10,10,556,350);
		getContentPane().setLayout(null);
		
		lblGrado = new JLabel("Grado");
		lblGrado.setBounds(30, 80, 120, 25);
		getContentPane().add(lblGrado);

		lblAuspiciador = new JLabel("Auspiciador");
		lblAuspiciador.setBounds(30, 130, 120, 25);
		getContentPane().add(lblAuspiciador);
		
		cboGrado = new JComboBox<String>();
		cboGrado.setBounds(185, 81, 296, 22);
		getContentPane().add(cboGrado);
		
		cboAuspiciador = new JComboBox<String>();
		cboAuspiciador.setBounds(185, 131, 296, 22);
		getContentPane().add(cboAuspiciador);

	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		FrmEjemploComboBox frm = new FrmEjemploComboBox();
		frm.setVisible(true);
	}


	
	
	

	
}




