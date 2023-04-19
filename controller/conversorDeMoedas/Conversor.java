package conversorDeMoedas;

public interface Conversor {

	public double converte(double valor);
	public String retornaStringDoValorConvertido(double valorConvertido);
	@Override
	public String toString();
}
