package menu;

import javax.swing.JOptionPane;

public abstract class MenuDeOpcoes {

	public static MenuDeOpcoes escolherConversor(MenuDeOpcoes[] opcoesDoMenu){
		return (MenuDeOpcoes) JOptionPane.showInputDialog(null, "Escolha uma opcão: ", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoesDoMenu, opcoesDoMenu[0]);
	}

	public abstract void iniciarConversor();
	
	@Override
	public abstract String toString();
}
