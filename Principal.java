import java.util.Collections;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Infome o limite do cartão: ");
		double limite = leitura.nextDouble();
		
		CartãoDeCredito cartão = new CartãoDeCredito(limite);
		
		int sair = 1;
		while(sair != 0) {
			System.out.println("Informe a descrição da compra: ");
			String descricao = leitura.next();
			System.out.println("Informe o valor da compra: ");
			double valor = leitura.nextDouble();
			
			Compra compra = new Compra(descricao, valor);
			boolean compraRealizada = cartão.LancaCompra(compra);
			
			if(compraRealizada) {
				System.out.println("Compra efetuada com sucesso");
				System.out.println("Inform 1 para continurar comprando ou 0 para sair");
				sair = leitura.nextInt();
				
			} else {
				System.out.println("Compra não realizada\n");
				sair = 0;
				}
			}	
		System.out.println("******************");
		System.out.println("Compras realizadas\n");
		
		Collections.sort(cartão.getCompras());
		
		for(Compra item: cartão.getCompras()) {
			System.out.println("Descrição: " + item.getDescricao());
			System.out.println("Valor: " + item.getValor());
		}
		System.out.println("\n*******************");
		
		System.out.println("\nSaldo do Cartão: " + cartão.getSaldo());
	   }
		
		
	}

