class TesteFuncionario{
	
	public static void main (String[] args)	{
		
		Funcionario funcionarioUm;
		Funcionario funcionarioDois;
		
		funcionarioUm = new Funcionario();
		
		funcionarioUm.nome = "Danilo";
		funcionarioUm.salario = 100;

		funcionarioDois = funcionarioUm;
		
		funcionarioUm.mostra();
		funcionarioDois.mostra();
		
		if(funcionarioUm==funcionarioDois){
			
			System.out.println("Os funcionarios são iguais");
			
		}else{
			
			System.out.println("Os funcionarios são diferentes");
			
		}
		
	}
	
}