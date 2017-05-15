package concreteFactory;
import abstractFactory.ComunicadorFactory;
import abstractProducts.Emissor;
import abstractProducts.Receptor;
import concreteProject.EmissorVisa;
import concreteProject.ReceptorVisa;

public class VisaComunicadorFactory extends ComunicadorFactory{
	
	public VisaComunicadorFactory() {
		
	}

	@Override
	public Emissor criarEmissor() {
		return new EmissorVisa();
	}

	@Override
	public Receptor criarReceptor() {
		return new ReceptorVisa();
	}


}
