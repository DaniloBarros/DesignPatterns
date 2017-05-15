package aplicacao;

// Problema:
// Estabelecimentos comerciais normalmente oferecem aos clientes diversas opções de pagamento.
// Por exemplo, clientes podem efetuar pagamentos com dinheiro, cheque, cartões de crédito ou dé-
// bito, entre outros.
// Pagamentos com cartões são realizados por meio de uma máquina de cartão, oferecida e instalada
// por empresas como Cielo e Redecard. Geralmente, essa máquina é capaz de lidar com cartões
// de diferentes bandeiras (como Visa e Mastercard).
// Nosso objetivo é programar essas máquinas, isto é, desenvolver uma aplicação capaz de se comunicar
// com as diferentes bandeiras e registrar pagamentos.
// No momento do pagamento, a máquina de cartão deve enviar as informações relativas a transa-
// ção (como valor e senha) para a bandeira correspondente ao cartão utilizado. Além disso, a máquina
// deve aguardar uma resposta de confirmação ou recusa do pagamento.

import abstractFactory.ComunicadorFactory;
import abstractProducts.Emissor;
import abstractProducts.Receptor;

public class Cliente {	
	public static void main (String[] args){
		ComunicadorFactory factory = ComunicadorFactory.obterFactory();
		
		Receptor receptor = factory.criarReceptor();
		Emissor emissor = factory.criarEmissor();
		
		emissor.emitirDados();
		receptor.receberInformacaoPagamento();
	}
}
