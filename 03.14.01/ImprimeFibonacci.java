class ImprimeFibonacci {

	public static void main(String[] args){

		int fibonacciAntipenultimo = 0;	//fibonacci de zero
		int fibonacciPenultimo = 1;	//fibonacci de um
		
		System.out.print("0 1 ");

		while(fibonacciPenultimo <=100){
			
			System.out.print(fibonacciPenultimo + fibonacciAntipenultimo + " ");
			
			fibonacciPenultimo = fibonacciPenultimo + fibonacciAntipenultimo;			
			fibonacciAntipenultimo = fibonacciPenultimo - fibonacciAntipenultimo;

		}
		
	}

}