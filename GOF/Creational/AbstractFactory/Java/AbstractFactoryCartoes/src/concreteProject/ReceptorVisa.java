package concreteProject;

import abstractProducts.Receptor;

public class ReceptorVisa implements Receptor{

	@Override
	public void receberInformacaoPagamento() {
		System.out.println("Compra no cartão Visa Aceita");
	}

}
