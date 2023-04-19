package menu;

import javax.swing.JOptionPane;

import conversores.ConversorDeMoedas;

public abstract class MenuDeOpcoes {

	public static MenuDeOpcoes[] conversores = {
			new ConversorDeMoedas()
	};
	
	public static MenuDeOpcoes escolherConversor(){
		return (MenuDeOpcoes) JOptionPane.showInputDialog(null, "Escolha uma opcão: ", "Menu", JOptionPane.QUESTION_MESSAGE, null, MenuDeOpcoes.conversores, MenuDeOpcoes.conversores[0]);
	}

	public abstract void iniciarConversor();
	
	@Override
	public abstract String toString();
}
