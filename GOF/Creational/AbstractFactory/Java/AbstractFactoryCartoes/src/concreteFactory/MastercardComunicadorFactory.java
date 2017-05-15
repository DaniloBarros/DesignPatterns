package concreteFactory;
import abstractFactory.ComunicadorFactory;
import abstractProducts.Emissor;
import abstractProducts.Receptor;
import concreteProject.EmissorMastercard;
import concreteProject.ReceptorMastercard;

public class MastercardComunicadorFactory extends ComunicadorFactory{
	
	public MastercardComunicadorFactory(){
		
	}

	@Override
	public Emissor criarEmissor() {
		return new EmissorMastercard();
	}

	@Override
	public Receptor criarReceptor() {
		return new ReceptorMastercard();
	}
}
