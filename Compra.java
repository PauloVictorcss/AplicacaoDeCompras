
public class Compra implements Comparable<Compra>{
	
	private String descricao;
	private double valor;
	
	public Compra(String nome, double valor) {
		this.descricao = nome;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Compra: descrição = " + descricao + " --" +
				" Valor = " + valor;
	}

	@Override
	public int compareTo(Compra outraCompra) {
		return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
	}

}
