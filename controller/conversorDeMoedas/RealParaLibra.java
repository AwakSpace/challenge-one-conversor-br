package conversorDeMoedas;

public class RealParaLibra implements Conversor{

	@Override
	public double converte(double valor) {
		// TODO Auto-generated method stub
		return valor * 0.16;
	}

	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		// TODO Auto-generated method stub
		return "O valor da conversão é de £" + valorConvertido;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "De Reais a Libras";
	}
}
