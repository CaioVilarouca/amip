package entites;

public class ManipulateData {
	protected Product product;
	protected Double quantity;
	protected Double quantityRemains;
	protected Double stock;

	public ManipulateData(Product product, Double quantity, Double stock) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.stock = stock;

	}
	public void verificationRemains() {
		if(quantity <= 9 || (quantity > 1000 && quantity < 5000) || (quantity > 100.0 && quantity < 1000)){
			quantityRemains = quantity;
		}
	}
	
	@Override
	public String toString() {
		return product + " "+ quantity + " " + stock;
	}
}
