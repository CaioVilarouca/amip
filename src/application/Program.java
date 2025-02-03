package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entites.Product;
import entites.VerificationData;

public class Program {
	public static void main(String[] args) {
		File fileCVS = new File("/home/caio/eclipse-workspace/amip/amip/mip.csv");

		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
		
		try {
			Scanner scanner = new Scanner(fileCVS);
			scanner.nextLine();// BREAK na primeira linha
			
			while(scanner.hasNext()) {
				String fileLine = scanner.nextLine();
				String[] separationComma = fileLine.split(",");
				
				int consico = Integer.parseInt(separationComma[0]);// Consico
				double amount = Double.parseDouble(separationComma[2]);// Quantidade a quebra
				double value = Double.parseDouble(separationComma[3]);// Preço de custo
				double stock = Double.parseDouble(separationComma[4]);// Estoque Atual

				Product product = new Product(consico, separationComma[1],value);
				VerificationData vericationData = new VerificationData(product, amount, stock);
				System.out.println(vericationData);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
		}
	}
}
