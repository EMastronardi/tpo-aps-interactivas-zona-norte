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

import Controlador.Sistema;
import Modelo.IndustrialView;
import Util.Textos;
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
public class ClienteIndustrial_vw extends javax.swing.JFrame {
	
	private Sistema sistema;
	private int operacion;
	
	private JLabel jlRA;
	private JLabel jlDepto;
	private JTextField jtIIBB;
	private JLabel jlCF;
	private JLabel jlIIBB;
	private JTextField jtCF;
	private JButton jbCancelar;
	private JButton jbAceptar;
	private JTextField jtProvincia;
	private JTextField jtLocalidad;
	private JTextField jtCP;
	private JTextField jtDepto;
	private JTextField jtPiso;
	private JTextField jtAltura;
	private JTextField jtCalle;
	private JTextField jtCUIT;
	private JTextField jtRA;
	private JTextField jtNroCliente;
	private JLabel jlProvincia;
	private JLabel jlLocalidad;
	private JLabel jlCP;
	private JLabel jlPiso;
	private JLabel jlAltura;
	private JLabel jlCalle;
	private JLabel jlCUIT;
	private JLabel jlNroCliente;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public ClienteIndustrial_vw(Sistema sistema, int op) {
		super();
		this.sistema = sistema;
		this.operacion = op;
		initGUI();
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
			
			this.setTitle("Cliente Industrial");
			{
				jlRA = new JLabel();
				jlRA.setText("Razon Social:");
			}
			{
				jlNroCliente = new JLabel();
				jlNroCliente.setText("Nro Cliente:");
			}
			{
				jlCUIT = new JLabel();
				jlCUIT.setText("CUIT:");
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
				jlIIBB = new JLabel();
				jlIIBB.setText("Ingresos Brutos:");
			}
			{
				jlCF = new JLabel();
				jlCF.setText("Condicion Fiscal:");
			}
			{
				jtIIBB = new JTextField();
			}
			{
				jtCF = new JTextField();
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
				jtRA = new JTextField();
			}
			{
				jtCUIT = new JTextField();
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
				    .addComponent(jlRA, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jtRA, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtCUIT, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCUIT, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
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
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtIIBB, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlIIBB, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtCF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jbAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jbCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(18, 18));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jlCF, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlIIBB, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlProvincia, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlLocalidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCP, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlDepto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlPiso, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlAltura, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCalle, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlCUIT, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlRA, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlNroCliente, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGap(61)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(jbAceptar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jtNroCliente, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 23, Short.MAX_VALUE)))
				        .addGap(25)
				        .addComponent(jbCancelar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtCF, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtIIBB, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtProvincia, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtLocalidad, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtCP, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtDepto, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtPiso, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtAltura, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtCalle, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtCUIT, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jtRA, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)))
				.addContainerGap(42, 42));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {jtCP, jtDepto, jtPiso, jtAltura, jtCalle, jtCUIT, jtRA, jtNroCliente});
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {jtCF, jtIIBB, jtProvincia, jtLocalidad});
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {jbAceptar, jbCancelar});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jtCF, jtIIBB, jtProvincia});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jlProvincia, jlIIBB, jlCF});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jlCUIT, jlRA, jlNroCliente, jlCalle, jlAltura, jlPiso, jlDepto, jlCP, jlLocalidad});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jtRA, jtCUIT, jtCalle, jtAltura, jtPiso, jtDepto, jtCP, jtLocalidad});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jbAceptar, jbCancelar});
			pack();
			this.setSize(492, 394);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void addAcciones(){
		
		jbAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operacion==0){//Cliente nuevo
					if(!jtRA.getText().isEmpty()  && !jtCUIT.getText().isEmpty() && !jtCalle.getText().isEmpty() &&
							!jtAltura.getText().isEmpty() && !jtPiso.getText().isEmpty() && !jtDepto.getText().isEmpty() &&
							!jtCP.getText().isEmpty() && !jtProvincia.getText().isEmpty() && !jtLocalidad.getText().isEmpty() && !jtIIBB.getText().isEmpty() && !jtCF.getText().isEmpty()){
						
							if(sistema.altaClienteIndustrial(jtCalle.getText(), Integer.parseInt(jtAltura.getText()),  Integer.parseInt(jtPiso.getText()), jtDepto.getText(), jtCP.getText(), jtLocalidad.getText(), jtProvincia.getText(), jtRA.getText(), jtCUIT.getText(), jtIIBB.getText(), jtCF.getText())){
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
						if(!jtRA.getText().isEmpty()  && !jtCUIT.getText().isEmpty() && !jtCalle.getText().isEmpty() &&
								!jtAltura.getText().isEmpty() && !jtPiso.getText().isEmpty() && !jtDepto.getText().isEmpty() &&
								!jtCP.getText().isEmpty() && !jtProvincia.getText().isEmpty() && !jtLocalidad.getText().isEmpty() && !jtIIBB.getText().isEmpty() && !jtCF.getText().isEmpty()){
							
							if(sistema.modificarClienteIndustrial(Integer.parseInt(jtNroCliente.getText()),jtCalle.getText(),  Integer.parseInt(jtAltura.getText()),  Integer.parseInt(jtPiso.getText()), jtDepto.getText(), jtCP.getText(), jtLocalidad.getText(), jtProvincia.getText(), jtRA.getText(), jtCUIT.getText(), jtIIBB.getText(), jtCF.getText())){
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
					else{
						if(sistema.bajaClienteIndustrial(Integer.parseInt(jtNroCliente.getText()), null, null, null, null, null, null, null, null, null, null, null)){
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
			}	
		});
		
		jbCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MenuPrincipal_vw(sistema);
			}
		});
	}
	
	public void cargarIndustrial(IndustrialView i){
		
		jtNroCliente.setText(String.valueOf(i.getNroCliente()));
		jtRA.setText(i.getRazonSocial());
		jtCUIT.setText(i.getCuit());
		jtCalle.setText(i.getCalle());
		jtAltura.setText(String.valueOf(i.getAltura()));
		jtPiso.setText(String.valueOf(i.getPiso()));
		jtDepto.setText(i.getDepartamento());
		jtCP.setText(i.getCodigoPostal());
		jtLocalidad.setText(i.getLocalidad());
		jtProvincia.setText(i.getProvincia());
		jtCF.setText(i.getCategoria());
		jtIIBB.setText(i.getIngresosBrutos());
		
		if(operacion == 1)
			jbAceptar.setText("Modificar");
		else
			jbAceptar.setText("Baja");	
	}
	
	public void inhabilitarCampos(){
		
		jtNroCliente.setEnabled(false);
		jtRA.setEnabled(false);
		jtCUIT.setEnabled(false);
		jtCalle.setEnabled(false);
		jtAltura.setEnabled(false);
		jtPiso.setEnabled(false);
		jtDepto.setEnabled(false);
		jtCP.setEnabled(false);
		jtLocalidad.setEnabled(false);
		jtProvincia.setEnabled(false);
		jtCF.setEnabled(false);
		jtIIBB.setEnabled(false);
	}
		
}
