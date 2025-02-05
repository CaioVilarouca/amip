package entites;

public class Verification {
	private Product product;
	private Integer quantity;
	private Integer stock;
	
	public Verification(Product product, Integer quantity, Integer stock) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.stock = stock;
	}

	public double valueList() {
		return product.value;
	}
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return product + "," + quantity + "," + stock;
	}

	
}
