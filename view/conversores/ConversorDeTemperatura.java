package conversores;

import javax.swing.JOptionPane;

import conversorDeTemperatura.*;
import menu.MenuDeOpcoes;

public class ConversorDeTemperatura extends MenuDeOpcoes {

	private Temperatura escolherConversorDeTemperatura(Temperatura[] conversores){
		return (Temperatura) JOptionPane.showInputDialog(null, "Qual o grau a ser convertido: ", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, conversores, conversores[0]);
	}
	
	@Override
	public void iniciarConversor() {
		
		Temperatura[] conversores = {
				new GrausCelsius()
		};
		
		boolean loop = true;
		
		while(loop) {
			try {
				Temperatura conversor = this.escolherConversorDeTemperatura(conversores);
				
				double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor: ", "Input", JOptionPane.QUESTION_MESSAGE));
				
				conversor.converte(valor);
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
				
				if(resposta == JOptionPane.YES_OPTION) {
					loop = true;
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}
				
			} catch (java.lang.NullPointerException e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Conversor de Moedas?");
				
				if (resposta == JOptionPane.YES_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
					break;
				}
				
			} catch (java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite um valor válido!!!");
				
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conversor de Temperatura";
	}

}
