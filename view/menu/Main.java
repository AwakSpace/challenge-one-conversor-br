package menu;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		boolean loop = true;
		
		while(loop) {
			try {
				MenuDeOpcoes conversor = MenuDeOpcoes.escolherConversor();
				conversor.iniciarConversor();
				loop = false;
			} catch (Exception e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar o programa ?");
				if(resposta == JOptionPane.YES_OPTION) {
					loop = false;
				} 
			}
		}
	}
}
