class Funcionario{
	
	public String nome;
	public String departamento;
	public double salario;
	public String dataEntradaTrabalho;
	public String rg;
	
	
	
	public void recebeAumento(double aumento){
		
		this.salario = this.salario + aumento;
		
	}
	
	public double calculaGanhoAnual(){
		
		return (this.salario * 12);
		
	}
	
}