class ImprimeMultiplos {
	
	public static void main(String[] args){
		
		int i=1;
		
		//Supondo que 'i' seja igual a 987. N�o seria necess�rio entrar no while.
		//Por�m, usando o do while � garantido que sempre uma vez esse la�o
		//ser� executado.
		do{
			
			if(i%3==0){
				System.out.println(i);
			}

			i++;
			
		}while(i<=100);
		
	}

}