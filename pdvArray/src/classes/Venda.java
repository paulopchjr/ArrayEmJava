package classes;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Long id;
	private String data;
	private List<Produto>produtos = new ArrayList<Produto>();
	private int []caixa = {1,2,3,4};
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
	
	public int[] getCaixa() {
		return caixa;
	}
	public void setCaixa(int[] caixa) {
		this.caixa = caixa;
	}
	
	public double valorTotalCompra() {
		
		
		double valor = 0.0;
		
		for (Produto produto : produtos) {
			valor += produto.getPreco();
		}
		
		return valor;
		
	}	
	
	public String ImprimeProduto() {
		String prod = "";
		
		for (Produto produto : produtos) {
			prod += "Descrição: "+ produto.getDescricao() + " Valor Unitário: " + produto.getPreco();
			prod += "\n";
		}
		
		return "Caixa:" + teste() +"\n" + prod + "\n" + "total: " + valorTotalCompra();
		
	}

	public int teste() {
		int c = 0;
		for (int i : caixa) {
			c = i;
		}
		return c;
	}

	
	
	

}
