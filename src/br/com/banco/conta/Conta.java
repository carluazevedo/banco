package br.com.banco.conta;

public abstract class Conta {

	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void atualiza();

	public void saca(double valor) {
		
	}
}
