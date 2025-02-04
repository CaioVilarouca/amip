package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entites.ManipulateData;
import entites.Product;

public class Program {
	public static void main(String[] args) {
		String url = "/home/caio/eclipse-workspace/amip/amip/mip.csv";


		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
		
		// Try with resources
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url))){
			String line = bufferedReader.readLine();// read line end CSV
			
			line = bufferedReader.readLine();

			while(line != null) {
				String[] separationComma = line.split(";");
				
				int consico = Integer.parseInt(separationComma[0]);
				double quantity = Double.parseDouble(separationComma[2]);
				double value = Double.parseDouble(separationComma[3]);
				double stock = Double.parseDouble(separationComma[4]);
				
				line = bufferedReader.readLine();

				Product product = new Product(consico, separationComma[1],value);
				ManipulateData manipulateData = new ManipulateData(product, quantity, stock);
				manipulateData.verificationRemains();

			}
		} catch (IOException e) {// Generic 
			System.out.print("Error " + e.getMessage());
		}
	
	}
}
