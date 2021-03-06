package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		

		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner scannerLinha = new Scanner(linha);
			scannerLinha.useLocale(Locale.US);
			scannerLinha.useDelimiter(",");
			
			String valor1 = scannerLinha.next();
			int valor2 = scannerLinha.nextInt();
			int valor3 = scannerLinha.nextInt();
			String valor4 = scannerLinha.next();
			double valor5 = scannerLinha.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5 );
			
			scannerLinha.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores [3]);
		}
	}

}
