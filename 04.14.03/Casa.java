class Casa{
	
	public String cor;
	public boolean portaUm;
	public boolean portaDois;
	public boolean portaTres;
	
	
	
	public void pinta(String cor){
		
		this.cor = cor;
		
	}
	
	public int quantasPortasEstaoAbertas(){
		int contadorDePortasAbertas=0;
		
		//Esses "if's" podem ser um pouco confuso para quem não tem experiência. Mas é fácil de entender.
		//Os atributos "portaUm", "portaDois" e "portaTres" são do tipo boolean. Esse tipo só assume "true" ou "false".
		//Então, no "if" é verificado assim: "if(verdadeiro){faz algo}". Se o atributo não for verdadeiro ele não faz a operação.
		if(portaUm){
			
			contadorDePortasAbertas++;
			
		}
		if(portaDois){
			
			contadorDePortasAbertas++;
			
		}
		if(portaTres){
			
			contadorDePortasAbertas++;
			
		}
		
		return contadorDePortasAbertas;
		
	}
	
}