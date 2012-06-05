package Vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import Util.Textos;
import Vista.PopUp_vw;
import Vista.MenuPrincipal_vw;
import Controlador.Sistema;
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
public class ClienteResidencial_vw extends javax.swing.JFrame {
	
	private Sistema sistema = null;
	private int operacion;
	
	private JLabel jlNombre;
	private JLabel jlDepto;
	private JButton jbCancelar;
	private JButton jbAceptar;
	private JTextField jtProvincia;
	private JTextField jtLocalidad;
	private JTextField jtCP;
	private JTextField jtDepto;
	private JTextField jtPiso;
	private JTextField jtAltura;
	private JTextField jtCalle;
	private JTextField jtApellido;
	private JTextField jtNombre;
	private JTextField jtNroCliente;
	private JLabel jlProvincia;
	private JLabel jlLocalidad;
	private JLabel jlCP;
	private JLabel jlPiso;
	private JLabel jlAltura;
	private JLabel jlCalle;
	private JLabel jlApellido;
	private JLabel jlNroCliente;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public ClienteResidencial_vw(Sistema sistema, int op) {
		super();
		initGUI();
		this.sistema = sistema;
		this.operacion = op;
		addAcciones();
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
					dispose();
					new MenuPrincipal_vw(sistema);
				}
			});
			
			this.setTitle("Cliente Residencial");
			{
				jlNombre = new JLabel();
				jlNombre.setText("Nombre:");
			}
			{
				jlNroCliente = new JLabel();
				jlNroCliente.setText("Nro Cliente:");
			}
			{
				jlApellido = new JLabel();
				jlApellido.setText("Apellido:");
			}
			{
				jlCalle = new JLabel();
				jlCalle.setText("Calle:");
			}
			{
				jlAltura = new JLabel();
				jlAltura.setText("Altura:");
			}
			{
				jlPiso = new JLabel();
				jlPiso.setText("Piso:");
			}
			{
				jlDepto = new JLabel();
				jlDepto.setText("Depto:");
			}
			{
				jlCP = new JLabel();
				jlCP.setText("C.P:");
			}
			{
				jlLocalidad = new JLabel();
				jlLocalidad.setText("Localidad:");
			}
			{
				jlProvincia = new JLabel();
				jlProvincia.setText("Provincia:");
			}
			{
				jtNroCliente = new JTextField();
				jtNroCliente.setEnabled(false);
			}
			{
				jbAceptar = new JButton();
				jbAceptar.setText("Aceptar");
			}
			{
				jbCancelar = new JButton();
				jbCancelar.setText("Cancelar");
			}
			{
				jtNombre = new JTextField();
			}
			{
				jtApellido = new JTextField();
			}
			{
				jtCalle = new JTextField();
			}
			{
				jtAltura = new JTextField();
			}
			{
				jtPiso = new JTextField();
			}
			{
				jtDepto = new JTextField();
			}
			{
				jtCP = new JTextField();
			}
			{
				jtLocalidad = new JTextField();
			}
			{
				jtProvincia = new JTextField();
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jlNroCliente, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jtNroCliente, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jlNombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jtNombre, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtApellido, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlApellido, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtCalle, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCalle, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtAltura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlAltura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtPiso, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlPiso, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtDepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlDepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtCP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtLocalidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlLocalidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtProvincia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlProvincia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(16)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jbAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jbCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jlProvincia, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlLocalidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCP, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlDepto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlPiso, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlAltura, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCalle, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlApellido, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlNombre, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlNroCliente, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGap(24)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(jbAceptar, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addComponent(jbCancelar, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(7)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtProvincia, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtLocalidad, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtCP, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtDepto, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtPiso, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtAltura, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtCalle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtApellido, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jtNombre, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jtNroCliente, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 149, Short.MAX_VALUE)))))
				.addContainerGap(29, 29));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {jtProvincia, jtLocalidad, jtCP, jtDepto, jtPiso, jtAltura, jtCalle, jtApellido, jtNombre, jtNroCliente});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jtNombre, jtApellido, jtCalle, jtAltura, jtPiso, jtDepto, jtCP, jtLocalidad, jtProvincia});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jlApellido, jlNombre, jlNroCliente, jlCalle, jlAltura, jlPiso, jlDepto, jlCP, jlLocalidad, jlProvincia});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jbAceptar, jbCancelar});
			pack();
			this.setSize(444, 340);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void addAcciones(){
		
		jbAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operacion==0){//Cliente nuevo
					if(!jtApellido.getText().isEmpty()  && !jtNombre.getText().isEmpty() && !jtCalle.getText().isEmpty() &&
							!jtAltura.getText().isEmpty() && !jtPiso.getText().isEmpty() && !jtDepto.getText().isEmpty() &&
							!jtCP.getText().isEmpty() && !jtProvincia.getText().isEmpty() && !jtLocalidad.getText().isEmpty()){
						
						if(sistema.altaClienteResidencial(jtCalle.getText(), Integer.parseInt(jtAltura.getText()), Integer.parseInt(jtPiso.getText()), jtDepto.getText(), jtCP.getText(), jtLocalidad.getText(), jtProvincia.getText(), jtNombre.getText(), jtApellido.getText())){
							JOptionPane.showMessageDialog(new PopUp_vw(), 
									Textos.ALTA_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
							//Vuelvo al menu principal
							dispose();
							new MenuPrincipal_vw(sistema);
						}
						else{
							JOptionPane.showMessageDialog(new PopUp_vw(), 
									Textos.ALTA_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
						}
					}
					else{
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.FALTANTES, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
					}
				
				}
				else{
					if(operacion == 1){//Modificacion
						if(!jtApellido.getText().isEmpty()  && !jtNombre.getText().isEmpty() && !jtCalle.getText().isEmpty() &&
								!jtAltura.getText().isEmpty() && !jtPiso.getText().isEmpty() && !jtDepto.getText().isEmpty() &&
								!jtCP.getText().isEmpty() && !jtProvincia.getText().isEmpty() && !jtLocalidad.getText().isEmpty()){
							
							if(sistema.modificarClienteResidencial(Integer.parseInt(jtNroCliente.getText()), jtCalle.getText(), Integer.parseInt(jtAltura.getText()), Integer.parseInt(jtPiso.getText()), jtDepto.getText(), jtCP.getText(), jtLocalidad.getText(), jtProvincia.getText(), jtNombre.getText(), jtApellido.getText())){
								JOptionPane.showMessageDialog(new PopUp_vw(), 
										Textos.MODIFICACION_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
								//Vuelvo al menu principal
								dispose();
								new MenuPrincipal_vw(sistema);
							}
							else{
								JOptionPane.showMessageDialog(new PopUp_vw(), 
										Textos.MODIFICACION_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
							}
						}
						else{
							JOptionPane.showMessageDialog(new PopUp_vw(), 
									Textos.FALTANTES, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
						}
					}//Baja
					if(sistema.bajaClienteResidencial(Integer.parseInt(jtNroCliente.getText()), null, null, null, null, null, null, null, null, null)){
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.BAJA_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
						//Vuelvo al menu principal
						dispose();
						new MenuPrincipal_vw(sistema);
					}
					else{
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.BAJA_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
					}
				}
			}	
		});
		
		jbCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MenuPrincipal_vw(sistema);
			}
		});
	}
	
	public void cargarResidencial(ResidencialView r){
		
		jtNroCliente.setText(String.valueOf(r.getNroCliente()));
		jtNombre.setText(r.getNombre());
		jtApellido.setText(r.getApellido());
		jtCalle.setText(r.getCalle());
		jtAltura.setText(String.valueOf(r.getAltura()));
		jtPiso.setText(String.valueOf(r.getPiso()));
		jtDepto.setText(r.getDepartamento());
		jtCP.setText(r.getCodigoPostal());
		jtLocalidad.setText(r.getLocalidad());
		jtProvincia.setText(r.getProvincia());
		
		if(operacion == 1)
			jbAceptar.setText("Modificar");
		else
			jbAceptar.setText("Baja");	
	}
	
	public void inhabilitarCampos(){
		
		jtNroCliente.setEnabled(false);
		jtNombre.setEnabled(false);
		jtApellido.setEnabled(false);
		jtCalle.setEnabled(false);
		jtAltura.setEnabled(false);
		jtPiso.setEnabled(false);
		jtDepto.setEnabled(false);
		jtCP.setEnabled(false);
		jtLocalidad.setEnabled(false);
		jtProvincia.setEnabled(false);
		
	}

}
