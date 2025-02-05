package entites;

public class Product {
	private Integer id;
	private String name;
	protected Double value;
	
	public Product(Integer id, String name, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return id + "," + name + ",R$ " + value;
	}	

}
