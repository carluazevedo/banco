package br.com.banco;

public class ContaPoupanca extends Conta {

	private double taxa = 0.05;

	@Override
	public void atualiza() {
		double saldo = this.getSaldo();
		this.setSaldo(saldo += taxa * saldo);
	}
}
