package Controlador;

import Vista.MenuPrincipal_vw;

public class Inicio {

	private static Sistema sistema = null;
	
	public static void main(String[] args) {
		
		if(sistema == null){
			sistema = Sistema.getInstance();
		}
		MenuPrincipal_vw menu = new MenuPrincipal_vw(sistema);
	}
}
