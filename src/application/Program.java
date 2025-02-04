package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import entites.Product;
import entites.ManipulateData;

public class Program {
	public static void main(String[] args) {
		File fileCVS = new File("/home/caio/eclipse-workspace/amip/amip/mip.csv");
		Scanner scanner = null;

		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
		
		try {
			scanner = new Scanner(fileCVS);
			scanner.nextLine();// BREAK one line
			
			while(scanner.hasNextLine()) {
				String fileLine = scanner.nextLine();
				System.out.println(fileLine);
				//String[] separationComma = fileLine.split(";");
				
				
				//int consico = Integer.parseInt(separationComma[0]);
				//double quantity = Double.parseDouble(separationComma[2]);
				//double value = Double.parseDouble(separationComma[3]);
				//double stock = Double.parseDouble(separationComma[4]);

				//Product product = new Product(consico, separationComma[1],value);
				//ManipulateData manipulateData = new ManipulateData(product, quantity, stock);
				//System.out.println(manipulateData);
			}
		} catch (IOException e) {// Generic 
			e.getMessage();
		}
		finally {
			if(scanner != null) {
				scanner.close();
			}
		}
	}
}
