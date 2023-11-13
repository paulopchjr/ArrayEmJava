package principal;

import javax.swing.JOptionPane;

public class AulaArray04 {
	
	public static void main(String[] args) {
		
		String posicoesArray = JOptionPane.showInputDialog("Quantas posições tem o array?");
		
		double[] notas = new double[Integer.parseInt(posicoesArray)];
		
		for(int posicao = 0; posicao < notas.length; posicao++) {
			String valor = JOptionPane.showInputDialog("Qual é o valor da posição = "+ posicao);
			notas[posicao] = Double.valueOf(valor); // recebendo o valor da nota na posicao do array
		}
		
		
		// Recuperando os dados dentro do array
		for(int pos =0; pos < notas.length; pos++) {
			System.out.println("O valor da "+pos+" é = "+notas[pos]);
		}
	}

}
