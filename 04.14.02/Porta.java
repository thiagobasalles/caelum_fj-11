class Porta{
	
	public boolean aberta;
	public String cor;
	public int dimensaoX;
	public int dimensaoY;
	public int dimensaoZ;
	
	
	
	public void abre(){
		
		this.aberta = true;
		
	}
	
	public void fecha(){
		
		this.aberta = false;
		
	}
	
	public void pintar(String cor){
		
		this.cor = cor;
		
	}
	
	public boolean estaAberta(){
		
		return this.aberta;
		
	}
	
}