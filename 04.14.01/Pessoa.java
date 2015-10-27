class Pessoa{
	
	public String nome;
	public int idade;
	
	public void fazAniversario(){
		
		System.out.print(this.nome + " faz aniversário. Antes tinha " + this.idade + " anos.");
		
		//Este trecho de código abaixo é equivalente a: this.idade = this.idade + 1;
		this.idade += 1;
		
		System.out.println(" Agora tem " + this.idade + " anos.");
		
	}
	
}