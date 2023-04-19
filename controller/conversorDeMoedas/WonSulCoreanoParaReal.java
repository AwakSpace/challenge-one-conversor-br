package conversorDeMoedas;

public class WonSulCoreanoParaReal implements Conversor {

	@Override
	public double converte(double valor) {
		// TODO Auto-generated method stub
		return valor * 0.0038;
	}

	@Override
	public String retornaStringDoValorConvertido(double valorConvertido) {
		// TODO Auto-generated method stub
		return "O valor da conversão é de R$" + valorConvertido;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "De Won Sul Coreano a Reais";
	}
}
