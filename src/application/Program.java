package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entites.Product;

public class Program {
	public static void main(String[] args) {
		File fileCVS = new File("/home/caio/eclipse-workspace/amip/amip/mip.csv");
		String fileLine;
		int consico;
		double value;

		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
		
		try {
			Scanner scanner = new Scanner(fileCVS);
			scanner.nextLine();// BREAK na primeira linha
			
			while(scanner.hasNext()) {
				fileLine = scanner.nextLine();
				String[] separationComma = fileLine.split(",");
				
				consico = Integer.parseInt(separationComma[0]);
				value = Double.parseDouble(separationComma[2]);
				Product product = new Product(consico, separationComma[1],value);
				System.out.println(product);

			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
		}
	}
}
