class TesteFuncionario{
	
	public static void main (String[] args)	{
		
		Funcionario funcionarioUm;
		Funcionario funcionarioDois;
		
		funcionarioUm = new Funcionario();
		
		Data dataDeEntradaNoTrabalho;
		
		dataDeEntradaNoTrabalho = new Data();
		
		dataDeEntradaNoTrabalho.dia = 01;
		dataDeEntradaNoTrabalho.mes = 01;
		dataDeEntradaNoTrabalho.ano = 2000;
		
		funcionarioUm.nome = "Danilo";
		funcionarioUm.salario = 100;
		funcionarioUm.dataEntradaTrabalho = dataDeEntradaNoTrabalho;
		

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