public class BradescoBoleto implements Boleto {
	private String sacado;
	private String cedente;
	private double valor;
	private int numero;
	private int codigoDeBarras;	

	public BradescoBoleto(String sacado, String cedente, double valor, int numero, int codigoDeBarras) {
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.numero = numero;
		this.codigoDeBarras = codigoDeBarras;
	}

	@Override
	public String getSacado() {
		return this.sacado;
	}

	@Override
	public String getCedente() {
		return this.cedente;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public int getNumero() {
		return this.numero;
	}

	@Override
	public int getCodigoDeBarras() {
		return this.codigoDeBarras;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("--- Boleto Bradesco---\n\n");
		stringBuilder.append("Sacado: " + this.sacado + "\n");
		stringBuilder.append("Cedente: " + this.cedente + "\n");
		stringBuilder.append("Valor: R$ " + this.valor + "\n");
		stringBuilder.append("Numero: " + this.numero + "\n");
		stringBuilder.append("Código de Barras: " + this.codigoDeBarras + "\n");
		
		return stringBuilder.toString();		
	}	
}
