package menu;

import javax.swing.JOptionPane;

import conversores.ConversorDeMoedas;
import conversores.ConversorDeTemperatura;

public class Main {

	public static void main(String[] args) {
		
		MenuDeOpcoes[] opcoesDoMenu = {
				new ConversorDeMoedas(),
				new ConversorDeTemperatura()
		};
		
		boolean loop = true;
		
		while(loop) {
			try {
				MenuDeOpcoes conversor = MenuDeOpcoes.escolherConversor(opcoesDoMenu);
				conversor.iniciarConversor();
				loop = false;
			} catch (Exception e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar o programa ?");
				if(resposta == JOptionPane.YES_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
					loop = false;
				} 
			}
		}
	}
}
