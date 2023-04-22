package conversorDeMoedas;

public class RealParaYene implements Moedas {

	@Override
	public double converte(double valor) {
		return valor * 26.87;
	}

	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		return "O valor da conversão é de ¥" + valorConvertido;
	}
	
	@Override
	public String toString() {
		return "De Reais a Yenes";
	}
}
