
public interface BoletoBuilder {
	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor(double valor);
	void buildNumero(int numero);
	void buildCodigoDeBarras(int codigoDeBarras);
	
	Boleto getBoleto();
}
