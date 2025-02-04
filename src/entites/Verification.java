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

	@Override
	public String toString() {
		return product + "," + quantity + "," + stock;
	}
	
}
