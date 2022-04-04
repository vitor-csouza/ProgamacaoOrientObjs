package br.fiap.conta;
import br.fiap.cliente.Cliente;

public class Conta {
	
	private Cliente cliente;
	private double saldo;

	public Conta(Cliente cliente, double saldo) {
		//super();
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getDados() {
		String dados = "";
		dados +="\nCPF: "+cliente.getCpf();
		dados += "\nNome: "+cliente.getNome();
		dados +="\nSaldo R$ "+saldo;
		return dados;
	}

	public void sacar(double valor) {
		if(valor<=saldo) {
			saldo-=valor;
		} else {
			System.out.println("Você não tem esse valor!");
		}
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
}
