package principal;

import javax.swing.JOptionPane;

import classes.Produto;
import classes.Venda;

public class Inicio {

	public static void main(String[] args) {

		String acao01 = JOptionPane.showInputDialog("Cliente cpf no cadastro ? S/N");
		if (acao01.equalsIgnoreCase("S") || acao01.equalsIgnoreCase("N")) {
			if (acao01.equalsIgnoreCase("S")) {
				String infocpf = JOptionPane.showInputDialog("Informe o seu cpf");
				System.out.println(infocpf);

			}
			// PASSANDO OS PRODUTOS
			Venda venda = new Venda();
			// LISTANDO AS VENDAS
			int continuarvenda = 0;
			while (continuarvenda == 0) {
				String caixaVenda = JOptionPane.showInputDialog("Qual caixa passar 1,2,3,4?");
				int[] numerocaixa = { Integer.parseInt(caixaVenda) };
				venda.setCaixa(numerocaixa);

				if (venda.teste() <= 0 || venda.teste() >= 5) {
					System.out.println("Não é possivel");
					break;
				} else {

					venda.setCaixa(numerocaixa);
					String qtdprod = JOptionPane.showInputDialog("Quantos produtos deseja passar ?");
					for (int x = 1; x <= Integer.parseInt(qtdprod); x++) {
						Produto produto = new Produto();
						String nomeProduto = JOptionPane.showInputDialog("Qual é o nome do Produto?");
						produto.setDescricao(nomeProduto);

						String valorProduto = JOptionPane
								.showInputDialog("Qual é o valor unitário do produto " + nomeProduto + " ? ");
						produto.setPreco(Double.parseDouble(valorProduto));
						venda.getProdutos().add(produto);

					}

					continuarvenda = JOptionPane.showConfirmDialog(null, "Deseja continuar a venda?");
				}
				
				
				System.out.println(venda.ImprimeProduto());
			}

		} else {
			System.out.print("saiu");
		}

	}

}
