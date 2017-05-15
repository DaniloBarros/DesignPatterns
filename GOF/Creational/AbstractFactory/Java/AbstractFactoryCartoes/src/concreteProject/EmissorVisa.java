package concreteProject;

import abstractProducts.Emissor;

public class EmissorVisa implements Emissor{

	@Override
	public void emitirDados() {
		System.out.println("Emitindo Dados Pagamento Visa");		
	}

}
