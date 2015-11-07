class TestaEmpresa{
	
	public static void main (String[] args)	{
		
		Empresa empresa;
		empresa = new Empresa();
		
		empresa.funcionarios = new Funcionario[10];
		
		Funcionario funcionarioUm = new Funcionario();
		Funcionario funcionarioDois = new Funcionario();
		Funcionario funcionarioTres = new Funcionario();
		
		funcionarioUm.nome = "Thiago";
		
		funcionarioDois.nome = "Slardar";
		
		funcionarioTres.nome = "Mirana";
		
		empresa.adiciona(funcionarioUm);
		empresa.adiciona(funcionarioDois);
		empresa.adiciona(funcionarioTres);
		
		for(int i = 3; i<10; i++){
			
			Funcionario funcionario = new Funcionario();
			
			funcionario.nome = "Meepo";
			
			empresa.adiciona(funcionario);
			
		}
		
		for(int i=0; i<empresa.funcionarios.length; i++){
			
			System.out.println(empresa.funcionarios[i].nome);
			
		}
		
	}
	
}