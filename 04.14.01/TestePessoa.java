class TestePessoa{
	
	public static void main(String[] args){
		
		Pessoa pessoaUm = new Pessoa();
		Pessoa pessoaDois = new Pessoa();
		Pessoa pessoaTres = new Pessoa();
		Pessoa pessoaQuatro = new Pessoa();
		Pessoa pessoaCinco = new Pessoa();
		
		pessoaUm.nome = "Adriano";
		pessoaUm.idade = 10;
		
		pessoaDois.nome = "Rivaldo";
		pessoaDois.idade = 15;
		
		pessoaTres.nome = "Marimar";
		pessoaTres.idade = 20;
		
		pessoaQuatro.nome = "Ikki";
		pessoaQuatro.idade = 25;
		
		pessoaCinco.nome = "Gustavo";
		pessoaCinco.idade = 30;
		
		pessoaUm.fazAniversario();
		pessoaDois.fazAniversario();
		pessoaTres.fazAniversario();
		pessoaQuatro.fazAniversario();
		pessoaCinco.fazAniversario();
		
	}
	
}