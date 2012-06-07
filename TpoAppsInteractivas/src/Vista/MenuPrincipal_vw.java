package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import Util.Textos;
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
public class MenuPrincipal_vw extends javax.swing.JFrame {
	
	private Sistema sistema; 
	private SelectCliente_vw pSelectCliente;
	private Medicion_vw pMedicion;
	private ImpuestoTarifa_vw pImpuestoTarifa;
	
	private JMenuBar jMenuPrincipal;
	private JMenu jmFacturacion;
	private JMenu jmReportes;
	private JMenuItem jmiSelectCliente;
	private JMenuItem jmiRegistrarMedicion;
	private JMenu jmImpuestoTarifa;
	private JMenu jmMedicion;
	private JMenuItem jmiSalir;
	private JMenu jmSalir;
	private JMenuItem jmiGenerarFacturacion;
	private JMenuItem jmiImpuestoTarifa;
	private JMenu jmCliente;
	
	public MenuPrincipal_vw(Sistema sistema) {
		super();
		initGUI();
		addAcciones();
		this.sistema = sistema;
		//Para mostrar la pantalla
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			thisLayout.setVerticalGroup(thisLayout.createParallelGroup());
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup());
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Sistema de GAS");
			{
				jMenuPrincipal = new JMenuBar();
				setJMenuBar(jMenuPrincipal);
				{
					jmCliente = new JMenu();
					jMenuPrincipal.add(jmCliente);
					jmCliente.setText("Cliente");
					{
						jmiSelectCliente = new JMenuItem();
						jmCliente.add(jmiSelectCliente);
						jmiSelectCliente.setText("Seleccionar Cliente");
					}
				}
				{
					jmMedicion = new JMenu();
					jMenuPrincipal.add(jmMedicion);
					jmMedicion.setText("Medicion");
					{
						jmiRegistrarMedicion = new JMenuItem();
						jmMedicion.add(jmiRegistrarMedicion);
						jmiRegistrarMedicion.setText("Registrar Medicion");
					}
				}
				{
					jmImpuestoTarifa = new JMenu();
					jMenuPrincipal.add(jmImpuestoTarifa);
					jmImpuestoTarifa.setText("Impuestos & Tarifas");
					{
						jmiImpuestoTarifa = new JMenuItem();
						jmImpuestoTarifa.add(jmiImpuestoTarifa);
						jmiImpuestoTarifa.setText("Modificar Impuestos & Tarifas");
					}
				}
				{
					jmFacturacion = new JMenu();
					jMenuPrincipal.add(jmFacturacion);
					jmFacturacion.setText("Facturacion");
					{
						jmiGenerarFacturacion = new JMenuItem();
						jmFacturacion.add(jmiGenerarFacturacion);
						jmiGenerarFacturacion.setText("Generar Facturacion");
					}
				}
				{
					jmReportes = new JMenu();
					jMenuPrincipal.add(jmReportes);
					jmReportes.setText("Reportes");
				}
				{
					jmSalir = new JMenu();
					jMenuPrincipal.add(jmSalir);
					jmSalir.setText("Salir");
					{
						jmiSalir = new JMenuItem();
						jmSalir.add(jmiSalir);
						jmiSalir.setText("Salir del Sistema");
					}
				}
			}
			pack();
			this.setSize(535, 436);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	private void addAcciones(){
		
		jmiSelectCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if (pSelectCliente == null){
					pSelectCliente = new SelectCliente_vw(sistema);
				}
			}
		});
		
		jmiRegistrarMedicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if (pMedicion == null){
					pMedicion = new Medicion_vw(sistema);
				}
			}
		});
		
		jmiImpuestoTarifa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if (pImpuestoTarifa == null){
					pImpuestoTarifa = new ImpuestoTarifa_vw(sistema);
				}
			}
		});
		
		jmiGenerarFacturacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(new PopUp_vw(), Util.Textos.CONFIRMAR_FACTURACION, Textos.CONFIRMAR, JOptionPane.YES_NO_OPTION);
				if(respuesta == JOptionPane.YES_OPTION){
					if(sistema.facturar()){
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.FACTURACION_OK, Textos.AVISO, JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(new PopUp_vw(), 
								Textos.FACTURACION_OK, Textos.ERROR, JOptionPane.ERROR_MESSAGE);
					}
						
				}
			}
		});
		
		jmiSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
