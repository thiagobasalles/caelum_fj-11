
public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		int mediaMensal = gastosTrimestre/3;
		
		System.out.println("Os gastos dos tr�s meses iniciais s�o de: R$" + gastosTrimestre);
		
		System.out.println("A m�dia mensal dos tr�s primerios meses do ano s�o de: R$" + mediaMensal);

	}

}