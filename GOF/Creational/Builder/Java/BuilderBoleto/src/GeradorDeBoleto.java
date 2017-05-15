

public class GeradorDeBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto (BoletoBuilder boletoBuilder){
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto() {
		this.boletoBuilder.buildSacado("Thiago Moreira");
		this.boletoBuilder.buildCedente("Tito Bertulucci");
		this.boletoBuilder.buildValor(500.58);
		this.boletoBuilder.buildNumero(1234567);
		this.boletoBuilder.buildCodigoDeBarras(987654);
		
		return this.boletoBuilder.getBoleto();
	}
}
