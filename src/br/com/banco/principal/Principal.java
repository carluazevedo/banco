package br.com.banco.principal;

import br.com.banco.*;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		System.out.println(cc.getSaldo());
		System.out.println(cc.calculaTributos());
		cc.atualiza();
		System.out.println(cc.getSaldo());

		Tributavel t = cc;
		System.out.println(t.calculaTributos());

		Tributavel sv = new SeguroDeVida();
		System.out.println(sv.calculaTributos());
	}
}
