package entites;

import java.util.ArrayList;
import java.util.List;

public class ListMIP {
	private List <ManipulateData> listPurchase = new ArrayList<>();

	public List<ManipulateData> getListPurchase() {
		return listPurchase;
	}

	public void addList(ManipulateData manipulateData) {
		listPurchase.add(manipulateData);
	}
	
	public void printList() {
		for (ManipulateData x : listPurchase) {
			System.out.println(x);
		}
	}
}
