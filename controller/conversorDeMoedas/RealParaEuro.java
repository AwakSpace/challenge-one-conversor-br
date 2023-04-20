package conversorDeMoedas;

public class RealParaEuro implements Moedas {

	@Override
	public double converte(double valor) {
		// TODO Auto-generated method stub
		return valor * 0.18;
	}

	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		// TODO Auto-generated method stub
		return "O valor da conversão é de €" + valorConvertido;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "De Reais a Euros";
	}
}
