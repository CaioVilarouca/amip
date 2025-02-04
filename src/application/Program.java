package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


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
				System.out.println(line);
				
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {// Generic 
			System.out.print("Error " + e.getMessage());
		}
		
		try {
			BufferedWriter urlCSV =  new BufferedWriter(new FileWriter("/home/caio/Área de trabalho/result.csv"));
			urlCSV.write(";Analise de Movimentação de Produtos (A-MIP)");
			urlCSV.write("\n\n Consico;Produto;QTED;Custo;Estoque");

			urlCSV.close();
		} catch (Exception e) {
			
		}
	}
}
