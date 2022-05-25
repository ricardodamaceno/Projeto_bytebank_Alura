package br.com.bytebank.banco.teste;


import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficiente;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficiente {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);		
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		
		
		cc.transfere(10, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		

	}

}
