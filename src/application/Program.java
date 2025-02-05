package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import entites.Mip;
import entites.Product;
import entites.Verification;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Mip mip = new Mip();
		String url = "/home/caio/eclipse-workspace/amip/amip/mip.csv";
		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
	
		double valueList = 0;
		
		// Try with resources
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url))){
			String line = bufferedReader.readLine();// read line end CSV
			line = bufferedReader.readLine();
			
			// Reader File
			while(line != null) {
				String[] separationComma = line.split(",");
				int consico = Integer.parseInt(separationComma[0]);
				int quantity = Integer.parseInt(separationComma[2]);
				double value = Double.parseDouble(separationComma[3]);
				int stock = Integer.parseInt(separationComma[4]);
				
				Product product = new Product(consico, separationComma[1], value);
				Verification verification = new Verification(product,quantity ,stock);
				mip.addList(verification);
				
				line = bufferedReader.readLine();
				
				valueList += verification.valueList();
			}
			System.out.println("File %100 verification");
		} catch (IOException e) {// Generic 
			System.out.print("Error " + e.getMessage());
		}
		
		try {
			// File CSV
			BufferedWriter urlCSV =  new BufferedWriter(new FileWriter("/home/caio/Área de trabalho/result.csv"));
			urlCSV.write(";Analise de Movimentação Interna de Produtos (A-MIP)");
			urlCSV.write("\n\n Consico;Produto;Custo;QTED;Estoque;");
			for (Verification x : mip.getList()) {
				urlCSV.write("\n" + x);
			}
			urlCSV.write("\n; ;R$ " + valueList);
			
			urlCSV.write("\n\n;                              Analise");
			urlCSV.write("\n;Produtos que são residuais");
			for (Verification x : mip.getList()) {
				if(x.getQuantity() <= 9) {
					urlCSV.write("\n" + x);
				}
			}
			urlCSV.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
