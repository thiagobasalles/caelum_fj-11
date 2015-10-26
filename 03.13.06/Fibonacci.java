
public class Fibonacci {
	
	public static void main(String[] args){

		int fibonacciAntipenultimo = 0;	//fibonacci de zero
		int fibonacciPenultimo = 1;	//fibonacci de um
		int fibonacciAtual = 0;
		int numeroFibonacci = 2;
		
		System.out.println("Fibonacci de 0 é 0");
		System.out.println("Fibonacci de 1 é 1");

		while(fibonacciAtual <=100){
			
			fibonacciAtual = fibonacciPenultimo + fibonacciAntipenultimo;
			fibonacciAntipenultimo = fibonacciPenultimo;
			fibonacciPenultimo = fibonacciAtual;
			
			System.out.println("Fibonacci de " + numeroFibonacci + " é " + fibonacciAtual);
			
			numeroFibonacci++;
			
		}
		
	}

}
