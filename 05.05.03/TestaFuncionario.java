class TestaFuncionario{
	
	public static void main (String[] args)	{
		
		Funcionario funcionario;
		
		funcionario = new Funcionario();
		
		Data dataDeEntradaNoTrabalho;
		
		dataDeEntradaNoTrabalho = new Data();
		
		dataDeEntradaNoTrabalho.dia = 01;
		dataDeEntradaNoTrabalho.mes = 01;
		dataDeEntradaNoTrabalho.ano = 2000;
		
		funcionario.nome = "Danilo";
		funcionario.salario = 100;
		funcionario.dataEntradaTrabalho = dataDeEntradaNoTrabalho;
		
		funcionario.mostra();
		
	}
	
}