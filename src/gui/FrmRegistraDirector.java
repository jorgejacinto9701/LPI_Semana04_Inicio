package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmRegistraDirector extends JFrame implements ActionListener 
							{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables globales
	JLabel lblTitulo, lblNombre, lblGrado, lblFecha;
	JTextField  txtNombre, txtFecha;
	JButton btnRegistrar;
	private JComboBox<String> cboGrado;
	
	//Constructor
	public FrmRegistraDirector(){
		setTitle("Registro de Jugador");
		setBounds(10,10,544,312);
		getContentPane().setLayout(null);
		
		lblTitulo = new JLabel("Registro de Director");
		lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 15));            
		lblTitulo.setBounds(0, 10, 528, 25);
		getContentPane().add(lblTitulo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 80, 120, 25);
		getContentPane().add(lblNombre);		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(200, 80, 284, 25);
		getContentPane().add(txtNombre);

		lblGrado = new JLabel("Grado");
		lblGrado.setBounds(30, 152, 120, 25);
		getContentPane().add(lblGrado);
		
		lblFecha = new JLabel("Fecha nacimiento");
		lblFecha.setBounds(30, 116, 120, 25);
		getContentPane().add(lblFecha);		
		
		txtFecha = new JTextField();
		txtFecha.setBounds(200, 116, 185, 25);
		getContentPane().add(txtFecha);	
	
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setIcon(new ImageIcon(FrmRegistraDirector.class.getResource("/iconos/save.gif")));
		btnRegistrar.setBounds(213,201,120,33);
		getContentPane().add(btnRegistrar);
		
		cboGrado = new JComboBox<String>();
		cboGrado.setBounds(200, 153, 185, 22);
		getContentPane().add(cboGrado);

	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		FrmRegistraDirector frm = new FrmRegistraDirector();
		frm.setVisible(true);
	}


	
	public void mensaje(String ms){
		JOptionPane.showMessageDialog(this, ms);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrarJButton(e);
		}
	}
	protected void actionPerformedBtnRegistrarJButton(ActionEvent e) {
	
		
	}
}




