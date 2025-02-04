package entites;

public class ManipulateData {
	private Product product;
	private Double quantity;
	private Double stock;
	
	public ManipulateData(Product product, Double quantity, Double stock) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "VerificationData [product=" + product + ", quantity=" + quantity + ", stock=" + stock + "]";
	}
}
