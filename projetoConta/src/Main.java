import br.fiap.conta.Conta;
import br.fiap.cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Conta [] contas = new Conta[3];
		

		contas[0] = new Conta(new Cliente("182234", "Vitor"), 2450);
		contas[1] = new Conta(new Cliente("124535", "Davi"), 1730);
		contas[2] = new Conta(new Cliente("587533", "Pedro"), 4680);
		
		for(Conta c:contas) {
			System.out.println(c.getDados());
		}
		
	}

}
