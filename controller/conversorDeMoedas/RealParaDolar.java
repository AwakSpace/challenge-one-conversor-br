package conversorDeMoedas;

public class RealParaDolar implements Moedas {

	@Override
	public double converte(double valor) {
		// TODO Auto-generated method stub
		return valor * 0.2;
	}
	
	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		// TODO Auto-generated method stub
		return "O valor da conversão é de US$" + valorConvertido;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "De Reais a Doláres";
	}

}
