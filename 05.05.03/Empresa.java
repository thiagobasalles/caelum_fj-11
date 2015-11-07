class Empresa{
	
	String nome;
	int cnpj;
	
	Funcionario[] funcionarios;

	void adiciona(Funcionario funcionario){
		
		int proximaPosicaoVazia = 0;
		
		while(true){
			
			if(proximaPosicaoVazia >= this.funcionarios.length){
				//Nesta verificação, quando o tamanho do array de funcionarios,
				//por exemplo: funcionarios[5], o ".length" é igual ou maior que 5,
				//e a variável proximaPosicaoVazia for igual ou maior que 5, significa
				// que não é mais possível adicionar no array algo. Pois para adicionar
				// neste exemplo de array igual ou maior que 5, a última posição é 4. E a primeira é 
				//o 0. Então, se proximaPosicaoVazia está igual ou maior que 5, significa que o array está cheio.
				//Tente entender este caso, pois é importante.

				System.out.println("Não existe posição vazia no array.");
				break;
				
			}else if((this.funcionarios[proximaPosicaoVazia] == null)){
				
				this.funcionarios[proximaPosicaoVazia] = funcionario;
				break;
				
			}else{
				
				proximaPosicaoVazia++;
				
			}
			
		}
		
	}

}