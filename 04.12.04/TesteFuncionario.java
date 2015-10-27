class TesteFuncionario{
	
	public static void main (String[] args)	{
		
		Funcionario funcionarioUm;
		Funcionario funcionarioDois;
		
		funcionarioUm = new Funcionario();
		funcionarioDois = new Funcionario();
		
		funcionarioUm.nome = "Danilo";
		funcionarioUm.salario = 100;
		
		funcionarioDois.nome = "Danilo";
		funcionarioDois.salario = 100;
		
		funcionarioUm.mostra();
		funcionarioDois.mostra();
		
		if(funcionarioUm==funcionarioDois){
			
			System.out.println("Os funcionarios são iguais");
			
		}else{
			
			System.out.println("Os funcionarios são diferentes");
			
		}
		
	}
	
}