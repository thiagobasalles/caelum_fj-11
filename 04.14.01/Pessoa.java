class Pessoa{
	
	public String nome;
	public int idade;
	
	public void fazAniversario(){
		
		System.out.print(this.nome + " faz anivers�rio. Antes tinha " + this.idade + " anos.");
		
		//Este trecho de c�digo abaixo � equivalente a: this.idade = this.idade + 1;
		this.idade += 1;
		
		System.out.println(" Agora tem " + this.idade + " anos.");
		
	}
	
}