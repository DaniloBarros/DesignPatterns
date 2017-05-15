package concreteProject;

import abstractProducts.Emissor;

public class EmissorMastercard implements Emissor{

	@Override
	public void emitirDados() {
		System.out.println("Emitindo Dados Pagamento Mastercard");		
	}

}
