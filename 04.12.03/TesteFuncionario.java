class TesteFuncionario{
	
	public static void main (String[] args)	{
		
		Funcionario funcionario;
		
		funcionario = new Funcionario();
		
		//Aqui, iremos alimentar os atributos da classe;
		//Quando eu digo classe, estou me referindo as vari�veis que est�o um degrau abaixo do escopo da classe.
		//Podemos fazer isso, pois elas s�o p�blicas. Ou seja; qualquer classe pode alterar o valor dos atributos delas.(Isso � bom? Reflita!)
		funcionario.nome = "Thiago";
		funcionario.departamento = "Vendas";
		funcionario.salario = 987.65;
		funcionario.dataEntradaTrabalho = "01/01/2000";
		funcionario.rg = "1234567890";
		
		double resultadoGanhoAnual = funcionario.calculaGanhoAnual();
		
		System.out.println("O ganho anual antes do aumento � de :" + resultadoGanhoAnual);
		
		funcionario.recebeAumento(12.35);
		
		resultadoGanhoAnual = funcionario.calculaGanhoAnual();
		
		System.out.println("O ganho anual depois do aumento � de :" + resultadoGanhoAnual);
		
	}
	
}