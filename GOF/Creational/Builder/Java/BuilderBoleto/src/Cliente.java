
public class Cliente {
	public static void main(String[] args){
		BoletoBuilder boletoBuilder = new BradescoBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}
}
