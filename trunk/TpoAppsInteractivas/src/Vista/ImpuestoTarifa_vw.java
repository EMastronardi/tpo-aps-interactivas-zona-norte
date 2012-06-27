package Vista;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import Modelo.ElementoCobrableView;
import Modelo.IndustrialView;
import Util.Textos;
import Vista.MenuPrincipal_vw;
import Controlador.Sistema;

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
public class ImpuestoTarifa_vw extends javax.swing.JFrame {
	
	private Sistema sistema;
	
	private JLabel jlSeleccionar;
	private JComboBox jcbImpuestoTarifa;
	private JButton jbAceptar;
	private JButton jbCancelar;
	private JTextField jtfValor;
	private JLabel jlValor;

	
	public ImpuestoTarifa_vw(Sistema sistema) {
		super();
		initGUI();
		
		this.sistema = sistema;
		cargarElementosCobrabes();
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
				new MenuPrincipal_vw(sistema);
				}
			});
			
			this.setTitle("Modificar Impuesto o Tarifa");
			{
				jlSeleccionar = new JLabel();
				jlSeleccionar.setText("Seleccione Impuesto o Tarifa");
			}
			{
				ComboBoxModel jcbImpuestoTarifaModel = 
						new DefaultComboBoxModel(
								new String[] { "", "" });
				jcbImpuestoTarifa = new JComboBox();
				jcbImpuestoTarifa.setModel(jcbImpuestoTarifaModel);
			}
			{
				jlValor = new JLabel();
				jlValor.setText("Valor:");
			}
			{
				jtfValor = new JTextField();
			}
			{
				jbCancelar = new JButton();
				jbCancelar.setText("Cancelar");
			}
			{
				jbAceptar = new JButton();
				jbAceptar.setText("Modificar");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jlSeleccionar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jcbImpuestoTarifa, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				.addGap(17)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jtfValor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jlValor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jbAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jbCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(18, 18));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jlSeleccionar, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
				        .addGap(8)
				        .addComponent(jbCancelar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(37)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jlValor, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
				                .addGap(12)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addGap(0, 0, Short.MAX_VALUE)
				                        .addComponent(jbAceptar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(jtfValor, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 31, Short.MAX_VALUE)))
				                .addGap(114))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jcbImpuestoTarifa, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))))
				.addContainerGap(20, 20));
			thisLayout.linkSize(SwingConstants.VERTICAL, new Component[] {jtfValor, jcbImpuestoTarifa});
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jbAceptar, jbCancelar});
			pack();
			this.setSize(364, 188);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void addAcciones(){
		
		jbAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!jtfValor.getText().isEmpty()){
					ElementoCobrableView aux = (ElementoCobrableView) jcbImpuestoTarifa.getSelectedItem();
					if(sistema.modificarElementoCobrable(aux.getNroElementoCobrable(), Float.parseFloat(jtfValor.getText()))){
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.MODIFICACION_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
						//Vuelvo al menu principal
						dispose();
						new MenuPrincipal_vw(sistema);
					}
					else
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.MODIFICACION_ERROR, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(new PopUp_vw(), 
							Textos.FALTANTES, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
			}
		});
		
		jbCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MenuPrincipal_vw(sistema);
			}
		});
		
		jcbImpuestoTarifa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElementoCobrableView aux = (ElementoCobrableView) jcbImpuestoTarifa.getSelectedItem();
				jtfValor.setText(Float.toString(aux.getValor()));
			}
		});
	}
	
	private void cargarElementosCobrabes(){
		jcbImpuestoTarifa.removeAllItems();
		ArrayList<ElementoCobrableView> elem = sistema.obtenerElementosCobrables();
		for(ElementoCobrableView ec: elem){
			jcbImpuestoTarifa.addItem(ec);
		}
		ElementoCobrableView aux = (ElementoCobrableView) jcbImpuestoTarifa.getSelectedItem();
		jtfValor.setText(Float.toString(aux.getValor()));
	}

}
