
public class ImprimeFatoriais {

	public static void main(String[] args) {

		//Poderia ter economizado algumas variáveis. Porém, para o melhor entendimento
		//do que acontece abaixo(documentação), achei importante não fazer isso.
		
		long valorFatorial = 0;
		long guardaValorFatorialNumeroAnterior = 0;
		
		System.out.println("O fatorial de 0 é 1");
		guardaValorFatorialNumeroAnterior = 1;
		
		for(int i = 1; i <= 40; i++){
			
			valorFatorial = guardaValorFatorialNumeroAnterior * i;
			guardaValorFatorialNumeroAnterior = valorFatorial;
			System.out.println("O fatorial de " + i + " é (" + (i-1) + "!)*" + i + "=" + valorFatorial);
			
		}

	}

}