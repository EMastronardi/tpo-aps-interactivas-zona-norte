package Vista;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import Vista.MenuPrincipal_vw;
import Controlador.Sistema;
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
public class SelectCliente_vw extends javax.swing.JFrame {
	
	private Sistema sistema;
	private ClienteResidencial_vw pClienteResidencial;
	
	private JLabel jlSeleccion;
	private ButtonGroup bgTipoAccion;
	private JButton jbAceptar;
	private JButton jbCancelar;
	private JComboBox jcbCliente;
	private JLabel jlCliente;
	private JRadioButton jrbBaja;
	private JRadioButton jrbModificacion;
	private JRadioButton jrbAlta;
	private JLabel jlAccion;
	private JRadioButton jrbIndustrial;
	private JRadioButton jrbResidencial;
	private ButtonGroup bgTipoCliente;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public SelectCliente_vw(Sistema sistema) {
		super();
		initGUI();
		addAcciones();
		this.sistema = sistema;
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			//Metodo para capturar el evento de salida y volver a instanciar el sistema
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
				new MenuPrincipal_vw(sistema);
				}
			});
			
			
			this.setTitle("Seleccion de Cliente");
			{
				jlSeleccion = new JLabel();
				jlSeleccion.setText("Seleccione Tipo Cliente");
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
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jrbResidencial, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlSeleccion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jrbIndustrial, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(16)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJrbAlta(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJlAccion(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJrbModificacion(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJrbBaja(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJcbCliente(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJlCliente(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(28)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJbCancelar(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJbAceptar(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(31, 31));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(getJlCliente(), GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(getJcbCliente(), GroupLayout.Alignment.LEADING, 0, 310, Short.MAX_VALUE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(62)
				                .addComponent(getJbAceptar(), GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				                .addGap(22)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(getJrbAlta(), GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(jrbResidencial, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 21, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(jrbIndustrial, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 21, Short.MAX_VALUE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(getJrbModificacion(), GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(getJrbBaja(), GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(23)
				                        .addComponent(getJbCancelar(), GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))))))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(getJlAccion(), GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 201, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jlSeleccion, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 201, Short.MAX_VALUE)))
				.addContainerGap(53, 53));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jlSeleccion, getJlAccion()});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {getJrbAlta(), getJrbModificacion(), getJrbBaja()});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {getJbCancelar(), getJbAceptar()});
			pack();
			this.setSize(435, 266);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getbgTipoCliente() {
		if(bgTipoCliente == null) {
			bgTipoCliente = new ButtonGroup();
		}
		return bgTipoCliente;
	}
	
	private JLabel getJlAccion() {
		if(jlAccion == null) {
			jlAccion = new JLabel();
			jlAccion.setText("Seleccione Accion");
		}
		return jlAccion;
	}
	
	private ButtonGroup getBgTipoAccion() {
		if(bgTipoAccion == null) {
			bgTipoAccion = new ButtonGroup();
		}
		return bgTipoAccion;
	}
	
	private JRadioButton getJrbAlta() {
		if(jrbAlta == null) {
			jrbAlta = new JRadioButton();
			jrbAlta.setText("Alta");
			getBgTipoAccion().add(jrbAlta);
		}
		return jrbAlta;
	}
	
	private JRadioButton getJrbModificacion() {
		if(jrbModificacion == null) {
			jrbModificacion = new JRadioButton();
			jrbModificacion.setText("Modificacion");
			getBgTipoAccion().add(jrbModificacion);
		}
		return jrbModificacion;
	}
	
	private JRadioButton getJrbBaja() {
		if(jrbBaja == null) {
			jrbBaja = new JRadioButton();
			jrbBaja.setText("Baja");
			getBgTipoAccion().add(jrbBaja);
		}
		return jrbBaja;
	}
	
	private JLabel getJlCliente() {
		if(jlCliente == null) {
			jlCliente = new JLabel();
			jlCliente.setText("Cliente");
			jlCliente.setEnabled(false);
		}
		return jlCliente;
	}
	
	private JComboBox getJcbCliente() {
		if(jcbCliente == null) {
			ComboBoxModel jcbClienteModel = 
					new DefaultComboBoxModel(
							new String[] { "", "" });
			jcbCliente = new JComboBox();
			jcbCliente.setModel(jcbClienteModel);
			jcbCliente.setEnabled(false);
		}
		return jcbCliente;
	}
	
	private JButton getJbCancelar() {
		if(jbCancelar == null) {
			jbCancelar = new JButton();
			jbCancelar.setText("Cancelar");
		}
		return jbCancelar;
	}
	
	private JButton getJbAceptar() {
		if(jbAceptar == null) {
			jbAceptar = new JButton();
			jbAceptar.setText("Aceptar");
		}
		return jbAceptar;
	}

	private void addAcciones(){
		
		jbAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jrbResidencial.isSelected()){
					if(jrbAlta.isSelected()){
						if(pClienteResidencial == null){
							dispose();
							pClienteResidencial = new ClienteResidencial_vw(sistema,0,null);
						}
					}
					else{
						if(jrbModificacion.isSelected()){
							dispose();
							pClienteResidencial = new ClienteResidencial_vw(sistema,1,(ResidencialView)jcbCliente.getSelectedItem());
						}
						else{	
							dispose();
							pClienteResidencial = new ClienteResidencial_vw(sistema,2,(ResidencialView)jcbCliente.getSelectedItem());
						}
					}
				}
				//hacer parte de industrial
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
				if(jrbAlta.isSelected()){
					jcbCliente.setEnabled(false);
					jlCliente.setEnabled(false);
					jcbCliente.removeAllItems();
				}
				else{
					if(jrbModificacion.isSelected() || jrbBaja.isSelected()){
						jcbCliente.setEnabled(true);
						jlCliente.setEnabled(true);
						cargarResidenciales();
					}
				}
			}
		});
		
		jrbIndustrial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jrbAlta.isSelected()){
					jcbCliente.setEnabled(false);
					jlCliente.setEnabled(false);
					jcbCliente.removeAllItems();
				}
				else{
					if(jrbModificacion.isSelected() || jrbBaja.isSelected()){
						jcbCliente.setEnabled(true);
						jlCliente.setEnabled(true);
						cargarIndustriales();
					}	
				}
			}
		});
		
		jrbAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jcbCliente.setEnabled(false);
				jlCliente.setEnabled(false);
				jcbCliente.removeAllItems();
			}
		});
		
		jrbModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jrbResidencial.isSelected()){
					jcbCliente.setEnabled(true);
					jlCliente.setEnabled(true);
					cargarResidenciales();
				}
				else{
					jcbCliente.setEnabled(true);
					jlCliente.setEnabled(true);
					cargarIndustriales();
				}
			}
		});
		
		jrbBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jrbResidencial.isSelected()){
					jcbCliente.setEnabled(true);
					jlCliente.setEnabled(true);
					cargarResidenciales();
				}
				else{
					jcbCliente.setEnabled(true);
					jlCliente.setEnabled(true);
					cargarIndustriales();
				}
			}
		});
		
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
