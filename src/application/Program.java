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
			while(scanner.hasNext()) {
				fileLine = scanner.nextLine();
				System.out.println(fileLine);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
		}

	}
}
