
public class Cliente {
	public static void main(String[] args){
		Emissor emissor1 = new EmissorEmail();
		emissor1.envia("Pagamento 1");
		
		Emissor emissor2 = new EmissorSMS();
		emissor2.envia("Pagamento 2");
	}
}
