package conversorDeMoedas;

public class RealParaWonSulCoreano implements Conversor {

	@Override
	public double converte(double valor) {
		return valor * 263.75;
	}

	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		return "O valor da conversão é de ₩" + valorConvertido;
	}

	@Override
	public String toString() {
		return "De Reais a Won Sul Coreano"; 
	}
}
