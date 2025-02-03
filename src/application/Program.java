package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File fileCVS = new File("/home/caio/eclipse-workspace/amip/amip/mip.csv");
		String fileLine;

		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
		
		try {
			Scanner scanner = new Scanner(fileCVS);
			scanner.nextLine();// BREAK na primeira linha
			
			while(scanner.hasNext()) {
				fileLine = scanner.nextLine();
				String[] separationComma = fileLine.split(",");
				
				System.out.println(separationComma[0]);
				System.out.println(separationComma[1]);
				System.out.println(separationComma[2]);
				System.out.println(separationComma[4]);

			}
			scanner.close();
		} catch (FileNotFoundException e) {
		}
	}
}
