package abstractFactory;

import abstractProducts.Emissor;
import abstractProducts.Receptor;
import aplicacao.Configuracao;
import concreteFactory.MastercardComunicadorFactory;
import concreteFactory.VisaComunicadorFactory;

public abstract class ComunicadorFactory {
	public static ComunicadorFactory obterFactory(){
		switch(Configuracao.obterBandeiraAtual()){
		case "Visa":
			return new VisaComunicadorFactory();
		case "Mastercard":
			return new MastercardComunicadorFactory();
		default:
			return null;
		}
	}	
	
	public abstract Emissor criarEmissor();
	public abstract Receptor criarReceptor();
}