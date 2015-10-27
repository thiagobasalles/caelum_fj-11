class Funcionario{
	
	public String nome;
	public String departamento;
	public double salario;
	public Data dataEntradaTrabalho;
	public String rg;
	
	
	
	public void recebeAumento(double aumento){
		
		this.salario = this.salario + aumento;
		
	}
	
	public double calculaGanhoAnual(){
		
		return (this.salario * 12);
		
	}
	
	public void mostra(){
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de entrada no trabalho: " + this.dataEntradaTrabalho.dia + "/" + this.dataEntradaTrabalho.mes + "/" + this.dataEntradaTrabalho.ano);
		System.out.println("RG: " + this.rg);
		
	}
	
}