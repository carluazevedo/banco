package br.com.banco;

public class ContaCorrente extends Conta implements Tributavel {

	private double taxa = 0.1;

	@Override
	public void atualiza() {
		double saldo = this.getSaldo();
		this.setSaldo(saldo += taxa * saldo);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
