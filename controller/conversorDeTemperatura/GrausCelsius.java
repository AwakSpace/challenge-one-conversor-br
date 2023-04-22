package conversorDeTemperatura;

import javax.swing.JOptionPane;

public class GrausCelsius implements Temperatura {

	private double paraF(double valor) {
		return (valor * 9/5) + 32;
	}
	
	@Override
	public void converte(double valor) {
		
		Object[] celsiusConvertido = {
				this.paraF(valor)
		};
		
		JOptionPane.showInputDialog(null, "Converter para qual temperatura: ", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, celsiusConvertido, celsiusConvertido[0]);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Graus Celsius";
	}
}
