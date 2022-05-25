package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Ricardo");
		cliente.setProfissao("Dev");
		cliente.setCpf("444444444");
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		cc.setTitular(cliente);
		cc.deposita(250.2);

	

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
