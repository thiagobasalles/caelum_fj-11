class TestaCasa{
	
	public static void main(String[] args){
		
		Casa casa = new Casa();
		
		casa.pinta("Verde");
		
		System.out.println("Nesta casa, tem-se " + casa.quantasPortasEstaoAbertas() + " abertas.");
		
		casa.portaUm=true;
		
		System.out.println("Nesta casa, tem-se " + casa.quantasPortasEstaoAbertas() + " abertas.");
		
		casa.portaDois=true;
		
		System.out.println("Nesta casa, tem-se " + casa.quantasPortasEstaoAbertas() + " abertas.");
		
		casa.portaTres=true;
		
		System.out.println("Nesta casa, tem-se " + casa.quantasPortasEstaoAbertas() + " abertas.");
		
		casa.portaDois=false;
		
		System.out.println("Nesta casa, tem-se " + casa.quantasPortasEstaoAbertas() + " abertas.");
		
		casa.portaTres=false;
		
		System.out.println("Nesta casa, tem-se " + casa.quantasPortasEstaoAbertas() + " abertas.");
		
		System.out.println("A cor da casa é " + casa.cor);
		
	}
	
}