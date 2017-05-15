
public class BradescoBoletoBuilder implements BoletoBuilder {
	private String sacado;
	private String cedente;
	private double valor;
	private int numero;
	private int codigoDeBarras;	

	@Override
	public void buildSacado(String sacado) {		
		this.sacado = sacado;
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void buildNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void buildCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	@Override
	public Boleto getBoleto() {
		return new BradescoBoleto(sacado, cedente, valor, numero, codigoDeBarras);
	}
}
