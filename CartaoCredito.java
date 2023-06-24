import java.util.List;
import java.util.ArrayList;

public class CartãoDeCredito {
	
	private double limite;
	private double saldo;
	private List<Compra> compras;
	
	
	public CartãoDeCredito(double limite) {
		this.limite = limite;
		this.saldo = limite;
		this.compras = new ArrayList<>();
	}
	
	public boolean LancaCompra(Compra compra) {
		if(this.saldo > compra.getValor()) {
			this.saldo -= compra.getValor();
			this.compras.add(compra);
			return true;
		} else {
			return false;
		}
	}


	public double getLimite() {
		return limite;
	}


	public double getSaldo() {
		return saldo;
	}


	public List<Compra> getCompras() {
		return compras;
	}
	
}
