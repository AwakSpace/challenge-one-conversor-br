package conversorDeMoedas;

public class YeneParaReal implements Moedas {

	@Override
	public double converte(double valor) {
		// TODO Auto-generated method stub
		return valor * 0.037;
	}

	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		// TODO Auto-generated method stub
		return "O valor da conversão é de R$" + valorConvertido;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "De Yenes a Reais";
	}
}
