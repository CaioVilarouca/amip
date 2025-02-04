package entites;

public class Product {
	private Integer id;
	private String name;
	protected Double value;
	
	public Product(Integer id, String name, Double value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getValue() {
		return value;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + " R$ " + value;
	}
	
	
}
