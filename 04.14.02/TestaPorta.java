class TestaPorta{

	public static void main(String[] args){
		
		Porta porta = new Porta();
		
		System.out.println("A porta está aberta? " + porta.estaAberta());
		
		porta.abre();
		
		System.out.println("A porta está aberta? " + porta.estaAberta());
		
		porta.fecha();
		
		System.out.println("A porta está aberta? " + porta.estaAberta());
		
		porta.abre();
		
		porta.pintar("Marrom");
		
		System.out.println("Qual é a cor da porta? " + porta.cor);
		
		porta.dimensaoX = 1;
		porta.dimensaoY = 3;
		porta.dimensaoZ = 10;
		
		System.out.println("Qual é a dimensão da porta? " + porta.dimensaoX + " metro de largura. " + porta.dimensaoY + " metros de altura. " + porta.dimensaoZ + " centimentos de profundidade.");
		
	}
	
}