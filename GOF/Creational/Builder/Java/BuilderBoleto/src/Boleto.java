public interface Boleto {
	String getSacado();
	String getCedente();
	double getValor();
	int getNumero();
	int getCodigoDeBarras();
	
	String toString();
}
