
public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		int mediaMensal = gastosTrimestre/3;
		
		System.out.println("Os gastos dos três meses iniciais são de: R$" + gastosTrimestre);
		
		System.out.println("A média mensal dos três primerios meses do ano são de: R$" + mediaMensal);

	}

}