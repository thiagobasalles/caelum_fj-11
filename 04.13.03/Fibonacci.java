class Fibonacci{
	
	public int calculaFibonacci(int numero){
		
		//Antes do "?" vem uma expressão. Depois do "?" e antes do ":" temos um verdadeiro para a expressão. E, depois do ":" temos um falso para a expressão.
		return (numero==1 || numero==0) ? numero : (calculaFibonacci(numero-2) + calculaFibonacci(numero-1));
		
	}
	
}