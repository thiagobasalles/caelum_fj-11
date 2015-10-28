class ImprimeMultiplos {
	
	public static void main(String[] args){
		
		int i=1;
		
		//Supondo que 'i' seja igual a 987. Não seria necessário entrar no while.
		//Porém, usando o do while é garantido que sempre uma vez esse laço
		//será executado.
		do{
			
			if(i%3==0){
				System.out.println(i);
			}

			i++;
			
		}while(i<=100);
		
	}

}