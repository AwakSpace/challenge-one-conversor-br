package conversorDeMoedas;

public interface Moedas {

	public double converte(double valor);
	public String retornaStringDoValorConvertido(double valorConvertido);
	@Override
	public String toString();
}
