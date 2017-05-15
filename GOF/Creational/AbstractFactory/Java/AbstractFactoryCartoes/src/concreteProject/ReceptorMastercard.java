package concreteProject;

import abstractProducts.Receptor;

public class ReceptorMastercard implements Receptor{

	@Override
	public void receberInformacaoPagamento() {
		System.out.println("Compra no cartão Mastercard Aceita");		
	}

}
