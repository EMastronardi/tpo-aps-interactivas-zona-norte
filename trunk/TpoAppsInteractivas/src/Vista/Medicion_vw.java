package Vista;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.qt.datapicker.DatePicker;

import Util.ObservingTextField;
import Util.Textos;
import Vista.MenuPrincipal_vw;
import Controlador.Sistema;
import Modelo.Cliente;
import Modelo.IndustrialView;
import Modelo.ResidencialView;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Medicion_vw extends javax.swing.JFrame {
	
	private Sistema sistema;
	private ClienteResidencial_vw pClienteResidencial;
	private ClienteIndustrial_vw pClienteIndustrial;
	
	private JLabel jlSeleccionarCliente;
	private JLabel jlCliente;
	private JButton selFecha;
	private JButton jbCancelar;
	private JButton jbAceptar;
	private JTextField jtfValor;
	private JLabel jlValor;
	private JLabel jlFecha;
	private JComboBox jcbCliente;
	private JRadioButton jrbIndustrial;
	private JRadioButton jrbResidencial;
	private ButtonGroup bgTipoCliente;
	private ObservingTextField fecha;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public Medicion_vw(Sistema sistema) {
		super();
		initGUI();
		addAcciones();
		this.sistema = sistema;
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			//Metodo para capturar el evento de salida y volver a instanciar el sistema
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
				new MenuPrincipal_vw(sistema);
				}
			});
			
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			this.setTitle("Registrar Medicion");
			{
				jlSeleccionarCliente = new JLabel();
				jlSeleccionarCliente.setText("Seleccione Tipo de Cliente");
			}
			{
				jlCliente = new JLabel();
				jlCliente.setText("Cliente:");
			}
			{
				jrbResidencial = new JRadioButton();
				jrbResidencial.setText("Residencial");
				getbgTipoCliente().add(jrbResidencial);
				
			}
			{
				jrbIndustrial = new JRadioButton();
				jrbIndustrial.setText("Industrial");
				getbgTipoCliente().add(jrbIndustrial);
			}
			{
				fecha = new ObservingTextField();
				fecha.setEditable(false);
			}
			
			{
				ComboBoxModel jcbClienteModel = 
						new DefaultComboBoxModel(
								new String[] { "", "" });
				jcbCliente = new JComboBox();
				jcbCliente.setModel(jcbClienteModel);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jrbResidencial, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlSeleccionarCliente, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jrbIndustrial, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(34)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jcbCliente, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCliente, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getSelFecha(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(fecha, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJlFecha(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(22)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJtfValor(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJlValor(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 22, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJbAceptar(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJbCancelar(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jlCliente, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(getJlValor(), GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
				                .addGap(7))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(getJlFecha(), GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
				                .addGap(7)))
				        .addGap(22)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(getJbAceptar(), GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 151, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(fecha, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(getJtfValor(), GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
				                        .addGap(9)))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addComponent(getSelFecha(), 0, 166, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jcbCliente, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jlSeleccionarCliente, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
				        .addGap(12)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(getJbCancelar(), GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jrbResidencial, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jrbIndustrial, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)))
				        .addGap(16)))
				.addContainerGap());
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {getJbCancelar(), getJbAceptar()});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {getJbCancelar(), getJbAceptar()});
			pack();
			this.setSize(369, 286);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void addAcciones(){
		
		selFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				final Locale locale=Locale.US;
                DatePicker dp = new DatePicker(fecha, locale);
                dp.start(fecha);
			}
		});
		
		jbAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((jrbIndustrial.isSelected()||jrbResidencial.isSelected()) && !fecha.getText().isEmpty() && !jtfValor.getText().isEmpty()){
					try {
						if(jrbResidencial.isSelected()){
							ResidencialView aux = (ResidencialView) jcbCliente.getSelectedItem(); 

							SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
							Date date = formatter.parse(fecha.getText());

							if(sistema.RegistrarMedicion(aux.getNroCliente(), date , Float.parseFloat(jtfValor.getText()))){	
								JOptionPane.showMessageDialog(new PopUp_vw(), 
										Textos.MEDICION_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
							}
							else 
								JOptionPane.showMessageDialog(new PopUp_vw(), 
										Textos.MEDICION_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
						}
						else{
							IndustrialView aux = (IndustrialView) jcbCliente.getSelectedItem();
							DateFormat formatter = null; 
							Date date = null;
							formatter = new SimpleDateFormat("yyyy/mm/dd");
							date = formatter.parse(fecha.getText());
							if(sistema.RegistrarMedicion(aux.getNroCliente(), date , Float.parseFloat(jtfValor.getText()))){
								JOptionPane.showMessageDialog(new PopUp_vw(), 
										Textos.MEDICION_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
							}
							else 
								JOptionPane.showMessageDialog(new PopUp_vw(), 
										Textos.MEDICION_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
						}
					} catch (ParseException e1) {
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.MEDICION_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
					}
					//Vuelvo al menu principal
					dispose();
					new MenuPrincipal_vw(sistema);
				}
				else{
					JOptionPane.showMessageDialog(new PopUp_vw(), 
							Textos.FALTANTES, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		jbCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MenuPrincipal_vw(sistema);
			}
		});
		
		jrbResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcbCliente.removeAllItems();
				cargarResidenciales();		
			}
		});
		
		jrbIndustrial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcbCliente.removeAllItems();
				cargarIndustriales();	
			}
		});
		
	}
	
	private ButtonGroup getbgTipoCliente() {
		if(bgTipoCliente == null) {
			bgTipoCliente = new ButtonGroup();
		}
		return bgTipoCliente;
	}

	private JLabel getJlFecha() {
		if(jlFecha == null) {
			jlFecha = new JLabel();
			jlFecha.setText("Fecha:");
		}
		return jlFecha;
	}
	
	private JLabel getJlValor() {
		if(jlValor == null) {
			jlValor = new JLabel();
			jlValor.setText("Valor: ");
		}
		return jlValor;
	}
	
	private JTextField getJtfValor() {
		if(jtfValor == null) {
			jtfValor = new JTextField();
		}
		return jtfValor;
	}
	
	private JButton getJbAceptar() {
		if(jbAceptar == null) {
			jbAceptar = new JButton();
			jbAceptar.setText("Aceptar");
		}
		return jbAceptar;
	}
	
	private JButton getJbCancelar() {
		if(jbCancelar == null) {
			jbCancelar = new JButton();
			jbCancelar.setText("Cancelar");
		}
		return jbCancelar;
	}
	
	private JButton getSelFecha() {
		if(selFecha == null) {
			selFecha = new JButton();
			selFecha.setText("Seleccionar Fecha");
		}
		return selFecha;
	}
	
	private void cargarResidenciales(){
		jcbCliente.removeAllItems();
		ArrayList<ResidencialView> residenciales = sistema.obtenerClientesResidencial();
		for(ResidencialView r: residenciales){
			jcbCliente.addItem(r);
		}
	}
	
	private void cargarIndustriales(){
		jcbCliente.removeAllItems();
		ArrayList<IndustrialView> industriales = sistema.obtenerClientesIndustrial();
		for(IndustrialView i: industriales){
			jcbCliente.addItem(i);
		}
	}
}
