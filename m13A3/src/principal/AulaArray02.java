package principal;

public class AulaArray02 {
	
	public static void main(String[] args) {
		
		double[] notas = new double[4];
		
		
		notas[0] = 10;
		notas[1] = 9.5;
		notas[2] = 9;
		notas[3] = 8.5;

	
		
		/*Recuperando os valores do array*/
	for(int posicao =0; posicao < 4 ; posicao++) {
		System.out.println("O valor da posicção ("+posicao+")  do array , é igual a = "+notas[posicao]);
	}
		
		
	}

}
