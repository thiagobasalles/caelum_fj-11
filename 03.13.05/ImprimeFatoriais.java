
public class ImprimeFatoriais {

	public static void main(String[] args) {

		//Poderia ter economizado algumas vari�veis. Por�m, para o melhor entendimento
		//do que acontece abaixo(documenta��o), achei importante n�o fazer isso.
		
		long valorFatorial = 0;
		long guardaValorFatorialNumeroAnterior = 0;
		
		System.out.println("O fatorial de 0 � 1");
		guardaValorFatorialNumeroAnterior = 1;
		
		for(int i = 1; i <= 40; i++){
			
			valorFatorial = guardaValorFatorialNumeroAnterior * i;
			guardaValorFatorialNumeroAnterior = valorFatorial;
			System.out.println("O fatorial de " + i + " � (" + (i-1) + "!)*" + i + "=" + valorFatorial);
			
		}

	}

}