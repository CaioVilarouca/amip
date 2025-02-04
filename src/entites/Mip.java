package entites;

import java.util.ArrayList;
import java.util.List;

public class Mip {
	private List <Verification> list = new ArrayList<>();

	public List<Verification> getList() {
		return list;
	}

	public void setList(List<Verification> list) {
		this.list = list;
	}
	
	public void addList(Verification verification) {
		list.add(verification);
	}
}
