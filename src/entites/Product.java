package entites;

public class Product {
	private Integer id;
	private String name;
	private Double value;
	
	public Product(Integer id, String name, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return id + ";" + name + "; R$ " + value;
	}
	
	

}
