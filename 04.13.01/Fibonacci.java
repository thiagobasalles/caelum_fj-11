class Fibonacci{
	
	public int calculaFibonacci(int numero){
		
		if (numero==0){
			
			return 0;
			
		}else if(numero==1){
			
			return 1;
			
		}else{
			
			return (calculaFibonacci(numero-2) + calculaFibonacci(numero-1));
			
		}
		
	}
	
}