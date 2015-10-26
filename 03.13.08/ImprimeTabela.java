public class ImprimeTabela {

	public static void main(String[] args) {
		
		int auxiliarJ;
		
		for(int i=1; i<=10; i++){
			
			System.out.print(i);
			
			for(int j=2; j<=i; j++){
				auxiliarJ = j*i;
				System.out.print(" " + auxiliarJ + " ");

			}
			
			System.out.println();
			
		}

	}

}