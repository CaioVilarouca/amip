package entites;

import java.util.ArrayList;
import java.util.List;

public class ListMIP {
	private List <ManipulateData> list = new ArrayList<>();

	
	public void addList(ManipulateData manipulateData) {
		list.add(manipulateData);
	}
	
	public void listPrint() {
		for (ManipulateData x : list) {
			System.out.println(x);
		}
		for (ManipulateData x : list) {
			if (x.quantityRemains != null) {
				System.out.println(x.quantityRemains);
			}
		}		
	
	}
}
