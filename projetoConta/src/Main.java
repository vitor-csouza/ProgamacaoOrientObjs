import br.fiap.conta.Conta;
import br.fiap.cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Conta [] contas = new Conta[10];

		//Cliente cli1 = new Cliente("Vitor", "12234");
		//Cliente cli2 = new Cliente("Davi", "124535");
		//Cliente cli3 = new Cliente("Pedro", "57533");
		

		contas[0] = new Conta(new Cliente( "12234", "Vitor"), 2450);
		contas[1] = new Conta(new Cliente("124535", "Davi"), 1730);
		contas[2] = new Conta(new Cliente("57533", "Pedro"), 4680);

		System.out.println(contas[0].getDados());
		System.out.println(contas[1].getDados());
		System.out.println(contas[2].getDados());
		
	}

}
