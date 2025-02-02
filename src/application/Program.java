package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File fileCVS = new File("/home/caio/eclipse-workspace/amip/amip/mip.csv");
		
		System.out.println("Analise de Movimentação de Produtos (A-MIP)\n");
		try {
			Scanner scanner = new Scanner(fileCVS);
			String line;
			while(scanner.hasNext()) {
				line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
		}
	}
}
