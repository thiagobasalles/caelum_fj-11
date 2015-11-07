class Empresa{
	
	String nome;
	int cnpj;
	
	Funcionario[] funcionarios;

	void adiciona(Funcionario funcionario){
		
		int proximaPosicaoVazia = 0;
		boolean encontrouPosicaoVazia = false;
		
		while(encontrouPosicaoVazia==false){
			
			if(this.funcionarios[proximaPosicaoVazia] == null){
				
				encontrouPosicaoVazia = true;
				
			}else if(this.funcionarios.length == proximaPosicaoVazia){
				//Nesta verificação, quando o tamanho do array de funcionarios,
				//por exemplo: funcionarios[5], o ".length" é igual a 5,
				//e a variável proximaPosicaoVazia for igual a 5, significa
				// que não é mais possível adicionar no array algo. Pois para adicionar
				// neste exemplo de array igual a 5, a última posição é 4. E a primeira é 
				//o 0. Então, se proximaPosicaoVazia está igual a 5, significa que o array está cheio.
				//Tente entender este caso, pois é importante.

				break;
				
			}else{
				
				proximaPosicaoVazia++;
				
			}
			
		}
		
		if(encontrouPosicaoVazia == false){
			
			System.out.println("Não existe posição vazia no array.");
			
		}else{
			
			this.funcionarios[proximaPosicaoVazia] = funcionario;
			
		}
		
	}

}