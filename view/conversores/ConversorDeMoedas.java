package conversores;

import javax.swing.JOptionPane;
import conversorDeMoedas.*;
import menu.MenuDeOpcoes;

public class ConversorDeMoedas extends MenuDeOpcoes{

	private static Conversor[] conversores = {
			new RealParaDolar(),
			new RealParaEuro(),
			new RealParaLibra(),
			new RealParaYene(),
			new RealParaWonSulCoreano(),
			new DolarParaReal(),
			new EuroParaReal(),
			new LibraParaReal(),
			new YeneParaReal(),
			new WonSulCoreanoParaReal()
	};
	
	private Conversor escolherConversorDeMoedas(){
		return (Conversor) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro: ", "Moedas", JOptionPane.QUESTION_MESSAGE, null, conversores, conversores[0]);
	}
	
	@Override
	public void iniciarConversor() {
		boolean loop = true;
		
		while(loop) {
			try {
				double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor: ", "Input", JOptionPane.QUESTION_MESSAGE));
				
				Conversor conversor = this.escolherConversorDeMoedas();
				
				double valorConvertido = conversor.converte(input);
				
				JOptionPane.showMessageDialog(null, conversor.retornaStringDoValorConvertido(valorConvertido));
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
				
				if(resposta == JOptionPane.YES_OPTION) {
					loop = true;
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					loop = false;
				}
				
			} catch (java.lang.NullPointerException e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Conversor de Moedas?");
				
				if (resposta == JOptionPane.YES_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
					loop = false;
				}
				
			} catch (java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite um valor válido!!!");
				
			}
		}
	}
	
	@Override
	public String toString() {
		return "Conversor de Moedas";
	}
}
